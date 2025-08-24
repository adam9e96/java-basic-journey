# 박싱(boxing), 언박싱(unboxing)

- 박싱은 기본 타입 값을 Wrapper 객체로 변환하는 것
- 언박싱은 Wrapper 객체를 기본 타입으로 변환하는 것

박싱과 언박싱은 자동으로 이루어지며, 이를 자동 박싱(auto boxing), 자동 언박싱(auto unboxing)
이라고 부른다.

```java
Integer ten = 10; // 자동 박싱 -> Integer ten = Integer.valueOf(10); 로 자동 처리됨
int n = ten; // 자동 언박싱 -> int n = ten.intValue(); 로 자동 처리됨
```
