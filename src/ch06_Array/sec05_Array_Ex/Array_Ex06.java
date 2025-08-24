package ch06_Array.sec05_Array_Ex;

public class Array_Ex06 {
    public static void main(String[] args) {
        //로또 당첨기

        int[] number = new int[45];
        // 1번 부터 45번 공이 필요

        for (int i = 0; i < number.length; i++) {
            number[i] = i + 1;
//            System.out.println(Arrays.toString(number));
        }
        // 배열 섞기
        for (int i = 0; i < number.length; i++) {
            int n = (int) (Math.random() * 45); // 0 ~ 44
            int temp = number[i];
            number[i] = number[n];
            number[n] = temp;
        }
        for (int i = 0; i < 6; i++) {
            System.out.print(number[i] + " ");
        }
    }
}
