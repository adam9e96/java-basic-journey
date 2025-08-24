package ch05_Loop.sec01_For_Loop.nested;

public class NestedEx01 {
	public static void main(String[] args) {
		
		/*
		 * 출력 예제
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 */
//		for(int i = 1; i <= 5; i++) { // 5번 실행함
//			for(int j = 0; j < i; j++) {
//				System.out.print('*');
//			}
//			System.out.println();
//		}

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
	}
}
