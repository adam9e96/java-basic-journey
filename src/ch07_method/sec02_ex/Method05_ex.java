package ch07_method.sec02_ex;

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
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int MAX_STUDENT = 5; // 총인원
        int studentCount = 0;// 현인원
        // 2차원배열 : 이름, 국어, 영어, 수학
        String[] name = new String[MAX_STUDENT]; // 학생
        int[][] scores = new int[MAX_STUDENT][3]; // 각 학생 점수

        double[] totalAverages = new double[MAX_STUDENT]; // 각 학생의 평균
        int[] totals = new int[MAX_STUDENT]; // 각 학생의 총점

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("┌─────[성적 관리 프로그램]─────┐");
            System.out.println("│   1. 입력                    │");
            System.out.println("│   2. 출력                    │");
            System.out.println("│   3. 수정                    │");
            System.out.println("│   4. 삭제                    │");
            System.out.println("│   5. 검색                    │");
            System.out.println("│   0. 종료                    │");
            System.out.println("└──────────────────────────────┘");
            System.out.print("선택: ");
            int menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    if (studentCount >= MAX_STUDENT) {
                        System.out.println("┌───────────◇────────────┐");
                        System.out.println("│ 학생 수를 초과했습니다 │");
                        System.out.println("└───────────◇────────────┘");
                        break;
                    }
                    System.out.print("이름: ");
                    name[studentCount] = scanner.next();
                    System.out.print("국어: ");
                    scores[studentCount][0] = scanner.nextInt();
                    System.out.print("영어: ");
                    scores[studentCount][1] = scanner.nextInt();
                    System.out.print("수학: ");
                    scores[studentCount][2] = scanner.nextInt();

                    System.out.println("입력완료");

//                    System.out.println("== 출력 테스트 ==");
//                    for (int i = 0; i <= studentCount; i++) {
//                        System.out.println(name[i]);
//                    }
//                    for (int n : scores[studentCount]) {
//                        System.out.println(n);
//                    }
                    studentCount++;
                    break;
                case 2:
                    if (studentCount == 0) {
                        System.out.println("┌──────────────────────◇──────────────────┐");
                        System.out.println("│ 학생이 없습니다! 학생 추가가 필요합니다 │");
                        System.out.println("└──────────────────────◇──────────────────┘");
                        continue;
                    }
                    for (int i = 0; i < 3; i++) {
                        totals[i] = 0;
                        totalAverages[i] = 0;
                    }
                    System.out.print("번호\t이름\t국어\t영어\t수학\t총점\t평균\n");
                    for (int i = 0; i < studentCount; i++) { // 학생 수 만큼 반복
                        if (name[i] != null) {
                            int sum = 0;
                            System.out.print(i + 1 + "\t");
                            System.out.print(name[i] + "\t");
                            // 국영수 출력
                            for (int j = 0; j < scores[i].length; j++) { // scores[i].length = 3
                                System.out.print(scores[i][j] + "\t");
                                totals[i] += scores[i][j]; // 누적 총점 계산(학생당)
                                sum += scores[i][j];
                            }
                            totals[i] = sum;
                            totalAverages[i] = (double) sum / 3; // 총점 평균 계산 (학생당)
                            System.out.print(totals[i] + "\t");
                            System.out.print(String.format("%.2f", totalAverages[i]));
                            System.out.println();
                        }
                    }
                    System.out.println("┌─────◆────┐");
                    System.out.println("│ 출력완료 │");
                    System.out.println("└─────◆────┘");
                    break;
                case 3:
                    if (studentCount == 0) {
                        System.out.println("┌──────────────────────◇──────────────────┐");
                        System.out.println("│ 학생이 없습니다! 학생 추가가 필요합니다 │");
                        System.out.println("└──────────────────────◇──────────────────┘");
                        continue;
                    }
                    System.out.print("수정 번호:");
                    int updateNum = scanner.nextInt(); // 수정할 번호(인덱스)
                    // updateNum 수정 가능한 조건
                    // 최대 n보다 작거나 같아야함(총인원) 그리고
                    // 현재 인원 count 보다 작거나 같아야함
