package ch07_method.sec04_CallByXX;

import java.util.Arrays;

/**
 * 참조에 의한 호출 방식
 * 매개변수의 타입이 참조형 타입일때 사용
 * 참조에 의한 호출은 메소드 호출 시 참조 데이터의 위치가 매개변수에 전달됨.
 * <p>
 * 값에 의한 호출은 메모리에 동일한 값을 복사 후 사용. 참조에 의한 호출은 메모리 주소를 넘기기 때문에 값을 복사하지 않음
 */
public class CallByReference {

    // 배열을 매개변수로 받아서, 원래 저장된 값보다 1이 증가한 값으로 업데이트
    public static void increase(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i]++;
        }
    }

    public static void main(String[] args) {
        int[] refArray = {100, 800, 1000}; // 배열 선언 및 초기화. 배열은 참조형 데이터
        System.out.println("메소드 호출 전");
        for (int i = 0; i < refArray.length; i++) {
            System.out.println("refArray[" + i + "]: " + refArray[i]);
        }
        System.out.println(Arrays.toString(refArray));

        increase(refArray); // 리턴은 없음
        System.out.println("메소드 호출 후");
        // 배열은 참조형이라 메서드 호출 후 값이 변경됨
        for (int i = 0; i < refArray.length; i++) {
            System.out.println("refArray[" + i + "]: " + refArray[i]);
        }
        System.out.println(Arrays.toString(refArray));
    }
}
