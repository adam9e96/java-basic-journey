package ch06_array.sec05_array_search_sort;

// 정렬해서 1,3,4,5,7 만들기

/**
 * 버블 정렬의 원리
 * - 옆에 있는 값과 비교해서 더 크면 스왑
 * - 한 번 반복이 끝날 때마다 가장 큰 값이 맨 뒤로 이동
 * - 비교 범위를 점점 줄임
 */
public class Array02_BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 1, 3, 4, 7};
        int temp;

        // 버블 정렬
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < (arr.length - 1 - i); j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }

        // 출력
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
