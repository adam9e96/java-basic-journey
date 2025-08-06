package ch03_operators.sec02_arithmeticOperator;

import java.util.Scanner;
// 산술 연산자(사칙연산)
public class ArithmeticOperatorExample01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int time = scanner.nextInt();
        int second = time % 60; // 60을 나눈 나머지 값 => 초만 남음
        int minute = (time / 60) % 60; // 60을 나눈 몫에 다시 60를 나눈 나머지값 => 분만 남음, 일단 60을 나누면 분만 남는데
        // 만약 time이 1시간을 넘겨서 60 이상 일 수 있어서 60을 나눈 나머지를 이용해 시간도 없앰
        int hour = (time / 60) / 60; // 시간만 남음

        System.out.println(time + "초는 ");
        System.out.println(hour + "시간, ");
        System.out.println(minute + "분, ");
        System.out.println(second +"초입니다.");

        scanner.close();
    }
}
