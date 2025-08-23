package ch08_Class.sec05_ex.studentManagement;

import java.io.*;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ClassRoom {
    int studentCount;
    private final Student[] students;
    final int MAX_STUDENT = 5;

    // 객체 생성시
    public ClassRoom() {
        this.studentCount = 0;
        this.students = new Student[MAX_STUDENT];
    }

    // 생성한 학생수가 5이상이면 빠꾸시키기
    private boolean checkCreate() {
        if (studentCount >= MAX_STUDENT) {
            MessageBox.getExceedStudent();
            return true;
        }
        return false;
    }

    public void createStudent(Scanner sc) {
        if (checkCreate()) {
            return;
        }
//		inputValue(sc);
        Student st = inputValue(sc);
        // 1번
        if (st != null) {
            students[studentCount] = new Student(st.name, st.kor, st.eng, st.math);
            students[studentCount].calSum();
            students[studentCount].calAvg();
            studentCount++;
        }
    }

    public void getPrint() {
        if (checkStudent()) {
            return;
        }

        System.out.print("┌───────────────────────────────────────────────────────┐\n");
        System.out.print("│번호\t이름\t국어\t영어\t수학\t총점\t평균\t│\n");
        for (int i = 0; i < studentCount; i++) { // 학생 수 만큼 반복
//			System.out.println("테스트: " + students[studentCount - 1].name);

            if (students[i].name != null) {
                System.out.print("│");
                System.out.print((i + 1) + "\t");
                System.out.print(students[i].name + "\t");
                // 국영수 출력
                System.out.print(students[i].kor + "\t");
                System.out.print(students[i].eng + "\t");
                System.out.print(students[i].math + "\t");
                System.out.print(students[i].getTotal() + "\t");
                System.out.print(students[i].getAvg() + "\t|" + "\n");
            }
        }
        System.out.print("└───────────────────────────────────────────────────────┘\n");
        System.out.println("┌──────────┐");
        System.out.println("│  출력 완료  │");
        System.out.println("└──────────┘");
    }

    private boolean checkStudent() {
        if (studentCount == 0) {
            MessageBox.getEmptyStudent();
            return true;
        }
        return false;
    }

    private boolean checkUpdate(int updateNum, int idx) {
        if (updateNum > MAX_STUDENT || updateNum > studentCount) { // 수정 하려는 번호가 5이상
            System.out.println("┌────────────────────┐");
            System.out.println("│ 수정하려는 번호가 큽니다  │");
            System.out.println("└────────────────────┘");
            return false;
        }
        if (updateNum <= 0) {
            System.out.println("┌──────────────────────────────┐");
            System.out.println("│ 수정하려는 번호가 0 이거나 음수입니다   │");
            System.out.println("└──────────────────────────────┘");
            return false;
        }

        if (students[idx].name == null) {
            System.out.println("┌─────────────────────────┐");
            System.out.println("│ 삭제된 학생입니다.       │");
            System.out.println("└─────────────────────────┘");
            return false;
        }
        return true;

    }

    private Student inputValue(Scanner sc) {
        String tempName = "";
        int kor, eng, math = 0;
        try {
            System.out.print("이름: ");
            tempName = sc.next();

            if (tempName.equals("null")) {
                MessageBox.getNotFound();
                return null;
            } else {
                System.out.print("국어: ");
                kor = sc.nextInt();
                System.out.print("영어: ");
                eng = sc.nextInt();
                System.out.print("수학: ");
                math = sc.nextInt();
                return new Student(tempName, kor, eng, math);
            }

        } catch (Exception e) {
            System.out.println(e.toString());
            sc.nextLine();
            MessageBox.noticeInputTypeMiss();
        }
        return null;

    }

    public void updateStudent(Scanner sc) {
        if (checkStudent()) {
            return;
        }
        int updateNum = 0;
        int idx = 0;

        System.out.print("수정 번호:");
        try {
            updateNum = sc.nextInt(); // 수정할 번호
        } catch (InputMismatchException e) {
            MessageBox.noticeInputTypeMiss();
        }

        idx = updateNum - 1;

        if (checkUpdate(updateNum, idx)) {
            Student st = inputValue(sc);

            if (st != null) {
                // 실제 업데이트
                students[idx] = new Student(st.name, st.kor, st.eng, st.math);
                students[idx].calSum();
                students[idx].calAvg();
                MessageBox.updateComplete();
            }
        }

    }

    private boolean checkDelete(int deleteNum, int idx) {
        System.out.println("checkDelete가 받는 파라미터: " + deleteNum + ", idx: " + idx);
        if (deleteNum > MAX_STUDENT || deleteNum > studentCount) {
            System.out.println("┌─────────────────────┐");
            System.out.println("│ 삭제하려는 번호가 큽니다   │");
            System.out.println("└─────────────────────┘");
            return false;
        }
        if (deleteNum <= 0) {
            System.out.println("┌─────────────────────────────┐");
            System.out.println("│ 삭제하려는 번호가 0 이거나 음수입니다  │");
            System.out.println("└─────────────────────────────┘");
            return false;
        }
        if (students[idx].name == null) {
            System.out.println("┌─────────────────────────────┐");
            System.out.println("│ 삭제할려는 사람이 없습니다  │");
            System.out.println("└─────────────────────────────┘");
            return false;
        }
        return true;

    }

    public void deleteStudent(Scanner sc) {
        if (checkStudent()) return;

        int deleteNum = 0;
        int idx = 0;

        System.out.print("삭제할 번호: ");
        try {
            deleteNum = sc.nextInt(); // 삭제할 번호
            idx = deleteNum - 1;
        } catch (InputMismatchException e) {
            System.out.println(e);
            MessageBox.noticeInputTypeMiss();
            sc.nextLine();
            return;
        }
        System.out.println(idx);

        if (checkDelete(deleteNum, idx)) {
            // 삭제 로직 실행
            students[idx] = new Student(null, 0, 0, 0);
            students[idx].calSum();
            students[idx].calAvg();

            students[idx].printStudent();
            // 학생수 감소는 안시킴
            MessageBox.deleteComplete();
        }
    }

    private int[] checkSearchStudent(String searchName) {
        int[] temp = new int[studentCount];
        int count = 0;
        for (int i = 0; i < studentCount; i++) {
            // null 검사부터
            if (students[i].name != null && students[i].name.contains(searchName)) {
                temp[count++] = i;
            }
        }
//        int[] tt = Arrays.copyOf(temp, count);
//        System.out.println(Arrays.toString(tt));
        return Arrays.copyOf(temp, count); //검색된 개수만큼 잘라서 반환
    }

    public void searchStudent(Scanner sc) {
        if (checkStudent()) return;

        System.out.print("검색할 이름: ");
        String searchName = sc.next();

        int[] results = checkSearchStudent(searchName);
        if (results.length > 0) {
            System.out.print("┌───────────────────────────────────────────────────────┐\n");
            System.out.print("│번호\t이름\t국어\t영어\t수학\t총점\t평균\t│\n");
            for (int i = 0; i < studentCount; i++) {
                // null 검사부터
                if (students[i].name != null && students[i].name.contains(searchName)) {
                    System.out.print("|" + (i + 1) + "\t");
                    System.out.print(students[i].name + "\t");
                    System.out.print(students[i].kor + "\t");
                    System.out.print(students[i].eng + "\t");
                    System.out.print(students[i].math + "\t");
                    System.out.print(students[i].getTotal() + "\t");
                    System.out.print(students[i].getAvg() + "\t|" + "\n");
                }
            }
            System.out.print("└───────────────────────────────────────────────────────┘\n");
            MessageBox.searchComplete();
        } else {
            MessageBox.searchEmpty();
        }
    }

    private int[] copyTotals() {
        int temp = 0;
        int[] sortTemp = new int[MAX_STUDENT];
        int count = 0;

        // 1. 학생배열의 총점만 뽑아서 순차적으로 저장시킴(이름 null은 제외시켜 삭제된 학생은 X)
        for (int i = 0; i < studentCount; i++) {
            if (students[i].name != null) {
                sortTemp[i] = students[i].getTotal();
                count++;
            }
        }
//        System.out.println("dd: "+Arrays.toString(sortTemp));

        // 버블 정렬
        for (int i = 0; i < studentCount - 1; i++) {
            for (int j = 0; j < studentCount - 1 - i; j++) {
                if (sortTemp[j] < sortTemp[j + 1]) {
                    temp = sortTemp[j];
                    sortTemp[j] = sortTemp[j + 1];
                    sortTemp[j + 1] = temp;
                }
            }
        }
//        System.out.println(Arrays.toString(sortTemp));
//        int[] test = Arrays.copyOf(sortTemp, count);
//        System.out.println(Arrays.toString(test));

        return Arrays.copyOf(sortTemp, count);
    }

    public void getPrintOrderByTotal() {
        if (checkStudent()) return;

        int[] sortTemp = copyTotals();

        System.out.print("┌───────────────────────────────────────────────────────┐\n");
        System.out.print("│번호\t이름\t국어\t영어\t수학\t총점\t평균\t│\n");
        for (int i = 0; i < sortTemp.length; i++) { // 학생 수 만큼 반복
            for (int j = 0; j < studentCount; j++) {
                if (students[j].name != null && sortTemp[i] == students[j].getTotal()) {
                    System.out.print("|" + (j + 1) + "\t");
                    System.out.print(students[j].name + "\t");
                    System.out.print(students[j].kor + "\t");
                    System.out.print(students[j].eng + "\t");
                    System.out.print(students[j].math + "\t");
                    System.out.print(students[j].getTotal() + "\t");
                    System.out.print(students[j].getAvg() + "\t|" + "\n");
                }
            }
        }
        System.out.print("└───────────────────────────────────────────────────────┘\n");
        MessageBox.searchComplete();
    }

    private File makeFileInstance(String fileName) {
        // 3. 페도라
        String filePathFedora = "src/ch08_Class/sec05_ex/studentManagement/data/" + fileName + ".txt";

        return new File(filePathFedora); // File 객체 생성 및 반환
    }

    private File readFileInstance() {
        // data 폴더 경로
        String dirPath = "src/ch08_Class/sec05_ex/studentManagement/data";
        return new File(dirPath);
    }

    public void makeFile(Scanner sc) {
        if (checkStudent()) return;

        System.out.print("저장할 파일 이름을 입력해주세요.");
        String fileName = sc.next();
        System.out.println(fileName + ".txt 로 저장 하겠습니까? [y/N]: ");
        String isOk = sc.next();

        if (!isOk.equalsIgnoreCase("y")) {
            System.out.println("취소했습니다.");
            return;
        }

        // 파일 생성 및 저장
        File file = makeFileInstance(fileName);

        try {
            if (file.exists()) {
                System.out.println("이미 같은 이름의 파일이 있습니다. 덮어쓰겠습니까? [y/N]");
                String overWrite = sc.next();
                if (!overWrite.equalsIgnoreCase("y")) {
                    System.out.println("저장을 취소했습니다.");
                    return;
                }
            } else { // 파일이 존재하지 않으면
                file.createNewFile(); // 신규 파일 생성
            }

            BufferedWriter bw = new BufferedWriter(new FileWriter(file, false));

            // 저장
            for (int i = 0; i < studentCount; i++) {
                String line = "";
                if (students[i].name != null) {
                    bw.write(students[i].name); // 학생 이름
                    bw.write(","); // 구분자
                    bw.write(String.valueOf(students[i].kor));
                    bw.write(","); // 구분자
                    bw.write(String.valueOf(students[i].eng));
                    bw.write(","); // 구분자
                    bw.write(String.valueOf(students[i].math));
                    bw.write(","); // 구분자
                    bw.write(String.valueOf(students[i].getTotal()));
                    bw.write(","); // 구분자
                    bw.write(String.valueOf(students[i].getAvg()));
                    bw.newLine();
                } else {
                    line = "null,0,0,0,0,0.0";
                    bw.write(line);
                    bw.newLine();
                }
            }
            // 버퍼 및 스트림 뒷정리
            bw.flush(); // 버퍼의 남은 데이터 모두 쓰기
            bw.close(); // 스트림 종료
            MessageBox.makeComplete();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public void readFile(Scanner sc) {

        File dir = readFileInstance();

        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println("data 폴더가 존재하지 않음");
            return;
        }

        // 폴더 안의 모든 파일 조회
        File[] files = dir.listFiles();

        if (files == null || files.length == 0) {
            System.out.println("data 폴더 안에 파일이 없음");
            return;
        }

        System.out.println("+-------------------------+");
        System.out.println("| data 폴더 안의 파일 목록  |");
        for (File file : files) {
            System.out.println("|" + file.getName() + "\t");
        }
        System.out.println("+-------------------------+");

        System.out.print("로드할 텍스트 파일이름을 입력하세요. " + " ex) save\n>>> ");
        String loadName = sc.next();

        File file = makeFileInstance(loadName);
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = null;
            String[] nameTemp = null;
            studentCount = 0;

            while ((line = br.readLine()) != null) {
                nameTemp = line.split(",");
                if (!nameTemp[0].equals("null")) {
                    students[studentCount] = new Student(
                            nameTemp[0],
                            Integer.parseInt(nameTemp[1]),
                            Integer.parseInt(nameTemp[2]),
                            Integer.parseInt(nameTemp[3]),
                            Integer.parseInt(nameTemp[4]),
                            Double.parseDouble(nameTemp[5]));
                } else {
                    students[studentCount] = new Student(null, 0, 0, 0, 0, 0.0);
                }
                studentCount++;
            }
            br.close();
            MessageBox.loadComplete();
        } catch (Exception e) {
            System.out.println(e.toString());

        }
    }
}
