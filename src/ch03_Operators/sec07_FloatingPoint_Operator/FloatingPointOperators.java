package ch03_Operators.sec07_FloatingPoint_Operator;

// 실수 계산시 주의할점
public class FloatingPointOperators {
    public static void main(String[] args) {
        int pizza = 1; // 피자 1판
        double sliceSize = 0.1; // 한 조각 크기
        int slicesEaten = 7; // 먹은 조각 수

        double remaining = pizza - slicesEaten * sliceSize;
        System.out.println("피자 1판에서 남은 양: " + remaining);
        // 피자 1판에서 남은 양: 0.29999999999999993
        /*
         * 위의 결과가 정확히 0.3이 되지 않는 이유는
         * 실수 타입인 double이 부동 소수점 방식을 사용하기 때문이다.(float, double 등)
         * 정확한 계산이 필요하다면 정수 연산으로 변경해서 계산해야 한다.
         */

        // 정수 연산으로 변경
        pizza = 1;
        int totalSlices = pizza * 10; // 총 조각 수
        slicesEaten = 7;

        int remainingSlices = totalSlices - slicesEaten;
        System.out.println("10조각에서 남은 조각: " + remainingSlices);
        // 정수 10으로 나누면 몫이 0이 되므로, double로 나누어야 정확한 결과를 얻을 수 있다.
        System.out.println("피자 1판에서 남은 양: " + remainingSlices / 10.0);
        // 피자 1판에서 남은 양: 0.3
        /*
         * 위의 결과는 정확히 0.3이 된다.
         * 정수 연산을 통해 정확한 결과를 얻을 수 있다.
         * 실수 연산을 할 때는 항상 주의해야 한다.
         */
    }
}