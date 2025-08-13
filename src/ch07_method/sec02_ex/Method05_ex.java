package ch07_method.sec02_ex;

import java.io.*;
import java.util.Scanner;

/**
 * 학생 성적 관리 프로그램
 * 기능
 * - 1. 학생 성적 입력 (이름, 국어, 영어, 수학
 * - 2. 학생 목록 출력 (번호, 이름 국어, 영어, 수학, 총점, 평균
 * - 3. 특정 학생 성적 수정
 * - 4. 특정 학생 삭제
 * - 5. 학생 검색
 * - 6. 프로그램 종료
 * <p>
 * 데이터 구조
 * String[] name: 학생 이름 저장
 * int[][] score: 국/영/수 점수 저장
 * int[] totals: 총점 저장
 * double[] avgs: 평균 저장
 * <p>
 * 최대 학생 수: MAX_STUDENT = 5
 * 학생수는 count로 관리
 */
public class Method05_ex {

    /**
     * 메뉴판 출력하고 입력값을 반환하는 메서드
     *
     * @return 입력값을 반환
     */
    public static int getMenu(Scanner scanner) {
        System.out.println("┌───────[성적 관리 프로그램]─────────┐");
        System.out.println("│   1. 입력                          │");
        System.out.println("│   2. 출력                          │");
        System.out.println("│   3. 수정                          │");
        System.out.println("│   4. 삭제                          │");
        System.out.println("│   5. 검색                          │");
        System.out.println("│   6. 출력2(총점순)                 │");
        System.out.println("│   7. 파일로 저장                   │");
        System.out.println("│   8. 파일 로드                     │");
        System.out.println("│   0. 종료                          │");
        System.out.println("└────────────────────────────────────┘");
        System.out.print("선택: ");
        int memu = scanner.nextInt();
        return memu;
    }

    // 이름, 점수(국영수), 총점, 평균점수
    public static int createStudent(int studentCount, String[] name, int[][] scores, int[] totals, double[] totalsAverages, Scanner scanner) {
        System.out.print("이름: ");
        name[studentCount] = scanner.next();
        System.out.print("국어: ");
        scores[studentCount][0] = scanner.nextInt();
        System.out.print("영어: ");
        scores[studentCount][1] = scanner.nextInt();
        System.out.print("수학: ");
        scores[studentCount][2] = scanner.nextInt();

        System.out.println("┌───────◆─────┐");
        System.out.println("│   생성 완료 │");
        System.out.println("└───────◆─────┘");
        studentCount++;

        calcSum(studentCount, scores, totals); // sum 계산
        calcAvg(studentCount, totalsAverages, totals); // avg 계산
        return studentCount;
    }

    // sum 계산 함수
    public static void calcSum(int studentCount, int[][] scores, int[] totals) {
//		System.out.println("하쿠생수: "+studentCount);
        int sum = 0;
        for (int i = 0; i < scores[studentCount - 1].length; i++) {
            sum += scores[studentCount - 1][i];
        }
        totals[studentCount - 1] = sum;

//		System.out.println("calcSum 함수 테스트");
//		for(int n : scores[0]) {
//			System.out.println(n);
//		}
//		System.out.println("함수 테스트 끝");
    }

    /**
     * 평균 계산 함수
     */
    public static void calcAvg(int studentCount, double[] totalsAverages, int[] totals) {
        double avg = totals[studentCount - 1] / 3.0;
        System.out.println("평균 테스트:" + avg);
        totalsAverages[studentCount - 1] = avg;
    }

    public static void getPrint(int studentCount, String[] name, int[][] scores, int[] totals, double[] totalsAverages, Scanner scanner) {
        System.out.print("번호\t이름\t국어\t영어\t수학\t총점\t평균\n");
        for (int i = 0; i < studentCount; i++) { // 학생 수 만큼 반복
            if (name[i] != null) {
                System.out.print((i + 1) + "\t");
                System.out.print(name[i] + "\t");
                // 국영수 출력
                for (int j = 0; j < scores[i].length; j++) { // scores[i].length = 3
                    System.out.print(scores[i][j] + "\t");
                }
                System.out.print(totals[i] + "\t");
                System.out.print(String.format("%.2f", totalsAverages[i]));
                System.out.println();

            }
        }
        System.out.println("┌───────◆──────┐");
        System.out.println("│   출력 완료  │");
        System.out.println("└───────◆──────┘");
    }

