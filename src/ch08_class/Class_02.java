package ch08_class;

public class Class_02 {
    public static void main(String[] args) {
        // 같은 클래스를 가지고 만든 두 객체는 구조는 동일하지만 서로 다른 저장공간을 가짐
        Car myCar1 = new Car(); // car 인스턴스 생성
        Car myCar2 = new Car(); // car 인스턴스 하나 더 생성
        Car myCar3 = new Car();

        myCar1.color = "red"; // myCar1 인스턴스의 색상을 빨강으로 설정
        myCar2.color = "black"; // myCar2 인스턴스의 색상을 검정으로 설정

        myCar1.speedUp(); // myCar1 인스턴스의 액셀 메서드 호출
        myCar2.wiper(); // myCar2 인스턴스의 와이퍼 메서드 호출

        System.out.println("myCar1의 색: " + myCar1.color); // red
        System.out.println("myCar2의 색: " + myCar2.color); // black

        System.out.println("myCar1의 속도: " + myCar1.speed); // 1
        System.out.println("myCar2의 속도: " + myCar2.speed); // 0

        System.out.println("myCar1의 와이퍼 작동 여부: " + myCar1.wiperOn); // false
        System.out.println("myCar2의 와이퍼 작동 여부: " + myCar2.wiperOn); // true

        // 서로 다른 주소값
        System.out.println(myCar1);
        System.out.println(myCar2);
        System.out.println(myCar3);
    }
}
