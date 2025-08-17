package ch07_method.sec03_OverLoading;

/**
 * 메서드 오버로딩에서 final
 */
public class Method03_OverLoading {
    static final class finalClassDemo { // final 키워드를 사용하여 내용을 변경할 수 없는 final 클래스 정의
        final int number = 4; // 상수
        int number2 = 5;
    }

    static class Parent { // final 클래스는 상속 불가
        //  extends finalClassDemo{
        final void finalMethod() { //오버라이딩 불가능한 메서드임 // final 메소드
            System.out.println("상속 불가능한 메서드");
        }
    }

    static class Son extends Parent {
//        void finalMethod(){ // 에러 발생. final 메서드는 상속으로 재정의 불가능함
//
//        }
    }

    public static void main(String[] args) {
        finalClassDemo fd = new finalClassDemo();
        System.out.println(fd.number2+3); // 상수가 아니라서 변경 가능
//        fd.number = 9; // 상수는 변경 불가

        Parent parent = new Son(); // 다형성
        parent.finalMethod();
    }


}
