package ch07_Method.sec01_Method_Use;

public class Method02 {

    /**
     * arr 요소의 갯수 만큼 별출력
     */
    public static void printMul(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // arr[i]
            System.out.print(arr[i] + " ");
            for (int j = 0; j < arr[i]; j++) {
                // arr[j]
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printVerticalChart(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr.length - i <= arr[j]) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // 배열 값 출력
        for (int value : arr) {
            System.out.print(value);
        }

    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 2, 4};
//        printMul(arr);
        printVerticalChart(arr);

    }
}
