# Iterator

* `Iterator`는 **컬렉션(Collection)**(List, Set, Map 등)의 요소를 순차적으로 읽어오기 위해 사용되는 **인터페이스**.
* 반복문(`for`, `while`)만으로는 컬렉션 내부 구조에 종속적일 수 있는데, `Iterator`는 **컬렉션의 내부 구조를 노출하지 않고 안전하게 순회**할 수 있게 해줌.
* `Collection` 인터페이스를 구현하는 클래스들은 기본적으로 `iterator()` 메서드를 제공.

---

## 2. 주요 메서드

`Iterator<E>` 인터페이스에서 제공하는 메서드들:

```java
public interface Iterator<E> {
    boolean hasNext();   // 다음 요소가 존재하는지 확인
    E next();            // 다음 요소 반환 (커서 이동)
    void remove();       // 현재 요소 제거 (선택적 기능)
}
```

### 설명

* **`hasNext()`**

    * 다음 요소가 있으면 `true`, 없으면 `false`.
    * 보통 반복문 조건에 사용.
* **`next()`**

    * 다음 요소를 반환하고 커서를 한 칸 이동.
    * 더 이상 요소가 없는데 호출하면 `NoSuchElementException` 발생.
* **`remove()`**

    * 마지막에 반환된 요소를 컬렉션에서 삭제.
    * `next()` 호출 후에만 실행 가능.
    * 호출하지 않거나 중복 호출하면 `IllegalStateException` 발생.

---

## 3. 사용 예시

```java
import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        Iterator<String> it = list.iterator();

        while (it.hasNext()) {
            String fruit = it.next();
            System.out.println(fruit);

            if (fruit.equals("Banana")) {
                it.remove();  // Banana 제거
            }
        }

        System.out.println("최종 리스트: " + list);
    }
}
```

**실행 결과:**

```
Apple
Banana
Cherry
최종 리스트: [Apple, Cherry]
```

---

## 4. 향상된 for문과 차이

* 향상된 for문 (`for-each`)도 내부적으로 `Iterator`를 사용함.
* 하지만 **반복 중 요소 삭제(remove)** 같은 작업은 `for-each`에서는 불가능 → `Iterator` 직접 사용해야 함.

```java
for (String fruit : list) {
    if (fruit.equals("Banana")) {
        list.remove(fruit); // ConcurrentModificationException 발생
    }
}
```

---

## 5. `ListIterator`

* `List` 컬렉션에만 제공되는 확장 인터페이스.
* 특징:

    * 양방향 탐색 가능 (`hasPrevious()`, `previous()`).
    * `set()`으로 요소 수정 가능.
    * `add()`로 순회 중 삽입 가능.

---

## 6. Iterator vs Enumeration

* `Enumeration`은 구버전(JDK 1.0) 방식, 주로 `Vector`, `Hashtable`에서 사용.
* `Iterator`는 컬렉션 프레임워크(JDK 1.2) 이후의 표준 방식.
* `Iterator`가 더 다양한 기능 제공 (삭제 가능 등).

---

## 7. 정리

* `Iterator`는 컬렉션 요소에 **일관된 방식으로 접근**하기 위한 인터페이스.
* `hasNext()` + `next()` 조합으로 안전한 순회.
* `remove()`를 사용하면 순회 중 요소 삭제도 가능.
* 단, 수정/추가에는 `Iterator` 대신 `ListIterator`나 직접 컬렉션 메서드를 활용.