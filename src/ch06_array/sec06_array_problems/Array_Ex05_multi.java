package ch06_array.sec06_array_problems;

import java.util.Scanner;

/**
 * 90 80 70
 * 100 90 80
 * 60 70 80
 */
public class Array_Ex05_multi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 선언부
        // 학생수 5, 과묵수 3
        int[][] school = new int[3][3]; // [3][2]
        int[] sum = new int[3];
        double[] avg = new double[3];
        int[] subTotal = new int[3];
        int total = 0;
        double avgTotal = 0;

        // 입력부
        for (int i = 0; i < school.length; i++) {
            System.out.print("점수입력: ");
            for (int j = 0; j < school[i].length; j++) {
                school[i][j] = scanner.nextInt();
            }
        }

        // 처리부
        for (int i = 0; i < school.length; i++) {
            for (int j = 0; j < school[i].length; j++) {
                sum[i] += school[i][j]; // 각 학생 국영수 총점
                subTotal[j] += school[i][j];
            }
            total += sum[i];
            avg[i] = (double) sum[i] / school[i].length;
//            System.out.println("dog"+avg[i]);
            avgTotal += avg[i];

        }

        // 출력부
        System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
        for (int i = 0; i < school.length; i++) {
            // 1. 번호
            System.out.print(i + 1 + "\t");
            // 국영수
            for (int j = 0; j < school[i].length; j++) {
                System.out.print(school[i][j] + "\t");
            }
            System.out.print(sum[i] + "\t" + String.format("%.2f", avg[i]));

            System.out.println();

        }

        System.out.print("\t" + subTotal[0] + "\t" + subTotal[1] + "\t" + subTotal[2] +
                "\t" + total + "\t" + String.format("%.2f", avgTotal));


    }
}
