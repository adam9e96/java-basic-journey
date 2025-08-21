package ch12_Inheritance.sec02_MethodOverriding;

class AirPlane {
    // 메소드 선언
    public void land() {
        System.out.println("착륙 합니다");
    }

    public void fly() {
        System.out.println("일반 비행합니다.");
    }

    public void takeOff() {
        System.out.println("이륙합니다.");
    }
}

class SupersonicAirplane extends AirPlane {
    // 상수 선언
    public static final int NORMAL = 1;
    public static final int SUPERSONIC = 2;

    // 상태 필드 선언
    public int flyMode = NORMAL;

    @Override
    public void fly() {
        if (flyMode == SUPERSONIC) {
            System.out.println("초음속 비행입니다.");
        } else {
            // Airplane 객체의 fly() 메서드 호출
            super.fly();
        }
    }
}

public class MethodOverriding01 {
    public static void main(String[] args) {
        SupersonicAirplane sa = new SupersonicAirplane();
        sa.takeOff();
        sa.fly();
        sa.flyMode = SupersonicAirplane.SUPERSONIC;
        sa.fly();
        sa.flyMode = SupersonicAirplane.NORMAL;
        sa.fly();
        sa.land();
    }
}
