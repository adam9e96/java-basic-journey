package ch06_array.sec04_array_multi_dimensional;

public class Array_Multi02 {
    public static void main(String[] args) {

        // [2][3]
        int arr[][] = {
                {1, 2, 3},
                {4, 5, 6}
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("[" + i + "]" + "[" + j + "]" + " = " + arr[i][j]);
            }
            System.out.println();
        }

        System.out.println("=== 값 변경 ===");
        arr[0][1] = 7;
        arr[1][2] = 8;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("[" + i + "]" + "[" + j + "]" + " = " + arr[i][j]);
            }
            System.out.println();
        }

        System.out.println("=== 값 변경 ===");
        arr[0][1] = 99;
        arr[1][1] = 100;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("[" + i + "]" + "[" + j + "]" + " = " + arr[i][j]);
            }
            System.out.println();
        }
    }
}
