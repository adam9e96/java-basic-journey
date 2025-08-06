package ch03_operators.sec03_inc_dec_operators;

public class IncreaseDecreaseOperatorExample01 {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        x++;
        ++x;
        System.out.println("x= " + x);
        System.out.println("----------------");

        y--;
        --y;
        System.out.println("y= " + y);
        System.out.println("-----------------");

        z = x++;
        System.out.println("z= " + z);
        System.out.println("x= " + x);
        System.out.println("-----------------");

        z = ++x;
        System.out.println("z= " + z);
        System.out.println("x= " + x);
        System.out.println("-----------------");

        // 여기까지 x 는 14, y 는 8임
        z = ++x + y++;
        System.out.println("x= " + x); // 15
        System.out.println("y= " + y); // 9
        System.out.println("z= " + z); // 23


    }
}