    public static boolean isValidUpdate(int updateNum, String[] name) {
        int idx = updateNum - 1;
        // 범위 안에 있는지 + 해당 번호가 존재하는지
        if (updateNum > MAX_STUDENT) { // 수정하려는 번호가 5이상
            System.out.println("┌───────────────◇───────────┐");
            System.out.println("│ 수정하려는 번호가 큽니다  │");
            System.out.println("└───────────────◇───────────┘");
            return false;
        }
        if (updateNum <= 0) {
            System.out.println("┌─────────────────────◇───────────────────┐");
            System.out.println("│ 수정하려는 번호가 0 이거나 음수입니다   │");
            System.out.println("└─────────────────────◇───────────────────┘");
            return false;
        }
        // 삭제한 경우 표시 X
        if (name[idx] == null) {
            System.out.println("┌────────────────◇────────────┐");
            System.out.println("│ 수정할려는 사람이 없습니다  │");
            System.out.println("└────────────────◇────────────┘");
            return false;
        }

        return true;
    }

    public static void updateStudent(String[] name, int[][] scores, int updateNum, Scanner scanner, int studentCount,
                                     int[] totals, double[] totalsAverages) {
        int idx = updateNum - 1;

        System.out.print("이름: ");
        name[idx] = scanner.next();
        System.out.print("국어: ");
        scores[idx][0] = scanner.nextInt();
        System.out.print("영어: ");
        scores[idx][1] = scanner.nextInt();
        System.out.print("수학: ");
        scores[idx][2] = scanner.nextInt();

        calcSum(studentCount, scores, totals); // sum 계산
        calcAvg(studentCount, totalsAverages, totals); // avg 계산

    }

    public static boolean checkStudent(int studentCount) {
        if (studentCount == 0) {
            System.out.println("┌──────────────────────◇───────────────────┐");
            System.out.println("│ 학생이 없습니다! 학생 추가가 필요합니다  │");
            System.out.println("└──────────────────────◇───────────────────┘");
            return true;
        }
        return false;
    }

    public static boolean checkSearchStudent(int studentCount, String[] name, String searchName) {
        for (int i = 0; i < studentCount; i++) {
            // null 부터 검사해야 됨 지운거 접근해서 NPE 발생함
            if (name[i] != null && name[i].contains(searchName)) {
                return true;
            }
        }
        return false;
    }

    public static void searchStudent(int studentCount, String[] name, String searchName, int[][] scores,
                                     int[] totals, double[] totalAverages) {
        System.out.print("번호\t이름\t국어\t영어\t수학\t총점\t평균\n");
        for (int i = 0; i < studentCount; i++) {
            if (name[i] != null && name[i].contains(searchName)) {
                System.out.print(i + 1 + "\t");
                System.out.print(name[i] + "\t");
                // 국영수 출력
                for (int j = 0; j < scores[i].length; j++) { // scores[i].length = 3
                    System.out.print(scores[i][j] + "\t");
                }
                System.out.print(totals[i] + "\t");
                System.out.print(String.format("%.2f", totalAverages[i]));
                System.out.println();
            }
        }
        System.out.println("┌───────◆──────┐");
        System.out.println("│ 검색 완료    │");
        System.out.println("└───────◆──────┘");
    }

    public static boolean isValidDelete(int deleteNum, String[] name) {
        int idxDelNum = deleteNum - 1;
        if (deleteNum > MAX_STUDENT) {
            System.out.println("┌──────────────◇──────────────┐");
            System.out.println("│ 삭제하려는 번호가 큽니다    │");
            System.out.println("└──────────────◇──────────────┘");
            return false;
        }
        if (deleteNum <= 0) {
            System.out.println("┌───────────────────────◇────────────────┐");
            System.out.println("│ 삭제하려는 번호가 0 이거나 음수입니다  │");
            System.out.println("└───────────────────────◇────────────────┘");
            return false;
        }

        if (name[idxDelNum] == null) {
            System.out.println("┌──────────────◇──────────────┐");
            System.out.println("│ 삭제할려는 사람이 없습니다  │");
            System.out.println("└──────────────◇──────────────┘");
            return false;
        }
        return true;
    }

    public static void deleteStudent(int deleteNum, String[] name, int[][] scores) {
        int idx = deleteNum - 1;
        name[idx] = null;
        for (int i = 0; i < scores[idx].length; i++) {
            scores[idx][i] = 0;
        }
        System.out.println("┌────────────────◆───────────┐");
        System.out.println("│ 삭제가 완료되었습니다!     │");
        System.out.println("└────────────────◆───────────┘");
    }

    public static void getExit() {
        isRunning = false;
        System.out.println("┌──────────────────◆──────────────┐");
        System.out.println("│ 프로그램이 종료되었습니다       │");
        System.out.println("└──────────────────◆──────────────┘");
    }

