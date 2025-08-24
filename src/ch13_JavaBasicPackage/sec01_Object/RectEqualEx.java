package ch13_JavaBasicPackage.sec01_Object;

class Rect {
    private int width;
    private int height;

    public Rect(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public boolean equals(Object obj) { // 사각형 면적 비교
        Rect p = (Rect) obj; // obj를 Rect 로 다운 캐스팅
        if (width * height == p.width * p.height) {
            return true;
        } else {
            return false;
        }
    }
}

public class RectEqualEx {
    public static void main(String[] args) {
        Rect a = new Rect(2, 3);
        Rect b = new Rect(3, 2);
        Rect c = new Rect(3, 4);

        if (a.equals(b)) { // true
            System.out.println("a is equal to b");
        }
        if (a.equals(c)) { // false
            System.out.println("a is equal to c");
        }
        if (b.equals(c)) { // false
            System.out.println("b is equal to c");
        }
    }
}
