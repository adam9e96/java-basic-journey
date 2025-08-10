package ch05_loop.sec01_ForLoop.nested;

// 3번
public class NestedEx03 {
    public static void main(String[] args) {
//		for(int i = 5; i >= 1; i--) {
////			System.out.println(i);
//			for(int j = 1; j<=5; j++) {
//
//				if(j >= i) {
//					System.out.print("*");
//				} else {
//					System.out.print(' ');
//				}
//			}
//			System.out.println();
//		}

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                // 빈칸 찍기
                if (j < (4 - i)) {
//                    System.out.print("  ");
                    System.out.print("ㅁ");
                }

                if (j >= (4 - i)) {
                    System.out.print("*");
                }

                // 별찍기

            }
            System.out.println();
        }
    }
}
