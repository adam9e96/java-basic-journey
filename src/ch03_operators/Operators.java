package ch03_operators;

public class Operators {
    public static void main(String[] args) {


        // 논리 연산자
        boolean f = true;
        boolean g = false;
        System.out.println("f && g is " + (f && g)); // AND
        System.out.println("f || g is " + (f || g)); // OR
        System.out.println("!f is " + (!f));       // NOT

        // 대입 연산자
        int h = 10;
        h += 5; // h = h + 5
        System.out.println("h = " + h);
    }
}
