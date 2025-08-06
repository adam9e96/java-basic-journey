package ch03_operators.sec06_random;

import java.util.Random;

public class RandomExample02 {
    public static void main(String[] args) {
        Random rand = new Random(); // 기본 시드

        System.out.println("0~9 사이 정수: " + rand.nextInt(10));
        System.out.println("0.0~1.0 사이 실수: " + rand.nextDouble());
        System.out.println("랜덤 불리언: " + rand.nextBoolean());
        System.out.println("랜덤 long: " + rand.nextLong());

        // 고정 시드로 predictable 난수 생성
        Random fixedRand = new Random(42);
        System.out.println("고정 시드 결과: " + fixedRand.nextInt(100));
    }
}
