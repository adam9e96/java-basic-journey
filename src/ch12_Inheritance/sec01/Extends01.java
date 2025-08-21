package ch12_Inheritance.sec01;

// 부모 클래스가 기본 생성자를 안가지는 경우
class Phone {
    // 필드 선언
    public String model;
    public String color;

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

class SmartPhone extends Phone {
    // 필드 선언
    public boolean wifi;

    // 생성자 선언
    public SmartPhone(String model, String color) {
        this.model = model;
        this.color = color;
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

public class Extends01 {
    public static void main(String[] args) {
        // SmartPhone 객체 생성
        SmartPhone myPhone = new SmartPhone("갤럭시", "은색");

        // Phone 으로부터 상속 받은 필드 읽기
        System.out.println("모델: " + myPhone.model);
        System.out.println("색상: " + myPhone.color);

        // SmartPhone의 필드 읽기
        System.out.println("와이파이 상태: " + myPhone.wifi);

        // Phone으로부터 상속받은 메서드 호출
        myPhone.bell();
        myPhone.sendVoice("여보세요.");
        myPhone.receiveVoice("안녕하세요! 저는 홍길동인데요.");
        myPhone.sendVoice("아~네, 반갑습니다.");
        myPhone.hangUp();

        // SmartPhone 의 메소드 호출
        myPhone.setWifi(true);
        myPhone.internet();
        // 상속을 받으면 자기 클래스의 메서드 필드처럼 사용이 가능해짐

        System.out.println("=====");
        Phone p1 = new SmartPhone("아이폰", "크림");
        System.out.println("모델: " + p1.model);
        System.out.println("색상: " + p1.color);

//        System.out.println("와이파이 상대: " + p1.wifi); // 부모타입으로 구현을 받으면 자식 필드 메서드는 사용못함

        p1.bell();
        p1.sendVoice("여보시오.");
        p1.receiveVoice("반갑소");
        p1.sendVoice("저는 홍길동데스");
        p1.hangUp();

//        p1.setWifi(true);
//        p1.internet();
    }
}
