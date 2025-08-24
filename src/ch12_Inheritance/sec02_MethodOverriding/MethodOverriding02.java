package ch12_Inheritance.sec02_MethodOverriding;

class Shape { // 슈퍼 클래스
    public Shape next;
    public int count = 0;

    public Shape() {
        next = null;
        System.out.println("부모 생성자 실행됨" + count++);
        // count가 누적이 안됨 count가 인스턴스 변수라서 객체가 생성될 때마다 새로 할당됨
    }

    public void draw() {
        System.out.println("Shape");
    }
}

class Line extends Shape {
    @Override
    public void draw() { // 메소드 오버라이딩
        System.out.println("Line");
    }
}

class Rect extends Shape {

    @Override
    public void draw() { // 메소드 오버라이딩
        System.out.println("Rect");
    }
}

class Circle extends Shape {

    @Override
    public void draw() { // 메소드 오버라이딩
        System.out.println("Circle");
    }
}

public class MethodOverriding02 {
    static void paint(Shape p) {
        p.draw(); // p가 가리키는 객체 냉메 오버라이딩된 draw() 호출. 동적 바인임임
    }

    public static void main(String[] args) {
        Line line = new Line();

        // 다음 호출들은 모두 paint() 메소드 내에서 Shape에 대한 레퍼런스 p로 업캐스팅됨
        paint(line); // Line에서 오버라이딩한 draw() 실행, "Line" 출력
        paint(new Shape()); // Shape의 draw() 실행. "Shape" 출력
        paint(new Line()); // Line에 오버라이딩한 draw() 실행, "Line" 출력
        paint(new Rect()); // Rect에 오버라이딩한 draw() 실행, "Rect" 출력
        paint(new Circle()); // Circle에 오버라이딩한 draw() 실행, "Circle" 출력\
    }
}