//                    System.out.println("┌──────────────────◆──────────────┐");
//                    System.out.println("│        테스트 코드              │");
//                    System.out.println("│현인원: " + studentCount + "                 │");
//                    System.out.println("│수정할려는 인원: " + updateNum + "           │");
//                    System.out.println("└──────────────────◆──────────────┘");
                    int idx = updateNum - 1;
                    // 범위 안에 있는지 + 해당 번호가 존재하는지
                    if (updateNum > MAX_STUDENT) {
                        System.out.println("┌────────────◇───────────────┐");
                        System.out.println("│ 수정하려는 번호가 큽니다.  │");
                        System.out.println("└────────────◇───────────────┘");
                        continue;
                    }
                    if (updateNum <= 0) {
                        System.out.println("┌────────────────────◇─────────────────────┐");
                        System.out.println("│ 수정하려는 번호가 0 이거나 음수입니다.   │");
                        System.out.println("└────────────────────◇─────────────────────┘");
                        continue;
                    }
                    // 삭제한 경우 표시 X
                    if (name[idx] == null) {
                        System.out.println("┌────────────◇───────────────┐");
                        System.out.println("│ 수정할려는 사람이 없습니다 │");
                        System.out.println("└────────────◇───────────────┘");
                        continue;
                    } else {
                        System.out.print("이름: ");
                        name[idx] = scanner.next();
                        System.out.print("국어: ");
                        scores[idx][0] = scanner.nextInt();
                        System.out.print("영어: ");
                        scores[idx][1] = scanner.nextInt();
                        System.out.print("수학: ");
                        scores[idx][2] = scanner.nextInt();
                    }
                    break;
                case 4:
                    if (studentCount == 0) {
                        System.out.println("┌──────────────────────◇──────────────────┐");
                        System.out.println("│ 학생이 없습니다! 학생 추가가 필요합니다 │");
                        System.out.println("└──────────────────────◇──────────────────┘");
                        continue;
                    }
                    System.out.print("몇번 삭제: ");
                    int deleteNum = scanner.nextInt();
                    // 삭제 조건
                    // 1. 삭제할 번호가 n(5) 보단 작거나 같아야함 deleteNum <= n
                    // 2. 삭제할 번호가 현재 인원(count) 보다 작거나 같아야함 deleteNum <= count
                    int idxDelNum = deleteNum - 1;
                    // 범위 안에 있는지 + 해당 번호가 존재하는지
                    if (deleteNum > MAX_STUDENT) {
                        System.out.println("┌────────────◇───────────────┐");
                        System.out.println("│ 삭제하려는 번호가 큽니다.  │");
                        System.out.println("└────────────◇───────────────┘");
                        continue;
                    }
                    if (deleteNum <= 0) {
                        System.out.println("┌──────────────────────◇───────────────────┐");
                        System.out.println("│ 삭제하려는 번호가 0 이거나 음수입니다.   │");
                        System.out.println("└──────────────────────◇───────────────────┘");
                        continue;
                    }

                    if (name[idxDelNum] == null) {
                        System.out.println("┌────────────◇───────────────┐");
                        System.out.println("│ 삭제할려는 사람이 없습니다 │");
                        System.out.println("└────────────◇───────────────┘");
                        continue;
                    } else {
                        // 삭제하려는 값이 있다면
                        name[idxDelNum] = null;
                        for (int i = 0; i < scores[idxDelNum].length; i++) {
                            scores[idxDelNum][i] = 0;
                        }
                        System.out.println("┌─────────────────◆─────────────────┐");
                        System.out.println("│ 삭제가 완료되었습니다!            │");
                        System.out.println("└─────────────────◆─────────────────┘");
                    }
                    break;
                case 5:
                    // 학생수 0인 경우 접근시
                    if (studentCount == 0) {
                        System.out.println("┌──────────────────────◇──────────────────┐");
                        System.out.println("│ 학생이 없습니다! 학생 추가가 필요합니다 │");
                        System.out.println("└──────────────────────◇──────────────────┘");
                        continue;
                    }

                    System.out.println("┌───────────────◆───────────────┐");
                    System.out.println("│ 검색할 이름을 입력하세요      │");
                    System.out.println("└───────────────◆───────────────┘");
                    System.out.print(">>> ");

                    String searchName = scanner.next();

                    // 테스트
//                    System.out.println(searchName);
                    boolean isFind = false;

                    for (int i = 0; i < studentCount; i++) {
                        // null 부터 검사해야 됨 지운거 접근해서 NPE 발생함
                        if (name[i] != null && name[i].contains(searchName)) {
                            isFind = true;
                            // 테스트
                            System.out.println("찾음1");
                            break;
                        }
                    }

                    if (isFind) {
                        System.out.print("번호\t이름\t국어\t영어\t수학\t총점\t평균\n");
                        for (int i = 0; i < studentCount; i++) {
                            if (name[i] != null && name[i].contains(searchName)) {
                                int sum = 0;
                                System.out.print(i + 1 + "\t");
                                System.out.print(name[i] + "\t");
                                // 국영수 출력
                                for (int j = 0; j < scores[i].length; j++) { // scores[i].length = 3
                                    System.out.print(scores[i][j] + "\t");
                                    totals[i] += scores[i][j]; // 누적 총점 계산(학생당)
                                    sum += scores[i][j];
                                }
                                totals[i] = sum;
                                totalAverages[i] = (double) sum / 3; // 총점 평균 계산 (학생당)
                                System.out.print(totals[i] + "\t");
                                System.out.print(String.format("%.2f", totalAverages[i]));
                                System.out.println();
                            }
                        }
                    } else {
                        System.out.println("┌─────────────◆────────────┐");
                        System.out.println("│ 검색 결과가 없습니다     │");
                        System.out.println("└─────────────◆────────────┘");
                    }
                    break;
                case 0:
                    isRunning = false;
                    System.out.println("┌────────────◆──────────────┐");
                    System.out.println("│ 프로그램이 종료되었습니다 │");
                    System.out.println("└────────────◆──────────────┘");
                    break;
                default: // 123450 제외 다른입력시
                    System.out.println("┌──────────────────◇───────────────────┐");
                    System.out.println("│ 잘못입력셨습니다. 다시 입력해주세요. │");
                    System.out.println("└──────────────────◇───────────────────┘");
                    break;
            }
        }
        scanner.close();
    }
}
