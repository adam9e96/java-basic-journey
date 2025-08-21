package ch12_Inheritance.sec01;

// 부모 클래스가 기본 생성자가 있는 경우
class Phone02 {
    // 필드 선언
    public String model;
    public String color;

    // 기본 생성자
    public Phone02() {
        System.out.println("Phone() 생성자 실행");
    }

    // 메소드 선언
    public void bell() {
        System.out.println("벨이 울립니다.");
    }

    public void sendVoice(String message) {
        System.out.println("자기: " + message);
    }

    public void receiveVoice(String message) {
        System.out.println("상대방: " + message);
    }

    public void hangUp() {
        System.out.println("전화를 끊습니다.");
    }
}

class SmartPhone02 extends Phone02 {
    // 필드 선언
    public boolean wifi;

    // 생성자 선언
    public SmartPhone02(String model, String color) {
        super();
        this.model = model;
        this.color = color;
        System.out.println("SmartPhone(String model, String color) 생성자가 실행됨");
    }

    // 메소드 선언
    public void setWifi(boolean wifi) {
        this.wifi = wifi;
        System.out.println("와이파이 상태를 변경했습니다.");
    }

    public void internet() {
        System.out.println("인터넷에 연결합니다.");
    }
}

public class Extends02 {
    public static void main(String[] args) {
        // SmartPhone 객체 생성
        SmartPhone02 myPhone = new SmartPhone02("갤럭시", "은색");

        // Phone 으로부터 상속 받은 필드 읽기
        System.out.println("모델: " + myPhone.model);
        System.out.println("색상: " + myPhone.color);

    }
}
