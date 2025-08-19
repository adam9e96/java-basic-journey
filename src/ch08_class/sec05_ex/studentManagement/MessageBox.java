package ch08_class.sec05_ex.studentManagement;

import java.util.Scanner;

public class MessageBox {
    static final String black = "\u001B[30m";
    static final String red = "\u001B[31m";
    static final String green = "\u001B[32m";
    static final String yellow = "\u001B[33m";
    static final String blue = "\u001B[34m";
    static final String purple = "\u001B[35m";
    static final String cyan = "\u001B[36m";
    static final String white = "\u001B[37m";
    static final String exit = "\u001B[0m";

    public int getMenu(Scanner sc) {
        int menu = -1;
        try {
            System.out.print(red);
            System.out.println("+--------[성적 관리 프로그램]--------+");
            System.out.println("| 1. 입력\t                         |");
            System.out.println("| 2. 출력\t                         |");
            System.out.println("| 3. 수정\t                         |");
            System.out.println("| 4. 삭제\t                         |");
            System.out.println("| 5. 검색\t                         |");
            System.out.println("| 6. 출력(총점순)\t                 |");
            System.out.println("| 7. 파일저장\t                     |");
            System.out.println("| 8. 파일로드\t                     |");
            System.out.println("| 0. 종료\t                         |");
            System.out.println("+-----------------------------------+");
            System.out.print(exit);
            System.out.print("선택: \n");

            menu = sc.nextInt();
        } catch (Exception e) {
//			System.out.println(e.toString());
            NoticeInputTypeMiss();
            sc.nextLine(); // 잘못된 값 버퍼 비우기
        }
        return menu;
    }

    public static void getExceedStudent() {
        System.out.println("+-------------------------+");
        System.out.println("| 학생수를 초과했습니다.   |");
        System.out.println("+-------------------------+");
    }

    public static void getNotNullName() {
        System.out.println("+-------------------------------------+");
        System.out.println("| 이름으로 null은 사용불가능 합니다.   |");
        System.out.println("+-------------------------------------+");
    }

    public void getErrorInput() {
        System.out.println("+-----------------------------------+");
        System.out.println("| 잘못입력했습니다. 다시 입력해주세요 |");
        System.out.println("+-----------------------------------+");
    }

    public void getExit() {
        System.out.println("+---------------------------------+");
        System.out.println("| 프로그램이 종료되었습니다.       |");
        System.out.println("+---------------------------------+");
    }

    public void NoticeInputTypeMiss() {
        System.out.println("+----------------------------+");
        System.out.println("| 정수를 입력해야 합니다     |");
        System.out.println("+----------------------------+");
    }


}
