package ch10_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputException {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 3개를 입력하세요");
		int sum = 0, n = 0;
		for (int i = 0; i < 3; i++) {
			System.out.print(i + ">>");
			try {
				n = scanner.nextInt();
			} catch (InputMismatchException e) {
//				System.out.println(e.toString());
				String ex = scanner.nextLine();
				System.out.println("문제가 된 녀석: " + ex);

				System.out.println(ex + "은 정수가 아닙니다. 다시입력하세요!");
				i--; // 인덱스가 증가하지 않도록 미리 감소
				continue; // 다음 루프
			}
			sum += n; // 합하기
		}
		System.out.println("합은 " + sum);
		scanner.close();

	}

}
