# ch11 Collection(컬렉션)

자바 컬렉션 프레임워크(Collection Framework)는 **데이터를 효율적으로 저장, 검색, 수정, 삭제**하기 위한 자료구조 및 알고리즘을 제공한다.  
컬렉션은 크게 **List, Set, Map** 으로 나뉜다.

## 컬렉션 특징
- 컬렉션을 여러 타입의 값을 다룰 수 있도록 변신이 가능한 자료 구조이지만, 컬렉션을 사용할 때는 지정된 특정 타입의 값만 저장 가능하다.
- 컬렉션의 요소는 객체들만 가능하다. 기본타입의 데이터는 원칙적으로 불가능하다.(기본 타입의 값이 삽입되는건 자동 박싱때문이다)


---

## 1. Collection 인터페이스
- **java.util.Collection** 은 모든 컬렉션의 최상위 인터페이스이다.
- 하위로 `List`, `Set`, `Queue` 등이 있다.
- 주요 메소드:
  - `add(E e)` : 요소 추가
  - `remove(Object o)` : 요소 삭제
  - `clear()` : 전체 요소 삭제
  - `size()` : 요소 개수 반환
  - `isEmpty()` : 비었는지 여부
  - `contains(Object o)` : 포함 여부 확인
  - `iterator()` : 반복자 반환

---

## 2. List
- **순서가 있는 데이터 집합**
- **중복 요소 허용**
- 인덱스로 요소 접근 가능

### 대표 구현체
- **ArrayList**
  - 내부적으로 배열 기반
  - 인덱스 접근 속도가 빠름
  - 삽입/삭제가 느림(중간 요소 이동 필요)
- **LinkedList**
  - 내부적으로 양방향 연결 리스트
  - 삽입/삭제가 빠름
  - 인덱스 접근 속도가 느림
- **Vector**
  - ArrayList와 유사
  - 동기화(Synchronized) 지원 → 멀티스레드 환경에 적합하지만 성능은 느림

---

## 3. Set
- **순서가 없는 데이터 집합**
- **중복 요소 불허**

### 대표 구현체
- **HashSet**
  - 해시 기반
  - 중복 제거, 빠른 검색
  - 순서 보장 없음
- **LinkedHashSet**
  - 입력 순서 유지
  - HashSet 성능 + 순서 유지
- **TreeSet**
  - 이진 검색 트리 기반 (Red-Black Tree)
  - 자동 정렬 (오름차순 기본, `Comparator`로 사용자 정의 가능)
  - 범위 검색에 유리

---

## 4. Map
- **Key-Value 쌍으로 데이터 저장**
- **Key는 중복 불허, Value는 중복 허용**

### 대표 구현체
- **HashMap**
  - 해시 기반
  - Key 순서 보장 안 됨
  - 성능 우수
- **LinkedHashMap**
  - 입력 순서 유지
  - 캐시 구현 등에 자주 사용
- **TreeMap**
  - Key를 자동 정렬
  - 범위 검색에 유리
- **Hashtable**
  - HashMap과 유사
  - 동기화 지원 (멀티스레드 환경)
  - Legacy 클래스 (거의 안 씀)

---

## 5. Queue & Deque
- **Queue**
  - FIFO (First In First Out)
  - 대표 구현체: `LinkedList`, `PriorityQueue`
- **Deque**
  - Double Ended Queue (양방향 큐)
  - Stack과 Queue 역할 모두 가능
  - 대표 구현체: `ArrayDeque`

---

## 6. Stack
- **LIFO (Last In First Out)**
- `push()`, `pop()`, `peek()` 사용
- `Stack` 클래스는 Legacy → `ArrayDeque` 권장

---

## 7. Iterator & for-each
- **Iterator**
  - 모든 컬렉션을 순회할 수 있는 인터페이스
  - 주요 메소드
    - `hasNext()` : 다음 요소가 있는지 확인
    - `next()` : 다음 요소 반환
    - `remove()` : 현재 요소 삭제
- **for-each**
  - 컬렉션 순회 시 간결하게 사용 가능

```java
for (String item : list) {
    System.out.println(item);
}
````

---

## 8. Collections 유틸리티 클래스

* `java.util.Collections` 는 컬렉션 관련 유틸리티 메소드 제공

    * `sort(List<T>)` : 정렬
    * `reverse(List<T>)` : 역순
    * `shuffle(List<T>)` : 무작위 섞기
    * `min()/max()` : 최소/최대값 반환
    * `binarySearch()` : 이진 검색
    * `unmodifiableList()/Set()/Map()` : 읽기 전용 컬렉션 생성
    * `synchronizedList()/Set()/Map()` : 동기화된 컬렉션 생성

---

## 9. 요약

* **List** : 순서 O, 중복 O
* **Set** : 순서 X, 중복 X
* **Map** : Key-Value, Key 중복 X, Value 중복 O
* **Queue/Deque/Stack** : 선입선출(FIFO), 후입선출(LIFO) 구조 지원
