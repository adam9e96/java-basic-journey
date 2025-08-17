package ch08_class.sec02_constructor;

// 다른 생성자 호출 this()사용
class Car3 {
    // 필드 선언
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    Car3(String model) {
        this(model, "은색", 250);
    }

    Car3(String model, String color) {
        this(model, color, 250);
    }

    Car3(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}

public class Constructor04 {
    public static void main(String[] args) {
        Car3 car1 = new Car3("자가용");
        System.out.println("car1.company : " + car1.company);
        System.out.println("car1.model : " + car1.model);
        System.out.println();

        Car3 car2 = new Car3("자가용", "빨강");
        System.out.println("car2.company : " + car2.company);
        System.out.println("car2.model : "  +car2.model);
        System.out.println("car2.color : " + car2.color);
        System.out.println();

        Car3 car3 = new Car3("택시","검정",200);
        System.out.println("car3.company : " +car3.company);
        System.out.println("car3.model :  " +car3.model);
        System.out.println("car3.color : " + car3.color);
        System.out.println();


    }
}
