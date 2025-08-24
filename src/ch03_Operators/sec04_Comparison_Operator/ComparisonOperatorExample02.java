package ch03_Operators.sec04_Comparison_Operator;

public class ComparisonOperatorExample02 {
    public static void main(String[] args) {
        // 비교 연산자
        int d = 10;
        int e = 5;
        System.out.println("d는 e보다 크다 " + (d > e));
        System.out.println("d는 e보다 작다 " + (d < e));
        System.out.println("d는 e와 같다 " + (d == e));
        System.out.println("d와 e는 다르다 " + (d != e));
        System.out.println("d는 e 와 작거나 같다" + (d <= e));
        System.out.println("d는 e와 크거나 같다" + (d >= e));
    }
}
