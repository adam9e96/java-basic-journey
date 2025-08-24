package ch03_Operators.sec02_Arithmetic_Operator;

import java.util.Scanner;

public class ArithmeticOperatorExample03 {
    public static void main(String[] args) {

        /*
         * 콘솔에서 입력을 받을 때는 Scanner 클래스를 사용
         */
        Scanner scanner = new Scanner(System.in); // Scanner 타입도 클래스이므로 new 키워드 사용함.
        int x, y, sum;

        System.out.print("첫 번째 숫자를 입력하세요: "); // 줄바꿈 X
        x =  scanner.nextInt(); // 정수를 입력받아 변수 x에 저장

        System.out.print("두 번째 숫자를 입력하세요: ");
        y = scanner.nextInt();

        sum = x + y;
        System.out.println("두 정수의 합: " + sum); // 합을 출력

        scanner.close();
    }
}
