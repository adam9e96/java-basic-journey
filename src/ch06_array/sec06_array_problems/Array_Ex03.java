package ch06_array.sec06_array_problems;

import java.util.Scanner;

public class Array_Ex03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            System.out.print("arr배열 출력: " + arr[i]);
        }
        scanner.close();
    }
}
