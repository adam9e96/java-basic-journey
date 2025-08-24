package ch14_Collections.sec00_generics;

// 제네릭 클래스 작성
public class Generic01<T> { // 제네릭 클래스, 타입 매개변수 T
    T val; // 변수 val 의 타입은 T

    void set(T a) {
        val = a; // T 타입의 값 a를 val에 지정
    }

    T get() {
        return val; // T 타입의 값 val  리턴
    }
}
