package ch05_Loop.sec01_For_Loop.nested;

public class NestedEx05B {
	public static void main(String[] args) {
		// 5번
		int count = 3;
		
		for(int i= 1; i <= count; i++) {
			
			for(int j= 1; j < i; j++) {
				// 공백 찍기
				System.out.print(" ");
			}
			// 별 찍기
			for(int k = 0; k < ((2*count)-2*i+1) ; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
