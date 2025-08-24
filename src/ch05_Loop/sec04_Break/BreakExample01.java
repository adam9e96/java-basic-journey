package ch05_Loop.sec04_Break;

import java.util.Scanner;
// break는 가장 가까운 loop(반복문)를 빠져나옴
public class BreakExample01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("exit를 입력하면 종료합니다.");
		while(true) {
			System.out.print(">>");
			String text = scanner.nextLine(); // 한 라인 읽기
			if(text.equals("exit")) { // "exit" 가 입력되면 반복 종료
				break; // while 문을 벗어남. break은 루프문을 탈출함
			}
			
		}
		System.out.println("종료합니다...");
		scanner.close();
	}
}
