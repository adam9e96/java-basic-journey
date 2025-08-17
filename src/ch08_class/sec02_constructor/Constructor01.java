package ch08_class.sec02_constructor;

class Car2 {
    // 생성자 선언
    Car2(String model, String color, int maxSpeed){

    }
}
public class Constructor01 {
    public static void main(String[] args) {
        Car2 myCar = new Car2("그랜저", "검정",250);
//        Car myCar2 = new Car(); 생성자를 개발자가 정의했으면 기본 생성자는 호출못함
    }
}
