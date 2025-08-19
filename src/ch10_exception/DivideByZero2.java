package ch10_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZero2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dividend; // 나뉨수
		int divisor; // 나눗수

		try {
			System.out.print("나뉨수를 입력하시오: ");
			dividend = scanner.nextInt(); // 나뉨수 입력
			System.out.print("나눗수를 입력하시오: ");
			divisor = scanner.nextInt(); // 나눗수 입력
			System.out.println(dividend + "를 " + divisor + "로 나누면 몫은 " + dividend / divisor + "입니다.");
			
		} catch (ArithmeticException e) {
			System.out.println("에러 발생");
			System.out.println("0을 나눌수는 없음");
		} catch (InputMismatchException e){
			System.out.println("에러 발생");
			System.out.println("숫자만 입력가능함");
		} finally {
			
			scanner.close();
		}

		
		// 100 과 0을 입력하면 xception in thread "main" java.lang.ArithmeticException: / by zero
        // at ch10_exception.DivideByZero.main(DivideByZero.java:15) 에러 발생
	}
}