    public static void getErrorInput() {
        System.out.println("┌────────────────────◇──────────────────┐");
        System.out.println("│ 잘못입력셨습니다. 다시 입력해주세요   │");
        System.out.println("└────────────────────◇──────────────────┘");
    }

    public static int[] copyArray(int[] totals, int studentCount) {
        int temp = 0;
        int[] sortTemp = new int[MAX_STUDENT];

        // 배열 복사
        for (int i = 0; i < studentCount; i++) {
            sortTemp[i] = totals[i];
        }

        for (int i = 0; i < studentCount - 1; i++) {
            for (int j = 0; j < studentCount - 1 - i; j++) {
                // totals 0 > totals 1번 보다 큰 경우
                if (sortTemp[j] < sortTemp[j + 1]) {
                    temp = sortTemp[j];
                    sortTemp[j] = sortTemp[j + 1];
                    sortTemp[j + 1] = temp;
                }
            }
        }
        return sortTemp;
    }

    public static void getPrintOrderByTotals(int[] sortTemp, int studentCount, String[] name, int[][] scores,
                                             int[] totals, double[] totalAverages) {
        System.out.print("번호\t이름\t국어\t영어\t수학\t총점\t평균\n");
        for (int i = 0; i < studentCount; i++) { // 학생 수 만큼 반복
            if (name[i] != null && !name[i].equals("null")) {
                for (int j = 0; j < studentCount; j++) {
                    if (sortTemp[i] == totals[j]) {
                        System.out.print(j + 1 + "\t");
                        System.out.print(name[j] + "\t");
                        // 국영수 출력
                        for (int k = 0; k < scores[i].length; k++) {
                            System.out.print(scores[j][k] + "\t");
                        }
                        System.out.print(totals[j] + "\t");
                        System.out.print(String.format("%.2f", totalAverages[j]));
                        System.out.println();
                    }
                }
            }
        }
        System.out.println("┌───────◆────┐");
        System.out.println("│ 출력완료   │");
        System.out.println("└───────◆────┘");
    }

    public static File makeFileInstance() {
        // 1. 강의실 경로
        // String filePath = "D:\\java\\javaBasic\\src\\ch07_method\\sec02_ex\\data\\save.txt";

        // 2. 집_서피스프로_윈도우11
        String filePathSurface = "D:\\Project\\Study\\JavaBasicJourney\\src\\ch07_method\\sec02_ex\\data\\save.txt";

        return new File(filePathSurface); // File 객체 생성 및 반환
    }

