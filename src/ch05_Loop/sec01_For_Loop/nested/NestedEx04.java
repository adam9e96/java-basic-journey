package ch05_Loop.sec01_For_Loop.nested;

/*
 *    *
 *   ***
 *  *****
 */
public class NestedEx04 {
    public static void main(String[] args) {
        // 4번 최적화
        int count = 4;

        for (int i = 0; i < count; i++) {
            // 공백찍기
            for (int j = 0; j < count - i; j++) {
                System.out.print(" ");
                //1 < 3-1
            }
            // 별 찍기
            for (int k = 0; k <= (2 * i); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
