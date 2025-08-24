package ch05_Loop.sec01_For_Loop.nested;

public class NestedEx05 {
    public static void main(String[] args) {
        // 5번
        int count = 4;

        for (int i = 0; i < count; i++) {
            // 공백 찍기
            for (int j = 0; j < i; j++) {
                // 공백 찍기
                System.out.print(" ");
            }
            // 별 찍기
            for (int k = 0; k < (2*count)-(2*i)-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
