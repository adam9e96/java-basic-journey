package ch05_loop.sec01_ForLoop.nested;

/*
 * 출력 예시
 *  *****
 *   ***
 *    *
 */
public class NestedEx04B {
	public static void main(String[] args) {
		// 4번 최적화
		int count = 3;
		
		for(int i= 1; i <= count; i++) {
			// 공백찍기
			for(int j=1; j<= count-i ;j++) {
				System.out.print(" ");
				//1 < 3-1
			}
			// 별 찍기
			for(int k = 0; k < (2*i)-1 ; k++) {
				System.out.print("*");
			}			
			System.out.println();
		}
		
	}
}
