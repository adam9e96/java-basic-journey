package ch05_loop.sec01_ForLoop;

public class ForExample03 {
    public static void main(String[] args) {
        // 1. for 문 외부에 변수 선언 할 경우 i 대신 다른 변수명을 하는 것이 좋음
        int sum = 0;
        int num; // 초깃값

        for (num = 0; sum <= 100; num++) {
            sum += num; // sum = sum + num -> sum 변수를 미리 초기화 하지 않으면 오류남
            System.out.println("num: " + num + " , sum: " + sum);
        }
        System.out.println("==============================");
        System.out.println("최종");
        System.out.println("num: " + num); // 최종 num: index
        System.out.println("sum: " + sum); // 최종 sum: 합계
        System.out.println("==============================");
        /*
         * num: 13 sum: 91 까지는 조건식이 참이지만
         * num+=로 num이 14가 되고 sum += num;을 하면
         * sum은 105가 되고 조건식이 참이 되지 않아서 for문을 빠져나감
         */

        // 2. for 문을 사용해 10 부터 15까지의 합을 구하고 출력
        sum = 0;
        num = 0;
        for (num = 10; num <= 15; num++) {
            sum += num;
            System.out.println(num);
        }
        System.out.println("10 부터 15까지의 합: " + sum);

    }
}
