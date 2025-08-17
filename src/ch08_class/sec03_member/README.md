## 1. 인스턴스 멤버

* **객체(인스턴스)** 가 생성될 때마다 따로 할당됨.
* 객체마다 다른 값을 가질 수 있음.
* 사용하려면 `new` 로 객체를 만든 뒤 접근해야 함.
* 선언 방식:

  ```java
  class Person {
      String name; // 인스턴스 필드
      void sayHello() { // 인스턴스 메서드
          System.out.println("안녕, 나는 " + name);
      }
  }

  Person p1 = new Person();
  p1.name = "철수";
  p1.sayHello(); // 안녕, 나는 철수
  ```

---

## 2. 정적 멤버 (static 멤버)

* **클래스가 로드될 때 단 한 번 메모리에 올라감** (모든 객체가 공유).
* 객체를 만들지 않아도 `클래스명.멤버명` 으로 접근 가능.
* 모든 인스턴스가 같은 값을 공유해야 할 때 적합.
* 선언 방식:

  ```java
  class Person {
      static int population = 0; // 정적 필드
      
      Person() {
          population++; // 모든 객체가 공유하는 값 증가
      }
      
      static void showPopulation() { // 정적 메서드
          System.out.println("현재 인구 수: " + population);
      }
  }

  Person p1 = new Person();
  Person p2 = new Person();
  Person.showPopulation(); // 현재 인구 수: 2
  ```

---

## 3. 차이 요약

| 구분    | 인스턴스 멤버      | 정적 멤버           |
| ----- | ------------ | --------------- |
| 메모리   | 객체 생성 시 할당   | 클래스 로딩 시 1번만 할당 |
| 소속    | 객체(인스턴스)에 속함 | 클래스에 속함         |
| 접근 방식 | `객체참조변수.멤버`  | `클래스명.멤버`       |
| 값 공유  | 객체마다 다름      | 모든 객체가 공유       |
