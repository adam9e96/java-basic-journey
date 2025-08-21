package ch12_Inheritance.sec01;
// 부모 클래스에서 매개변수가 있는 생성자만 있는 경우:
// 자식클래스에서 super(); X 부모클래스 생성자 파라미터에 맞게 super(매개변수, ...) 만들어야함
// 기본생성자였거나 만들지 않았다면 super()도 자식클래스에서 안만들어도 컴파일러가
// 자동으로 super()를 추가해주기 때문에 자식클래스에서 별도로 super()를 호출하지 않아도 문제없음
class Phone03 {
    // 필드 선언
    public String model;
    public String color;

    // 매개변수를 갖는 생성자 선언
    public Phone03(String model, String color) {
        this.model = model;
        this.color = color;
        System.out.println("부모 생성자 Phone(String model, String color) 생성자 실행");
    }
}

class SmartPhone03 extends Phone03 {

    // 자식 생성자 선언
    public SmartPhone03(String model, String color) {
        super(model, color);
        System.out.println("자식 생성자 SmartPhone(String model, String color) 생성자가 실행됨");
    }
}

public class Extends03 {
    public static void main(String[] args) {
        // SmartPhone  객체 생성
        SmartPhone03 myPhone = new SmartPhone03("갤럭시", "크림화이트");

        // Phone으로부터 상속 받은 필드 읽기
        System.out.println("모델: " + myPhone.model);
        System.out.println("색상: " + myPhone.color);
    }
}
