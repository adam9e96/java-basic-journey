package ch07_method;

import java.util.Scanner;

/**
 * 계산기 프로그램
 * 메서드를 사용하지 않은 경우
 */
public class Method_03_NotUseMethod2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 첫 번째 계산
        System.out.println("=== 첫 번째 계산 ===");
        System.out.print("첫 번째 숫자: ");
        double num1 = scanner.nextDouble();
        System.out.print("연산자 (+, -, *, /): ");
        char operator1 = scanner.next().charAt(0);
        System.out.print("두 번째 숫자: ");
        double num2 = scanner.nextDouble();

        double result1 = 0;
        boolean validOperation1 = true;

        if (operator1 == '+') {
            result1 = num1 + num2;
        } else if (operator1 == '-') {
            result1 = num1 - num2;
        } else if (operator1 == '*') {
            result1 = num1 * num2;
        } else if (operator1 == '/') {
            if (num2 != 0) {
                result1 = num1 / num2;
            } else {
                System.out.println("오류: 0으로 나눌 수 없습니다.");
                validOperation1 = false;
            }
        } else {
            System.out.println("오류: 잘못된 연산자입니다.");
            validOperation1 = false;
        }

        if (validOperation1) {
            System.out.println("결과: " + result1);
        }

        // 두 번째 계산 (동일한 코드 반복)
        System.out.println("\n=== 두 번째 계산 ===");
        System.out.print("첫 번째 숫자: ");
        double num3 = scanner.nextDouble();
        System.out.print("연산자 (+, -, *, /): ");
        char operator2 = scanner.next().charAt(0);
        System.out.print("두 번째 숫자: ");
        double num4 = scanner.nextDouble();

        double result2 = 0;
        boolean validOperation2 = true;

        if (operator2 == '+') {
            result2 = num3 + num4;
        } else if (operator2 == '-') {
            result2 = num3 - num4;
        } else if (operator2 == '*') {
            result2 = num3 * num4;
        } else if (operator2 == '/') {
            if (num4 != 0) {
                result2 = num3 / num4;
            } else {
                System.out.println("오류: 0으로 나눌 수 없습니다.");
                validOperation2 = false;
            }
        } else {
            System.out.println("오류: 잘못된 연산자입니다.");
            validOperation2 = false;
        }

        if (validOperation2) {
            System.out.println("결과: " + result2);
        }

        scanner.close();
    }
}