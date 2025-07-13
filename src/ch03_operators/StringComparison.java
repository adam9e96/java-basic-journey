package ch03_operators;

public class StringComparison {
    public static void main(String[] args) {

        // 숫자 비교 연산자 예시
        double a = 3.14;
        double b = 5.14;

        System.out.println(a == b); // false
        System.out.println(a != b); // true

        // 문자열의 경우 equals() 메서드를 이용해서 값을 비교한다.
        String c1 = "Hello JAVA!"; // 문자열 리터럴
        System.out.println(c1.equals("Hello java!")); // false
        System.out.println(c1.equals("Hello JAVA!")); // true

        String c2 = "Hello JAVA!"; // 동일한 문자열 리터럴
        String c3 = new String("Hello JAVA!"); // new 키워드를 사용하여 생성된 문자열 객체

        System.out.println(c1 == c2); // true (리터럴이므로 같은 객체)
        System.out.println(c1 == c3); // false (다른 객체)
        System.out.println(c2 == c3); // false

        System.out.println(c1.equals(c2)); // true (내용 비교)
        System.out.println(c1.equals(c3)); // true
        System.out.println(c2.equals(c3)); // true

        String c11 = "Hello JAVA JAVA";
        System.out.println(c11.equals("Hello JAVA JAVA")); // true

        /*
         * 문자열 비교는 == 연산자가 아니라 equals() 메서드를 사용해야 한다.
         * == 연산자는 객체의 참조(주소)를 비교하므로, 내용이 같아도 객체가 다르면 false를 반환한다.
         * equals() 메서드는 문자열의 실제 내용을 비교한다.
         *
         * 문자열 리터럴은 상수 풀(Constant Pool)에 저장되어,
         * 동일한 리터럴은 같은 객체를 참조하게 되어 메모리 사용을 최적화한다.
         */
    }
}
