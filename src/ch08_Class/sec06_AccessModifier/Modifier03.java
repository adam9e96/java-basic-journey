package ch08_Class.sec06_AccessModifier; // 패키지가 동일함

public class Modifier03 {
    // 필드 선언
    Modifier02 m1 = new Modifier02(true); // O
    Modifier02 m2 = new Modifier02(1); // O
//    Modifier02 m3 = new Modifier02("S"); // X, private 생성자 접근 불가능

}
