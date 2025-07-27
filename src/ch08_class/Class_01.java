package ch08_class;

class Car {
    // 힙 메모리 공간에 들어감
    boolean powerOn; // 시동
    String color; // 차량 색상
    int wheel; // 바퀴의 수
    int speed; // 속력
    boolean wiperOn; // 와이퍼

    // 객체 메서드에 생성되는 변수는 스택에서 생성/삭제
    void power() {
        powerOn = !powerOn; // 초기화 시 boolean의 기본값은 false. power() 호출 시 true가 됨
    }

    void speedUp() {
        speed++; // 액셀 메서드
    }

    void speedDown() {
        speed--;
        ; // 브레이크 메서드
    }

    void wiper() {
        wiperOn = !wiperOn; // 와이퍼 메서드
    }
}

public class Class_01 {
    public static void main(String[] args) {
        Car myCar; // 클래스의 객체를 참조하는 참조변수 선언
        myCar = new Car(); // 클래스의 객체를 생성하고 객체의 주소를 참조변수(myCar)에 저장

        System.out.println("시동 처음 초기화 : "+myCar.powerOn);
        System.out.println("차의 색상 초기화 : "+myCar.color);
        System.out.println("바퀴의 수 초기화 : "+myCar.wheel);
        System.out.println("속려 초기화 : "+myCar.speed);
        System.out.println("와이퍼 작동 초기화 : "+myCar.wiperOn);

        System.out.println("===== 시동 =====");

        myCar.power(); // 시동 메서드 실행
        System.out.println("시동 메서드 동작 : "+myCar.powerOn);
        myCar.power();
        System.out.println("시동 메서드 다시 동작 : "+myCar.powerOn);

        myCar.color = "black"; // 색상 변수에 black 대입
        System.out.println("현재 차의 색상 : "+myCar.color);
    }
}
