package ch12_Inheritance.sec01_Extends;
// super()는 자식 생성자 메서드에서 철줄에 있어야한다
// super()은 객체 생성하려는 부모의 생성자에 맞게 해야한다.

class Point {
    private int x, y; // 한 점을 구성하는 x, y 좌표

    public Point() {
        this.x = this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void showPoint() { // 점의 좌표 출력
        System.out.println("(" + x + "," + y + ")");
    }
}

class ColorPoint extends Point { // Point를 상속받은 ColorPoint 선언
    private String color; // 점의 색

    public ColorPoint(int x, int y, String color) {
        super(x, y); // Point의 생성자 Point(x, y) 호출
        this.color = color;
    }

    public void showColorPoint() { // 컬러 점의 좌표 출력
        System.out.println(color);
        showPoint(); // Point 클래스의 showPoint() 호출
    }
}

public class Extends04 {
    public static void main(String[] args) {
        ColorPoint cp = new ColorPoint(5, 6, "blue");
        cp.showColorPoint();
    }
}
