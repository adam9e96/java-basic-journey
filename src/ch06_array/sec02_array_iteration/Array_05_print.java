package ch06_array.sec02_array_iteration;

/**
 * 주어진 배열의 합을 계산하는 프로그램
 * 여러 방법으로 객체 요소의 합을 구해보기
 */
public class Array_05_print {
    public static void main(String[] args) {

        // 1. for 문을 이용해서 배열 요소의 합을 구하기
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        // for문을 이용하여 arr배열 요소의 합을 구하기
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("sum = " + sum); // sum = 150

        // 2. for each 문을 이용해서 배열 요소의 합을 구하기
        sum = 0; // sum 변수를 재활용하기 위해 0 초기화
        for (int n : arr) {
            sum += n;
        }
        System.out.println("sum = " + sum);

        // 3. for 문을 역순으로 실행하여 배열 요소의 합을 구하기
        sum = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            sum += arr[i];
        }
        System.out.println("sum = " + sum);
    }
}
