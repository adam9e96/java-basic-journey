package ch05_loop.for_loop;

public class ForExample04 {
	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i =1; i<=10; i++) {
			sum +=i;
			System.out.print(i);
			
			if(i <= 9) { // i가 1 ~ 9까지 유효
				System.out.print('+');
			} else {
				// i가 10인 경우
				System.out.print("=  "); // '=' 출력하고
				System.out.print(sum); // 덧셈 결과 출력
			}
			
		}
		
		
	}
}
