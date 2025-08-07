package ch05_loop.sec_continue;

public class ContinueExample02 {
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            i++;

            if (i > 20) {
                break; // i가 21이 되는 순간, while 루프를 벗어남
            }
            if (i % 2 == 1) {
                continue;
                // i가 홀수 일때 아래의 코드를 실행하지 않고 올라감
            }
            System.out.println(i+ " 짝수임 ");
        }
    }
}
