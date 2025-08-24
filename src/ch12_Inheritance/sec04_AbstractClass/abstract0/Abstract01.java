package ch12_Inheritance.sec04_AbstractClass.abstract0;

public class Abstract01 extends Calculator {

    @Override
    public int add(int a, int b) { // 추상 메서드 구현
        return a + b;
    }

    @Override
    public int subtract(int a, int b) { // 추상 메서드 구현
        return a - b;
    }

    @Override
    public double average(int[] a) { // 추상 메서드 구현
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum / a.length;
    }

    public static void main(String[] args) {
        Abstract01 c = new Abstract01();
        System.out.println(c.add(2, 3));
        System.out.println(c.subtract(2, 3));
        System.out.println(c.average(new int[]{2, 3, 4}));
    }
}
