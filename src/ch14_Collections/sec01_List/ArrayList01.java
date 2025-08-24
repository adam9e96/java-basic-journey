package ch14_Collections.sec01_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>(); // String 만 삽입 검색이 가능한 ArrayList 객체 생성
        arrayList.add("구마유시");
        arrayList.add("켈린");
        arrayList.add("케리아");
        arrayList.add(null); // null 삽입도 가능

        arrayList.add(1,"도란"); // 중간에 요소 삽입
        System.out.println(arrayList);

        System.out.println(arrayList.get(1)); // 요소 알아내기
        System.out.println(arrayList.size()); // ArrayList 크기 알아내기
        System.out.println(arrayList.remove(4)); // 특정 요소 삭제 null 삭제

        for (String s : arrayList) {
            System.out.print(s + "\t");
        }
        System.out.println("\n=====");
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
