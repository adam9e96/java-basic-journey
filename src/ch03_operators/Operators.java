package ch03_operators;

public class Operators {
    public static void main(String[] args) {
        // 산술 연산자
        int a = 10;
        int b = 3;
        System.out.println("a + b = " + (a + b)); // 덧셈
        System.out.println("a - b = " + (a - b)); // 뺄셈
        System.out.println("a * b = " + (a * b)); // 곱셈
        System.out.println("a / b = " + (a / b)); // 나눗셈 (몫)
        System.out.println("a % b = " + (a % b)); // 나머지

        // 증감 연산자
        int c = 5;
        System.out.println("++c = " + (++c)); // 전위 증가
        System.out.println("c++ = " + (c++)); // 후위 증가
        System.out.println("c = " + c);

        // 비교 연산자
        int d = 10;
        int e = 5;
        System.out.println("d는 e보다 크다 " + (d > e));
        System.out.println("d는 e보다 작다 " + (d < e));
        System.out.println("d는 e와 같다 " + (d == e));
        System.out.println("d와 e는 다르다 " + (d != e));
        System.out.println("d는 e 와 작거나 같다" + (d <= e));
        System.out.println("d는 e와 크거나 같다" + (d >= e));

        // 논리 연산자
        boolean f = true;
        boolean g = false;
        System.out.println("f && g is " + (f && g)); // AND
        System.out.println("f || g is " + (f || g)); // OR
        System.out.println("!f is " + (!f));       // NOT

        // 대입 연산자
        int h = 10;
        h += 5; // h = h + 5
        System.out.println("h = " + h);
    }
}
