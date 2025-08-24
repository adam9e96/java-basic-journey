package ch08_Class.sec06_AccessModifier;

public class Modifier02 {

    // 필드 선언
    Modifier02 m1 = new Modifier02(true); // public, O
    Modifier02 m2 = new Modifier02(1); // default, O
    Modifier02 m3 = new Modifier02("문자열"); // private, O

    // public 접근 제한 생성자 선언
    public Modifier02(boolean a) {
    }

    // default 접근 제한 생성자 선언
    Modifier02(int b) {
    }

    // private 접근 제한 생성자 선언
    private Modifier02(String s) {
    }
}
