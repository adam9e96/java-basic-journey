package ch08_Class.sec02_Constructor;

class Car2 {
    // 생성자 선언
    Car2(String model, String color, int maxSpeed){

    }
}
public class Constructor01 {
    public static void main(String[] args) {
        Car2 myCar = new Car2("그랜저", "검정",250);
//        Car myCar2 = new Car(); 생성자를 개발자가 정의했으면 기본 생성자는 호출못함 기본생성자를 컴파일러에서 자동으로 안만듬
        // 개발자가 작성한 생성자가 있으면 의도상 기본 생성자를 필요없다고 보기때문
    }
}
