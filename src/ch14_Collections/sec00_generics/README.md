# 📘 자바 제네릭(Generic) 정리

제네릭(Generic)은 **클래스, 인터페이스, 메서드를 정의할 때 타입을 파라미터로 받는 문법**이다.
컴파일 시점에 **타입 안정성**을 제공하고, 코드의 **재사용성과 가독성**을 높여준다.

---

## 1. 제네릭이 필요한 이유

### 🔴 제네릭 사용 전 (Object 기반)

```java
List list = new ArrayList();
list.add("Hello");
list.add(123);   // 다른 타입도 허용됨

String str = (String) list.get(0);  // 다운 캐스팅 필요
Integer num = (Integer) list.get(1);
```

* 타입을 일일이 캐스팅해야 함
* 런타임에 `ClassCastException` 발생 가능

### 🟢 제네릭 사용 후

```java
List<String> list = new ArrayList<>();
list.add("Hello");
// list.add(123); // 컴파일 에러 발생

String str = list.get(0); // 캐스팅 불필요
```

* 컴파일 시 타입 체크 → 타입 안정성 확보
* 불필요한 캐스팅 제거 → 가독성, 유지보수성 향상
- 참고로 자바 컬렉션은 객체(Reference Type)만 저장할 수있는데 기본타입(int, double등)을 넣으면 자동으로 Wrapper 클래스(Integer, Double)등으로 박싱되어 저장됨


---

## 2. 제네릭 기본 문법

```java
class Box<T> {
    private T value;

    public void set(T value) { this.value = value; }
    public T get() { return value; }
}
```

```java
Box<String> box1 = new Box<>();
box1.set("Hello");
String str = box1.get();

Box<Integer> box2 = new Box<>();
box2.set(100);
int num = box2.get();
```

* `T` → 타입 매개변수(Type Parameter)
* 객체 생성 시 실제 타입을 지정해야 함 (`Box<String>`, `Box<Integer>` 등)
* 컴파일러가 지정된 타입을 추론하여 타입 안정성을 보장

---

## 3. 제네릭 타입 매개변수 이름 규칙

관례적으로 한 글자 대문자를 사용:

* **T** : Type (일반적인 타입)
* **E** : Element (컬렉션 요소)
* **K, V** : Key, Value (맵 구조)
* **N** : Number (숫자)
* **R** : Return type

---

## 4. 제네릭 메서드

클래스 전체가 아닌 특정 메서드에서만 제네릭을 사용할 수도 있음.

```java
class Util {
    public static <T> T echo(T obj) {
        return obj;
    }
}

String s = Util.echo("Hi");   // String 반환
Integer i = Util.echo(123);   // Integer 반환
```

---

## 5. 제네릭의 제한 (타입 경계)

### 5.1 Upper Bound (상한 제한)

```java
class Box<T extends Number> { // Number 또는 하위 클래스만 허용
    private T value;
    public void set(T value) { this.value = value; }
    public T get() { return value; }
}

Box<Integer> intBox = new Box<>();  // OK
Box<Double> doubleBox = new Box<>(); // OK
// Box<String> strBox = new Box<>(); // 컴파일 에러
```

### 5.2 Lower Bound (하한 제한, 와일드카드에서 사용)

```java
public static void addNumber(List<? super Integer> list) {
    list.add(10);  // Integer 또는 하위 타입은 안전하게 추가 가능
}
```

---

## 6. 와일드카드 (Wildcard)

`?` 는 **알 수 없는 타입**을 의미.

### 6.1 `?` : 아무 타입이나 가능

```java
List<?> list = new ArrayList<String>();
// list.add("test"); // 불가 (타입 알 수 없음)
Object obj = list.get(0); // 반환은 Object
```

### 6.2 `? extends T` : 상한 제한 와일드카드

```java
public static void printList(List<? extends Number> list) {
    for (Number n : list) {
        System.out.println(n);
    }
}
```

* 읽기는 가능
* 쓰기는 불가 (`null`만 추가 가능)

### 6.3 `? super T` : 하한 제한 와일드카드

```java
public static void addIntegers(List<? super Integer> list) {
    list.add(10);
    list.add(20);
}
```

* 쓰기는 가능 (Integer 또는 하위 타입)
* 읽으면 `Object`로 반환됨

---

## 7. 제네릭과 배열

* 배열은 공변(Covariant)하지만, 제네릭은 불공변(Invariant).

```java
Object[] arr = new String[10]; // 허용 (런타임 에러 가능성)
List<Object> list = new ArrayList<String>(); // 불가 (컴파일 에러)
```

* 제네릭 배열 생성은 불가능

```java
// T[] arr = new T[10]; // 컴파일 에러
```

대신 `List<T>`를 사용하거나 `Object[]` 후 캐스팅.

---

## 8. 제네릭 타입 소거 (Type Erasure)

* **컴파일 시점**에만 제네릭 타입을 체크하고,
* **런타임**에는 타입 정보가 지워짐.

```java
List<String> list1 = new ArrayList<>();
List<Integer> list2 = new ArrayList<>();

System.out.println(list1.getClass() == list2.getClass()); // true
```

즉, 런타임에는 둘 다 단순히 `List`로만 존재.

---

## 9. 제네릭과 상속

* 제네릭 타입은 불공변(Invariant)이다.

```java
List<String> strList = new ArrayList<>();
// List<Object> objList = strList; // 불가
```

대신 와일드카드를 사용:

```java
List<? extends Object> objList = strList; // OK
```

---

## 10. 자바 표준 라이브러리에서 제네릭 활용 예

* `List<E>`, `Set<E>`, `Map<K,V>` : 컬렉션 프레임워크
* `Optional<T>` : 값이 있을 수도/없을 수도 있는 컨테이너
* `Comparable<T>`, `Comparator<T>` : 정렬 기준

---

## 정리

* 제네릭은 **컴파일 시 타입 안정성**을 보장하고 **캐스팅 제거**
* 클래스, 메서드, 인터페이스에 적용 가능
* `extends`, `super` 키워드로 상한/하한 제한 가능
* 와일드카드 `?`를 사용하면 유연한 타입 처리 가능
* 런타임에는 **타입 소거**가 발생하므로 리플렉션 등에서는 주의 필요