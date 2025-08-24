package ch05_Loop.sec01_For_Loop.nested;

/**
 * 출력 예제
 * *****
 * ****
 * ***
 * **
 * *
 */
public class NestedEx02 {
    public static void main(String[] args) {

//		for(int i =5; i>=1; i--) {
////			System.out.println(i);
//			for(int j=1; j<=i; j++) {
//				System.out.print('*');
//			}
//			System.out.println();
//		}

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < (5 - i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
