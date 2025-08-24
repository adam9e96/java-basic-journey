package ch07_Method.sec02_ex;

/**
 * 2. 정수를 매개변수로 받아 짝수면 "Even", 홀수면 "Odd"를 반환하는 메서드
 * checkEvenOdd 를 작성하시오.
 */
public class Method04_ex {
    public static String checkEvenOdd(int n) {
        if (n % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        int n = 11;
        int n2 = 12;
        System.out.println(checkEvenOdd(n));
        System.out.println(checkEvenOdd(n2));

    }
}
