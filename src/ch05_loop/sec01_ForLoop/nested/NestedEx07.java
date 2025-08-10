package ch05_loop.sec01_ForLoop.nested;

/*
 * 구구단 만들기 1~9단
 */
public class NestedEx07 {
    public static void main(String[] args) {

        // 1 ~ 9 x j =
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(i + " * " + j + " = " + (i * j));
                System.out.print('\t');
            }
            System.out.println();
        }
    }
}
