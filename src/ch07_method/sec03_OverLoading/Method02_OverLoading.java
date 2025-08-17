package ch07_method.sec03_OverLoading;

public class Method02_OverLoading {
    public static void main(String[] args) {
        int a, b, c;
        a = 10;
        b = 20;
        c = 30;
        System.out.println(a + "," + b + "," + c + "중에 가장 큰 수는 " + getMax(a, b, c) + "입니다.");
        System.out.println(a + ", " + b + ", " + c + " 중에 제일 큰수는 " + getMax(a, b) + "입니다.");
    }

    public static int getMax(int a, int b, int c) {
        int max = a;
        if (max < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }
        return max;
    }

    public static int getMax(int a, int b) {
        return (a > b) ? a : b;
    }
}
