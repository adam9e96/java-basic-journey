package ch07_Method.sec01_Method_Use;

/**
 * 기본 사칙연산 메서드로 해보기
 */
public class Method01 {

    /**
     * 두 정수의 합 반환
     */
    public static int add(int a, int b) {
        return a + b;
    }

    /**
     * 두 정수의 차 반환
     */
    public static int sub(int a, int b) {

        return a - b;
    }

    /**
     * 두 정수의 곱 반환
     */
    public static int multiply(int a, int b) {

        return a * b;
    }

    /**
     * 두 정수의 나눗셈 결과 반환
     */
    public static float divide(int a, int b) {
        return (float) a / b;
    }

    public static void main(String[] args) {
        int resultAdd = add(1, 2);
        int resultSub = sub(4, 2);
        int resultMul = multiply(3, 4);
        float resultDiv = divide(8, 3);

        System.out.println("덧셈 결과 : " + resultAdd);
        System.out.println("뺄셈 결과 : " + resultSub);
        System.out.println("곱셈 결과 : " + resultMul);
        System.out.println("나눗셈 결과 : " + resultDiv);
    }
}
