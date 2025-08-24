package ch13_JavaBasicPackage.sec01_Object;

// == 비교 : 객체 비교 객체 레퍼런스 주소를 비교
// equals() : 두 객체의 내용을 비교
class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        Point p = (Point) obj; // 객체 obj를 Point 타입으로 다운 캐스팅
        if (x == p.x && y == p.y) {
            return true;
        } else {
            return false;
        }
    }
}

public class Object03_Equals {
    public static void main(String[] args) {
        Point a = new Point(2, 3);
        Point b = new Point(2, 3);
        Point c = new Point(3, 4);

        if (a == b) { // false
            System.out.println("a==b");
        }
        if (a.equals(b)) { // true
            System.out.println("a is equal to b");
        }
        if (a.equals(c)) { // false
            System.out.println("a is equal to c");
        }
    }
}
