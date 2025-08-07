package ch05_loop.sec_continue;

public class ContinueExample03 {
    public static void main(String[] args) {
        // 1~20 까지의 숫자 중 2,3 의 배수만 빼고 합한 값을 구해라.
        int sum = 0;
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0 || i % 3 == 0) {
                continue;
            }
            sum += i;
        }
        System.out.println("1 ~ 20 까지의 숫자 중 2,3배수만 뺀 합: "+sum);
    }
}
