package ch05_loop.sec02_WhileLoop;

public class WhileExample01 {
    public static void main(String[] args) {

        int i = 1; // 초깃값 1로 초기화

        while (i < 10) {
            System.out.println(i); // 조건식
            i++; // i 값을 1씩 증가시킴
        }
//        System.out.println(i);
    }
}
