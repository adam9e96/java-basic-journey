package ch04_controlflow_switch.Exam;

import java.util.Scanner;

// 사용자가 1~4번 중 하나를 선택하면 메뉴 이름을 출력하시오.
// 해당 번호가 아니면 "잘못된 메뉴입니다"를 출력
// 1: 김밥, 2: 떡볶이, 3: 라면, 4: 돈까스
public class SwitchEx02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("메뉴 번호를 선택하세요 (1~4): ");
        int menu = sc.nextInt();
        String result = "";

        switch (menu) {
            case 1:
                result = "김밥";
                break;
            case 2:
                result = "떡볶이";
                break;
            case 3:
                result = "라면";
                break;
            case 4:
                result = "돈까스";
                break;
            default:
                System.out.println("잘못된 메뉴입니다.");
        }
        if (result.length() > 1) {
            System.out.println(result);
        }

    }
}
