package ch14_Collections.sec03_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class IteratorEx {
	public static void main(String[] args) {
		// 정수 값만 다루는 제네릭 벡터 생성
		Vector<Integer> v = new Vector<Integer>();
		v.add(5); // 5 삽임
		v.add(4); // 4 삽입
		v.add(-1); // -1 삽입
		v.add(2, 100); // 4와 -1 사이에 정수 100 삽입
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(5);
		a.add(4);
		a.add(-1);
		a.add(2, 100);

		// Iterator를 이용한 모든 정수 출력하기
		Iterator<Integer> it = v.iterator(); // Iterator 객체 얻기
		while (it.hasNext()) {
			int n = it.next();
			System.out.println(n);
		}

		// Iterator를 이용한 모든 정수 더하기
		int sum = 0;
		it = v.iterator();
		while (it.hasNext()) {
			int n = it.next();
			sum += n;
		}
		System.out.println("벡터에 있는 정수 합: " + sum);
		System.out.println("====================");
		Iterator<Integer> ita = a.iterator();
		while (ita.hasNext()) {
			int n = ita.next();
			System.out.println(n);
		}
	}
}
