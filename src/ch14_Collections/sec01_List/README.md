# 자바 List

자바의 **`List`** 컬렉션은 객체의 **순서가 있는(ordered)** 집합을 다루는 데 사용되는 인터페이스입니다. **중복된 요소를 허용**하며, 각 요소는 삽입된 순서대로 인덱스를 가집니다. 이를 통해 특정 위치에 있는 요소에 접근하거나 요소를 삽입, 삭제하는 등의 작업이 가능합니다.

-----

### `List` 인터페이스의 주요 특징

* **순서 보장**: 요소가 추가된 순서대로 저장됩니다.
* **인덱스**: 정수 인덱스를 사용하여 각 요소에 접근할 수 있습니다.
* **중복 허용**: 동일한 객체를 여러 번 저장할 수 있습니다.

-----

### `List` 인터페이스를 구현하는 주요 클래스

`List`는 인터페이스이므로 직접 객체를 생성할 수 없으며, 이를 구현한 클래스를 사용해야 합니다. 대표적인 구현체는 다음과 같습니다.

#### 1\. `ArrayList`

`ArrayList`는 **내부적으로 배열을 사용하여** 요소를 저장합니다. 배열의 특성상 인덱스를 통한 요소 접근이 매우 빠르다는 장점이 있습니다.

* **장점**:
    * **요소 접근(get)**: `get(index)` 메서드를 사용한 요소 접근이 빠릅니다. (시간 복잡도 $O(1)$)
    * **메모리 효율성**: 인덱스를 사용하므로 메모리 사용량이 상대적으로 적습니다.
* **단점**:
    * **요소 삽입/삭제**: 중간에 요소를 삽입하거나 삭제할 경우, 그 뒤의 모든 요소를 한 칸씩 이동시켜야 하므로 성능 저하가 발생할 수 있습니다. (시간 복잡도 $O(n)$)
* **주요 사용처**: 데이터의 조회(읽기) 작업이 빈번할 때 효과적입니다.

#### 2\. `LinkedList`

`LinkedList`는 **노드(Node) 기반의 이중 연결 리스트**로 구현됩니다. 각 노드는 데이터와 이전/다음 노드를 가리키는 주소를 가지고 있습니다.

* **장점**:
    * **요소 삽입/삭제**: 중간에 요소를 추가하거나 제거할 때, 연결된 노드의 주소만 변경하면 되므로 `ArrayList`에 비해 빠릅니다. (시간 복잡도 $O(1)$)
* **단점**:
    * **요소 접근(get)**: 특정 인덱스의 요소에 접근하려면 처음부터 순차적으로 탐색해야 하므로 느립니다. (시간 복잡도 $O(n)$)
    * **메모리 사용량**: 각 노드가 이전/다음 노드의 주소 정보를 가지고 있어야 하므로 `ArrayList`보다 메모리 사용량이 많습니다.
* **주요 사용처**: 데이터의 삽입/삭제가 빈번할 때 효과적입니다.

-----

### `Vector`와 `Stack`

`Vector`와 `Stack` 역시 `List` 인터페이스를 구현하지만, 현대 자바에서는 잘 사용되지 않습니다.

* **`Vector`**: `ArrayList`와 유사하지만 \*\*스레드에 안전(thread-safe)\*\*합니다. 이로 인해 성능 오버헤드가 발생할 수 있어, 보통 `ArrayList`를 사용하고 필요한 경우에만 동기화 처리를 직접 구현하는 것이 일반적입니다.
* **`Stack`**: LIFO(Last-In, First-Out) 구조를 구현하는 클래스입니다. `push`, `pop`, `peek` 등의 메서드를 제공합니다. `Vector`를 상속받았기 때문에 동기화 처리되어 있습니다.

-----

### 요약: `ArrayList` vs `LinkedList`

| 구분 | `ArrayList` | `LinkedList` |
| :--- | :--- | :--- |
| **내부 구조** | 배열 | 이중 연결 리스트 |
| **요소 접근** | 빠름 ($O(1)$) | 느림 ($O(n)$) |
| **삽입/삭제** | 느림 ($O(n)$) | 빠름 ($O(1)$) |
| **메모리** | 상대적으로 적게 사용 | 상대적으로 많이 사용 |
| **주요 용도** | 조회(읽기) 작업이 많은 경우 | 삽입/삭제 작업이 많은 경우 |

-----

### List 주요 메서드 예시

```java
import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        // ArrayList 객체 생성
        List<String> list = new ArrayList<>();

        // 요소 추가
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Apple"); // 중복 허용

        System.out.println("현재 리스트: " + list); // 현재 리스트: [Apple, Banana, Cherry, Apple]

        // 특정 인덱스에 요소 추가
        list.add(1, "Grape");
        System.out.println("요소 삽입 후: " + list); // 요소 삽입 후: [Apple, Grape, Banana, Cherry, Apple]

        // 특정 인덱스의 요소 가져오기
        String fruit = list.get(2);
        System.out.println("인덱스 2의 요소: " + fruit); // 인덱스 2의 요소: Banana

        // 요소 삭제
        list.remove("Banana");
        System.out.println("Banana 삭제 후: " + list); // Banana 삭제 후: [Apple, Grape, Cherry, Apple]

        // 인덱스로 삭제
        list.remove(0);
        System.out.println("인덱스 0 삭제 후: " + list); // 인덱스 0 삭제 후: [Grape, Cherry, Apple]

        // 리스트 크기 확인
        System.out.println("리스트 크기: " + list.size()); // 리스트 크기: 3

        // 리스트에 특정 요소가 포함되어 있는지 확인
        boolean hasCherry = list.contains("Cherry");
        System.out.println("Cherry 포함 여부: " + hasCherry); // Cherry 포함 여부: true

        // 모든 요소 순회
        System.out.print("모든 요소 출력: ");
        for (String item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
```