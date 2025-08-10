package ch05_loop.sec01_ForLoop;

public class ForExample02 {
    public static void main(String[] args) {

        // for 문의 작성 순서

        int sum = 0; // 총 합을 담을 변수. 초기화 필수
        int count = 1;
        // for(초기값; 조건식; 증감식) { }
        for (int i = 1; i <= 10; i++) { // i가 1부터 10까지 반복하여 10번을 루프함
//            System.out.println(count++);
            System.out.println("i = " + i + ", sum = " + (sum += i));
            // for 실행 순서
            // 1) 초기값 실행 i = 1
            // 2) 조건식 확인 i <= 10
            // 3) 조건식이 참이면 명령문 실행
            // 4) 명령문 실행 후 증감식 실행 i++, i = 2가됨
            // 5) 조건식 확인 i= 2, i<= 10
            // 6) 조건식이 참이면 명령문 실행
            // 4,5,6 반복 i가 10보다 작거나 같은경우까지

        }
//        System.out.println(i); // i는 for문 안에서만 유효한 변수
        System.out.println(sum);
//        System.out.println("반복횟수최종: " + count);

        // 조건문 사용시 주의
        // if 같은 제어문은 코드가 틀린경우 오류가 나는데 for 문은 잘못하면
        // 무한루프가 될수있다.
    }
}
