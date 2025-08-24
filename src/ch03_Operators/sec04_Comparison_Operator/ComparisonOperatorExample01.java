package ch03_Operators.sec04_Comparison_Operator;

// 비교 연산자
public class ComparisonOperatorExample01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("a= " + a + ", b = " + b);

        // 정수 비교
        System.out.println("a == b: " + (a == b)); // false
        System.out.println("a != b: " + (a != b)); // true
        System.out.println("a > b: " + (a > b));  // false
        System.out.println("a < b: " + (a < b)); // true
        System.out.println("a >= b: " + (a >= b)); // false
        System.out.println("a <= b: " + (a <= b)); // true

        // 문자 비교
        char ch1 = 'A'; // 65
        char ch2 = 'B'; // 66

        System.out.println("\nch1 = " + ch1 + ", ch2 = " + ch2);
        System.out.println("ch1 == ch2: " + (ch1 == ch2)); // false
        System.out.println("ch1 != ch2: " + (ch1 != ch2)); // true
        System.out.println("ch1 < ch2: " + (ch1 < ch2));   // true

        // 실수 비교
        double x = 3.14;
        double y = 2.71;

        System.out.println("\nx = " + x + ", y = " + y);
        System.out.println("x > y: " + (x > y));   // true
        System.out.println("x == y: " + (x == y)); // false
    }
}
