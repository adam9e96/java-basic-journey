# Scanner 사용법

자바에서 콘솔에서 키보드 입력값을 받을 때 사용하는 클래스

자바에서 입력값을 받는 방법중 가장 간편함. 

## Scanner 클래스 특징
- `java.util` 패키지에 포함되어 있어 java.util 을 `import` 해줘야 사용 가능함.
- 기본적인 데이터 타입을 모두 입력받을 수 있다.
- 토큰(공백, 개행, 탭)을 기준으로 데이터를 입력받는다.

### Scanner 사용
1. Scanner 클래스 import
아래 2가지 방법중 하나를 하면 되는데 기본적으로 첫번째로 import
```java
import java.util.Scanner; // java.util의 Scanner 클래스 import
import java.util.*; // java.util에 있는 클래스를 모두 import
```
2. Scanner 객체를 생성
Scanner 객체를 생성한다. Scanner 객체 변수명은 주로 sc 또는 scanner 으로 네이밍함.

`new` 는 새로운 객체를 `heap` 메모리에 할당하겠다는 의미이고 `System.in` 은 화면에서 입력을 
받겠다는 의미. 
```java
import java.util.Scanner;

Scanner scanner = new Scanner(System.in); // Scanner 객체 생성
```

3. Scanner 객체를 사용하여 입력값을 받음.  
입력 받을 데이터에 따라 Scanner 클래스의 메서드를 다르게 사용해야 한다.

```java
String str = scanner.next(); // 입력받은 문자열을 str에 저장 
```

| 메소드            | 설명                             |
|----------------|--------------------------------|
| next()         | String을 읽음. 토큰(Token)을 기준으로 읽음 |
| nextLine()     | String을 읽음. 개행(Enter)을 기준으로 읽음 |
| nextInt()      | int를 읽음                        |
| nextBoolean()  | boolean 을 읽음                   |
| nextByte()     | byte를 읽음                       |
| nextShort()    | short를 읽음                      |
| nextLong()     | long을 읽음                       |
| nextDouble()   | double를 읽음                     |
