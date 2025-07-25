package ch07_method;

/**
 * 주어진 밑변과 높이를 사용하여 사각형의 넓이를 계산하는 메서드를 만들기
 * <p>
 * 계산은 calculator() 메서드를 통하도록 하기
 */
public class Method_05_Ex {
    public static void main(String[] args) {
        // 밑변 30, 높이 10인 사각형의 넓이를 계산하여 출력
        int width = 30;
        int height = 10;

        int result = calculator(width,height);

        System.out.println("계산 결과: " + result);
    }

    static int calculator(int a, int b) {
        return a * b;
    }
}
