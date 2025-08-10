package ch05_loop.sec02_WhileLoop;

public class WhileExample02 {
    public static void main(String[] args) {

        // for 문과 while 문 비교
        int num;
        int sum = 0;

        for (num = 0; num <= 10; num++) {
            sum += num;
        }
        System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
        // while 문도 초기값, 조건식, 증감식이 존재

        num = 1;
        sum = 0;
        while (num <= 10) {
            sum += num;
            num++;
        }
        System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
    }
}