    public static void writeFile(File file, int studentCount, String[] name, int[][] scores, int[] totals, double[] totalAverages) {
        try {
            if (!file.exists()) { // 파일이 존재하지 않으면
                file.createNewFile(); // 신규 파일 생성
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(file, false));

            // 저장
            for (int i = 0; i < studentCount; i++) {
                if (name[i] != null) {

                    bw.write(name[i]); // 학생 이름
                    bw.write(","); // 구분자
                    for (int j = 0; j < 3; j++) {
                        bw.write(String.valueOf(scores[i][j])); // 과목 3개
                        bw.write(","); // 구분자
                    }
                    bw.write(String.valueOf(totals[i])); // 총점
                    bw.write(",");
                    bw.write(String.valueOf(totalAverages[i]));
                    bw.newLine();
                } else {
                    bw.write("null");
                    bw.write(",");
                    for (int j = 0; j < 3; j++) {
                        bw.write("0");
                        bw.write(",");
                    }
                    bw.write("0");
                    bw.write(",");
                    bw.write("0.0");
                    bw.newLine();
                }
            }
            // 버퍼 및 스트림 뒷정리
            bw.flush(); // 버퍼의 남은 데이터 모두 쓰기
            bw.close(); // 스트림 종료
            System.out.println("┌──────────────◇────────────┐");
            System.out.println("│ 저장이 완료되었습니다     │");
            System.out.println("└──────────────◇────────────┘");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static int readFile(File fileRead, int studentCount, String[] name, int[][] scores, int[] totals, double[] totalAverages) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileRead));
            String line = null;
            String[] nameTemp = null;
            int tempIdx = 0;
            studentCount = 0;
            while ((line = br.readLine()) != null) {
//                System.out.println(line); // 테스트 코드
                nameTemp = line.split(",");
                if (!nameTemp[0].equals("null")) {
                    name[tempIdx] = nameTemp[0]; // 이름
                    scores[tempIdx][0] = Integer.parseInt(nameTemp[1]); // 국어
                    scores[tempIdx][1] = Integer.parseInt(nameTemp[2]); // 영어
                    scores[tempIdx][2] = Integer.parseInt(nameTemp[3]); // 수학
                    totals[tempIdx] = Integer.parseInt(nameTemp[4]);
                    totalAverages[tempIdx] = Double.parseDouble(nameTemp[5]);
                    tempIdx++;
                    studentCount++;
                } else {
                    name[tempIdx] = null;
                    scores[tempIdx][0] = 0;
                    scores[tempIdx][1] = 0;
                    scores[tempIdx][2] = 0;
                    totals[tempIdx] = 0;
                    totalAverages[tempIdx] = 0.0;
                    tempIdx++;
                    studentCount++;
                }
            }
            System.out.println("┌──────────────◇────────────┐");
            System.out.println("│ 로드가 완료되었습니다     │");
            System.out.println("└──────────────◇────────────┘");
            br.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return studentCount;
    }


    public static final int MAX_STUDENT = 5; // 총인원
    public static boolean isRunning = true;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentCount = 0;// 현인원
        // 2차원배열 : 이름, 국어, 영어, 수학
        String[] name = new String[MAX_STUDENT]; // 학생
        int[][] scores = new int[MAX_STUDENT][3]; // 각 학생 점수
        double[] totalAverages = new double[MAX_STUDENT]; // 각 학생의 평균
        int[] totals = new int[MAX_STUDENT]; // 각 학생의 총점

        while (isRunning) {
            int menu = getMenu(scanner);

            switch (menu) {
                case 1:
                    if (studentCount >= MAX_STUDENT) {
                        System.out.println("┌───────────◇────────────┐");
                        System.out.println("│ 학생 수를 초과했습니다 │");
                        System.out.println("└───────────◇────────────┘");
                        break;
                    }
                    studentCount = createStudent(studentCount, name, scores, totals, totalAverages, scanner);
                    break;
                case 2:
                    if (checkStudent(studentCount)) {
                        break;
                    }
                    getPrint(studentCount, name, scores, totals, totalAverages, scanner);
                    break;
                case 3:
                    if (checkStudent(studentCount)) {
                        break;
                    }
                    System.out.print("수정 번호:");
                    int updateNum = scanner.nextInt(); // 수정할 번호

                    if (isValidUpdate(updateNum, name)) {
                        updateStudent(name, scores, updateNum, scanner, studentCount, totals, totalAverages);
                        System.out.println("┌──────────────◇────────────┐");
                        System.out.println("│ 수정이 완료되었습니다     │");
                        System.out.println("└──────────────◇────────────┘");
                    }
                    break;
                case 4:
                    if (checkStudent(studentCount)) {
                        break;
                    }
                    System.out.print("몇번 삭제: ");
                    int deleteNum = scanner.nextInt(); // 삭제할 번호
                    if (isValidDelete(deleteNum, name)) {
                        deleteStudent(deleteNum, name, scores);
                    }
                    break;
                case 5:
                    if (checkStudent(studentCount)) {
                        break;
                    }
                    System.out.println("┌───────────────◆──────────────┐");
                    System.out.println("│ 검색할 이름을 입력하세요     │");
                    System.out.println("└───────────────◆──────────────┘");
                    System.out.print(">>> ");
                    String searchName = scanner.next();

                    if (checkSearchStudent(studentCount, name, searchName)) {
                        searchStudent(studentCount, name, searchName, scores, totals, totalAverages);
                    } else {
                        System.out.println("┌─────────────◆─────────┐");
                        System.out.println("│ 검색 결과가 없습니다  │");
                        System.out.println("└────────────◆──────────┘");
                    }
                    break;
                case 6:
                    if (checkStudent(studentCount)) {
                        break;
                    }
                    int[] sortTemp = copyArray(totals, studentCount);
                    getPrintOrderByTotals(sortTemp, studentCount, name, scores, totals, totalAverages);
                    break;
                case 7:
                    if (checkStudent(studentCount)) {
                        break;
                    }
                    // 파일 생성 및 저장
                    // 가져와야 될 변수
                    File file = makeFileInstance();
                    writeFile(file, studentCount, name, scores, totals, totalAverages);
                    break;
                case 8:
                    // 파일 읽고 매핑
                    File fileRead = makeFileInstance();
                    studentCount = readFile(fileRead, studentCount, name, scores, totals, totalAverages);
                    break;
                case 0:
                    getExit();
                    break;
                default: // 123450 제외 다른입력시
                    getErrorInput();
                    break;
            }
        }
        scanner.close();
    }

}
