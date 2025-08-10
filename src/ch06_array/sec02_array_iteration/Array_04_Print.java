package ch06_array.sec02_array_iteration;

/*
 * 배열의 요소를 출력하고, 각 요소의 인덱스를 표시하기
 */
public class Array_04_Print {
    public static void main(String[] args) {
        /*
         * 배열의 요소 출력하기
         * for 문의 주 용도는
         * 1) 특정 횟수의 반복
         * 2) 배열이나 컬렉션 자료형의 순회 <-- 이 용도로 제일 많이 씀
         */
        // 1. 배열 초기화
        // numbers 배열을 선언하고, 1부터 10까지의 값을 초기화
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // 배열 생성 및 초기화

        // 2. 반복문을 사용한 배열 요소 출력
        int index = 0;

        // 0번 부터 numbers 의 길이 만큼 반복
        for (int i = 0; i < numbers.length; i++) {
            // 3. 배열 요소와 인덱스 출력
            System.out.print(numbers[i] + " "); // 인덱스가 0번부터 시작함
        }
        System.out.println();

        // 향상된 for 문
        for (int n : numbers) {
            System.out.print("[" + index + " index: " + n + " ]");
            index++;
        }

        /*
         * 인덱스가 0번 부터 시작하는 이유
         * 컴퓨터 메모리 계산에 유리해서
         */
    }
}
