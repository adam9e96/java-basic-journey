package ch12_Inheritance.sec01_Extends;
// 되는 사례
class Parent {
    public Parent(int a, int b) {
        System.out.println("Parent 생성자: " + a + ", " + b);
    }
}

class Child extends Parent {
    public Child(int a, int b, int c) {
        super(a, b); // ✅ Parent(int, int) 호출 (가능)
        System.out.println("Child 생성자: " + c);
    }
}
// 안되는 사례
//class Parent2 {
//    public Parent2(int a, int b, int c) { }
//}
//
//class Child2 extends Parent2 {
//    public Child2(int a, int b, int c) {
//        super(a, b); // ❌ 컴파일 에러: Parent(int, int)는 없음
//    }
//}

public class Extends05 {
}
