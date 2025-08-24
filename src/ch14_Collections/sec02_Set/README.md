# 자바 Set

자바의 **`Set`** 컬렉션은 객체의 **순서가 없는(unordered)** 유일한(unique) 요소들의 집합을 다루는 데 사용되는 인터페이스입니다. `List`와 달리 **중복된 요소를 허용하지 않으며**, 특정 인덱스로 요소에 접근할 수 없습니다.

-----

### `Set` 인터페이스의 주요 특징

* **중복 불허**: 동일한 객체는 한 번만 저장됩니다. 중복된 요소를 추가하려고 시도하면 무시됩니다.
* **순서 없음**: 요소가 저장된 순서를 보장하지 않습니다. 대부분의 `Set` 구현체는 요소의 순서를 유지하지 않습니다.
* **null 허용**: `null` 값을 하나의 요소로 저장할 수 있습니다.

-----

### `Set` 인터페이스를 구현하는 주요 클래스

`Set`은 인터페이스이므로 직접 객체를 생성할 수 없으며, 이를 구현한 클래스를 사용해야 합니다. 대표적인 구현체는 다음과 같습니다.

#### 1\. `HashSet`

`HashSet`은 `Set` 인터페이스의 가장 대표적인 구현체로, \*\*내부적으로 해시 테이블(Hash Table)\*\*을 사용하여 요소를 저장합니다.

* **장점**:
    * **매우 빠른 성능**: 요소의 삽입, 삭제, 검색이 매우 빠릅니다. (시간 복잡도 $O(1)$)
    * **순서 보장 안됨**: 요소가 저장될 때 해시 값에 따라 위치가 결정되므로 순서를 예측할 수 없습니다.
* **단점**:
    * 요소의 순서를 유지하지 않습니다.
* **주요 사용처**: 순서가 중요하지 않고, 빠른 속도로 중복 없는 요소를 처리해야 할 때 사용합니다.

#### 2\. `LinkedHashSet`

`LinkedHashSet`은 `HashSet`과 유사하지만, **내부적으로 연결 리스트(Linked List)를 사용하여 삽입 순서를 유지**합니다.

* **장점**:
    * **삽입 순서 보장**: 요소가 추가된 순서대로 순회할 수 있습니다.
* **단점**:
    * `HashSet`보다는 약간 느릴 수 있습니다.
* **주요 사용처**: 중복 없는 요소를 저장하면서, 요소가 삽입된 순서대로 접근해야 할 때 사용합니다.

#### 3\. `TreeSet`

`TreeSet`은 **이진 탐색 트리(Red-Black Tree)** 구조로 요소를 저장합니다.

* **장점**:
    * **자동 정렬**: 요소가 **자연적인 순서(오름차순)** 또는 `Comparator`를 통해 지정된 순서대로 정렬됩니다.
* **단점**:
    * `HashSet`에 비해 삽입, 삭제, 검색 성능이 상대적으로 느립니다. (시간 복잡도 $O(log n)$)
* **주요 사용처**: 중복 없는 요소를 저장하면서, 항상 정렬된 상태를 유지해야 할 때 사용합니다.

-----

### 요약: `Set` 구현체 비교

| 구분 | `HashSet` | `LinkedHashSet` | `TreeSet` |
| :--- | :--- | :--- | :--- |
| **순서** | 보장 안됨 (무작위) | **삽입 순서** 유지 | **자동 정렬** (오름차순) |
| **성능** | 가장 빠름 ($O(1)$) | 빠름 ($O(1)$) | 느림 ($O(log n)$) |
| **내부 구조**| 해시 테이블 | 해시 테이블 + 연결 리스트 | 이진 탐색 트리 |
| **주요 용도** | 중복 제거, 빠른 검색 | 중복 제거, 삽입 순서 유지 | 중복 제거, 정렬된 상태 유지 |

-----

### Set 주요 메서드 예시

```java
import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        // HashSet 객체 생성
        Set<String> set = new HashSet<>();

        // 요소 추가
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); // 중복된 요소는 무시됩니다.

        System.out.println("현재 셋: " + set); // 현재 셋: [Banana, Apple, Cherry] (순서는 보장되지 않음)

        // 요소 삭제
        set.remove("Banana");
        System.out.println("Banana 삭제 후: " + set); // Banana 삭제 후: [Apple, Cherry]

        // 셋의 크기 확인
        System.out.println("셋의 크기: " + set.size()); // 셋의 크기: 2

        // 셋에 특정 요소가 포함되어 있는지 확인
        boolean hasCherry = set.contains("Cherry");
        System.out.println("Cherry 포함 여부: " + hasCherry); // Cherry 포함 여부: true
        
        // 모든 요소 순회 (향상된 for문 사용)
        System.out.print("모든 요소 출력: ");
        for (String item : set) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
```