package ch07_Method.sec01_Method_Use;

import java.util.Scanner;

/**
 * 계산기 프로그램
 * 메서드를 이용한 경우
 */
public class Method06_Use {
    static Scanner scanner = new Scanner(System.in);

    // 숫자 입력 메서드
    static double inputNumber(String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    // 연산자 입력 메서드
    static char inputOperator() {
        System.out.print("연산자 (+, -, *, /): ");
        return scanner.next().charAt(0);
    }

    // 계산 수행 메서드
    static double performCalculation(double num1, double num2, char operator) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 == 0) {
                    throw new ArithmeticException("0으로 나눌 수 없습니다.");
                }
                return num1 / num2;
            default:
                throw new IllegalArgumentException("잘못된 연산자입니다.");
        }
    }

    // 연산자 유효성 검사 메서드
    static boolean isValidOperator(char operator) {
        return operator == '+' || operator == '-' || operator == '*' || operator == '/';
    }

    // 한 번의 계산을 처리하는 메서드
    static void performOneCalculation(String calculationName) {
        System.out.println("=== " + calculationName + " ===");

        try {
            double num1 = inputNumber("첫 번째 숫자: ");
            char operator = inputOperator();
            double num2 = inputNumber("두 번째 숫자: ");

            if (!isValidOperator(operator)) {
                System.out.println("오류: 잘못된 연산자입니다.");
                return;
            }

            double result = performCalculation(num1, num2, operator);
            System.out.println("결과: " + result);

        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println("오류: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        performOneCalculation("첫 번째 계산");
        System.out.println();
        performOneCalculation("두 번째 계산");

        scanner.close();
    }
}