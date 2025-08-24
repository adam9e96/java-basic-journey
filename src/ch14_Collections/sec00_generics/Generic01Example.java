package ch14_Collections.sec00_generics;

public class Generic01Example {
    public static void main(String[] args) {
        // 제네릭 클래스를 사용할 때는(객체 생성) 구체화라고 부르며 타입 매개변수를 만들었으면
        // 구체적인 타입을 적음
        Generic01<String> s = new Generic01<>(); // 제네릭 타입 T을 String 으로 구체화
        s.set("hello");
        System.out.println(s.get()); // hello

        Generic01<Integer> n = new Generic01<>(); // 제네릭 타입 T를 Integer 으로 구체화
        n.set(13);
        System.out.println(n.get());
    }
}
