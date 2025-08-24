# Java Random 클래스

Java 에서 난수를 생성할 때 주로 사용하는 클래스 

위치는 `java.util.Random`

이 클래스는 다양한 타입의 난수를 생성할 수 있으며, 
시드(seed)를 설정하여 예측 가능한 난수 시퀀스를 만들 수 있음.

## 특징
- `Random` 클래스는 난수를 생성함
- 생성자에서 시드(seed) 값을 지정하지 않으면, 현재 시간등을 기반으로 자동으로 설정함.
- 같은 시드를 사용하면 항상 같은 난수 시퀀스를 생성함

| 생성자                     | 설명                      |
| ----------------------- | ----------------------- |
| `new Random()`          | 기본 생성자 (현재 시간 기준 시드 사용) |
| `new Random(long seed)` | 고정된 시드로 생성              |

## 메서드
| 메서드                  | 설명               | 반환값       |
| -------------------- | ---------------- | --------- |
| `nextInt()`          | int 범위 내 난수      | `int`     |
| `nextInt(int bound)` | 0 이상 bound 미만 정수 | `int`     |
| `nextDouble()`       | 0.0 이상 1.0 미만 실수 | `double`  |
| `nextFloat()`        | 0.0 이상 1.0 미만 실수 | `float`   |
| `nextBoolean()`      | true 또는 false    | `boolean` |
| `nextLong()`         | long 범위 난수       | `long`    |
| `setSeed(long seed)` | 시드 재설정           | void      |

