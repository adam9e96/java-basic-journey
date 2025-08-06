package ch03_operators.sec01_scanner; // Scanner 클래스 호출

import java.util.Scanner;

public class ScannerExample01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner 객체 생성

        // 기본 타입
        byte a = scanner.nextByte(); // byte 입력받음
        short b = scanner.nextByte(); // short 입력받음
        int c = scanner.nextInt(); // int 입력받음
        long d = scanner.nextLong(); // long 입력받음

        // 실수타입
        float e = scanner.nextFloat(); // float 입력받음
        double f = scanner.nextDouble(); // double 입력받음

        // 논리타입
        boolean g = scanner.nextBoolean(); // boolean 입력받음

        // 문자열타입
        String h = scanner.next(); // String 형 입력 (토큰 기준으로 한 단어를 읽음)
        String i = scanner.nextLine(); // String 형 입력 (개행 기준으로 한 줄을 읽음)

        // 출력문
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        // 1
        // 10
        // 100
        // 1000
        // 10.0
        // 100.0
        // false
        // abc def
        scanner.close();
    }
}
