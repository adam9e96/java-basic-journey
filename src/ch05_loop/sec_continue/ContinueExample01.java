package ch05_loop.sec_continue;

import java.util.Scanner;

public class ContinueExample01 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수 5개를 입력하세요.");
		
		int sum = 0;
		for (int i = 0; i <5; i++) {
			
			int n = scanner.nextInt(); // 키보드에서 정수를 입력받음
			System.out.println((i+1)+"번 시도함");
			if (n <= 0) {
				continue; // 양수가 아닌 경우 다음 반복으로 진행
			} else {
				sum +=  n; // 양수인 경우 덧셈
			}
			
		}
		System.out.println("양수의 합은 "+ sum);
		// 양수가 아닌 경우 sum 덧셈계산을 하지않고 다음 루프로 이동함
		// 고로 양수가 아닌경우는 sum 에 더해지지 않음
	}
}
