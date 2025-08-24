package ch05_Loop.sec02_While_Loop;

public class WhileExample03 {
    public static void main(String[] args) {
        // 중첩 while 문을 이용한 구구단 출력하기
        int i = 2;
        while (i <= 9) {
            System.out.println("*** " + i + "단 ***");
            int j = 1;
            while (j <= 9) {
                System.out.println(i + "* " + j + " = " + i * j);
                j++;
            }
            System.out.println();
            i++;
        } // while 문 끝 (i<=9)
    }
}
