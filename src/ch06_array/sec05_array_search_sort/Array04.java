package ch06_array.sec05_array_search_sort;

import java.util.Random;

public class Array04 {
    public static void main(String[] args) {
        Random random = new Random();
        random.setSeed(System.currentTimeMillis());
        int[] lotto = new int[5];
        int count = 0;
        int num = 0;

        // 1. 중복 없이 5개 뽑기
        while (count < 5) {
            // 뽑기
            num = random.nextInt(45) + 1;
            boolean duplicate = false;

            // 최소 한장 뽑은 상태부터 작동
            for (int i = 0; i < count; i++) {
                if (lotto[i] == num) {
                    duplicate = true;
                    break;
                }
            }

            // 중복이 아니였으면 저장
            if (!duplicate) {
                lotto[count] = num;
                count++;
            }

        }

        // 출력부
        for (int n : lotto) {
            System.out.println(n + "\t");
        }

    }
}
