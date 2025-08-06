package ch04_controlflow.sec04_if_elseif;

import java.util.Scanner;

public class MathCalulater {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		int n1, n2;
		double result = 0;
		char op;
		boolean isOk = true;
		
		System.out.print("숫자_연산자_숫자: ");
		n1 = scanner.nextInt();
		op = scanner.next().charAt(0);
		n2 = scanner.nextInt();
		
		
		if (op == '+') {
			result = n1+n2;
		}else if (op == '-') {
			result = n1-n2;
		}else if (op == '*') {
			result = n1*n2;
		}else if (op == '/') {
			result = n1/n2;
		}else if (op == '%') {
			result = n1%n2;
		}else {
			isOk = false; 
		}
		if (isOk) { 
			System.out.println(n1+" "+op+" "+n2+" = "+ result);
		}else {
			System.out.println("틀렸어 다시");
		}
		scanner.close();
	}

}
