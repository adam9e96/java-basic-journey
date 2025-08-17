package ch06_array.sec06_array_problems;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Ex00 {
    public static void main(String[] args) {
        /*
         * 문제 01.
         * 길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여 순서대로
         * 배열 인덱스에 넣은 후 그 값을 출력 하세요.
         * ex.
         * 1 2 3 4 5 6 7 8 9 10
         */
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.println(Arrays.toString(arr)); // 테스트 코드

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("==================");
        /*
         * 문제 02.
         * 길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여 역순으로
         * 배열 인덱스에 넣은 후 그 값을 출력 하세요.
         * ex.
         * 10 9 8 7 6 5 4 3 2 1
         */
        int[] arr2 = new int[10];
        int num = 10;
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = num;
            num--;
//          System.out.println(arr2.length);
            System.out.print(arr2[i] + " ");
        }
        System.out.println("\n===========================");
        /*
         * 문제 03.
         * 사용자에게 입력 받은 양의 정수 만큼 배열 크기를 할당하고
         * 1부터 입력 받은 값까지 배열에 초기화 한 후 출력하세요.
         * ex.
         * 양의 정수 >>> 5
         * 1 2 3 4 5
         * */
        Scanner scanner = new Scanner(System.in);

//        System.out.print("양의 정수 >>> ");
//        int userInput = scanner.nextInt();
//        int[] arr3 = new int[userInput];
//        for (int i = 0; i < arr3.length; i++) {
//            arr3[i] = i + 1;
//            System.out.print(arr3[i] + " ");
//        }
//
//        System.out.println("\n==============================");
        /*
         * 문제 04. 길이가 5인 String 배열을 선언하고 "사과","귤","포도","복숭아","참외"로 초기화 한 후 배열 인덱스를 활용해서
         * 귤을 출력하세요.
         * ex.
         * 귤
         */
        String[] arr4 = {"사과", "귤", "포도", "복숭아", "참외"};
        System.out.println(arr4[1]);


        System.out.println("\n==================================");


        /*
         * 문제 05.
         * 문자열을 입력 받아 문자 하나 하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
         * 개수와 몇 번째 인덱스에 위치 하는지 인덱스를 출력하세요.
         * ex.
         * 문자열 : application
         * 문자 : i
         * application에 i 가 존재하는 위치(인덱스) : 4 8
         * i 개수 : 2
         */
//        System.out.println();
//        System.out.print("문자열 >>> ");
//        String str = scanner.nextLine();
//
//        System.out.print("문자 >>> ");
//        char ch = scanner.nextLine().charAt(0);
//        // Scanner에서 문자를 바로 입력받는 기능은 없다.
//        // next()나 nextLine()으로 문자열을 바아서 charAt(0)으로
//        // 첫번째 문자를 받아 올 수 있다.
//        char[] charArr = new char[str.length()]; // 문자열의 길이 만큼 크기 생성
//
//        for (int i = 0; i < charArr.length; i++) {
//            charArr[i] = str.charAt(i);
//        }
//
//        System.out.println("charArr배열 출력:" + Arrays.toString(charArr));
//
//        int count = 0;
//        System.out.print(str + "에 " + ch + "가 존재하는 위치(인덱스) : ");
//        for (int i = 0; i < charArr.length; i++) {
//            if (charArr[i] == ch) {
//                System.out.print(i + " ");
//                count++;
//            }
//        }
//        System.out.println();
//        System.out.println("i 개수 : " + count);

        System.out.println("\n=================================");

        /*
         * 문제 06.
         * "월" ~ "일" 까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력 받아
         * 입력한 숫자와 같은 인덱스에 있는 요일을 출력하고 범위에 없는 숫자를 입력 시
         * "잘못 입력하셨습니다"를 출력하세요.
         *
         * ex.
         * 0 ~ 6 사이 숫자 입력 : 4
         * 금요일
         *
         * 0 ~ 6 사이 숫자 입력 : 7
         * 잘못 입력하셨습니다.
         */
        String[] str = {"월", "화", "수", "목", "금", "토", "일"}; // char 형 배열

        System.out.print("0 ~ 6 사이 숫자 입력 : ");
        int userInput = scanner.nextInt();

        if (userInput >= 0 && userInput < 7) {
            System.out.println(str[userInput]);

        } else {
            System.out.println("잘못 입력하셨습니다.");

        }
        scanner.close();
    }
}
