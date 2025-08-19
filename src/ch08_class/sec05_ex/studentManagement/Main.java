package ch08_class.sec05_ex.studentManagement;

import java.util.Scanner;

/**
 * 학생 성적 관리 프로그램 기능 - 1. 학생 성적 입력 (이름, 국어, 영어, 수학 - 2. 학생 목록 출력 (번호, 이름 국어, 영어,
 * 수학, 총점, 평균 - 3. 특정 학생 성적 수정 - 4. 특정 학생 삭제 - 5. 학생 검색 - 6. 프로그램 종료
 * <p>
 * 데이터 구조 String[] name: 학생 이름 저장 int[][] score: 국/영/수 점수 저장 int[] totals: 총점 저장
 * double[] avg: 평균 저장
 * <p>
 * 최대 학생 수: MAX_STUDENT = 5 학생수는 count로 관리
 */
public class Main {
    public static boolean isRunning = true;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClassRoom cr = new ClassRoom();
        MessageBox mb = new MessageBox();

        while (isRunning) {
            switch (mb.getMenu(scanner)) {
                case 1:
                    cr.createStudent(scanner);
                    break;
                case 2:
                    cr.getPrint();
                    break;
                case 3:
                    cr.updateStudent(scanner);
                    break;
                case 4:
                    cr.deleteStudent(scanner);
                    break;
                case 5:
                    cr.searchStudent(scanner);
                    break;
                case 6:
                    cr.getPrintOrderByTotal();
                    break;
                case 7:
                    cr.makeFile(scanner);
                    break;
                case 8:
                    cr.readFile(scanner);
                    break;
                case 0:
                    mb.getExit();
                    isRunning = false;
                    break;
                default: // 123450 제외 다른입력시
                    mb.getErrorInput();
                    break;
            }
        }
        scanner.close();
    }

}
