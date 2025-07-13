package ch4_controlflow_if;

import java.util.Scanner;

/*
 * 사용자에게 입력받은 정수가 양수인지, 0인지, 음수인지
 * 알려주는 조건문
 */
public class IfExample02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("갑을 입력해주세요>>> ");
        int value = scanner.nextInt(); // value 변수에 사용자 입력을 받음

        if (value > 0) {
            System.out.println("양수입니다.");
        }
        if (value < 0) {
            System.out.println("음수입니다.");
        }
        if (value == 0) {
            System.out.println("0입니다.");
        }
        scanner.close();
    }
}
