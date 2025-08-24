package ch06_Array.sec04_Array_SearchSort;

import java.util.Arrays;

/**
 * 배열에서 스왑(Swap)은 특정 인덱스의 값을 서로 바꾸는 작업을 말함
 * 가장 기본적인 방법은 임시 변수를 쓰는 방식
 */
public class Array01_Swap {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;

        // 바꿔치기 (스왑)
        int temp = a;
        a = b;
        b = temp;
        System.out.print("a = " + a + "\nb = " + b);

        System.out.println();

        // 배열 방식으로
        int[] arr = {10, 20, 30, 40};
        // 예: arr[0] 과 arr[2] 를 바꾼다.
        temp = arr[0];
        arr[0] = arr[2];
        arr[2] = temp;
        System.out.println(Arrays.toString(arr));
    }
}
