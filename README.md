# Spring-boot-adminProject
스프링부트 학습을 위한 토이 프로젝트.
CRUD 연습용 Admin Site 만들기.

### API

| Address                        | Explanation                |
|--------------------------------|----------------------------|
| localhost:8080/pages                | 고객관리 화면을 볼수 있는 웹사이트 |
| localhost:8080/api/user/{id}        |User CRUD                   |
| localhost:8080/api/partner/{id}     |Partner CRUD                |
| localhost:8080/api/item/{id}        |Item CRUD                   |
| localhost:8080/api/orderGroup/{id}  |OrderGroup CRUD             |
| localhost:8080/api/orderDetail/{id} |OrderDetail CRUD            |




## 학습노트

### 자바

#### 1. Abstract class & Interface
Abstract class 는 충상 클래스로 단일 상속을 목적으로 상속을 받아 기능을 확장시키기 위해 존재한다. Interface는 구현하는 모든 클래스에 대해 특정한 메소드가 만드시 존재하도록 강제하는 역할이다. 둘 다 선언만 있고 구현은 없으며, 객체를 생성할 없다. 추상 클래스는 extends로 상속받을 수 있고 인터페이스는 implement를 통해 구현한다. 또한 인터페이스는 상속과 다르게 다중으로 구현할 수 있다.

#### 2. Public, private, protected
Public은 어디서든 접근 가능.
Private은 오직 같은 클래스내에서만 접근 가능
Protected는 같은 클래스, 같은 패캐지, 혹은 상속받은 클래스만 접근 가능

#### 4. Stream
자료의 대상과 관계없이 동일한 연산을 수행할 수 있는 기능이다(자료의 추상화). 배열, 컬렉션에 동이란 연산이 수행되어 일관성 있는 처리 해주는 객체이다. 
- 한번 생성하고 사용한 스트림은 재사용 X
- 스트림 연산은 기존 자료를 변경하지 않는다
- 중간 연산과 최종 연산으로 구분된다.
- 최종 연산이 수행되어야 모든 연산이 적용되는 지연연산이다.

1. 중간 연산 - filter(), map() 
  조건에 맞는 요소를 추출하거나(filter) 요소를 변환함(map).
  
2. 최종 연산 - forEach, count, sum
```
arrayList.stream().filter(s -> s.length() >= 5).forEach(s -> System.out.println(s));
```

3. reduce()
정의된 연산이 아닌 프로그래머가 직접 지정하는 연산을 적용. 최종 연산이다.
```
Arrays.stream(arr).reduce(0, (a,b) -> a+b);
// 0 : 초깃값
// a,b: 전달되는 요소
// a+b: 각 요소가 수행해야 하는 기능들
```



### 스프링부트

#### 1. 스프링부트
스프링 기반의 애플리케이션을 쉽게 만들기 해주는 스프링 프로젝트이다. 기존의 스프링은 여러가지 라이브러리나 설정들을 직접 다 설정하여야해서 생산성에 문제가 있었다. 스프링부트는 이러한 라이브러리들을 미리 내장하고 있어 쉽게 설정할 수 있도록 도와주는 프레임워크이다.


#### 2. Gradle
Gradle은 오픈소스 빌드 도구이다. 빌드 도구란 개발에 있어서 자동으로 빌드를 도와주는 프로그램이다.
#### 3. Lombok
Lombok이란 자바 라이브러리로, 반복되는 getter, setter, toString 등의 메서드 작성 코드를 줄여주는 코드 다이어트 라이브러리이다. Lombok은 어노테이션을 기반으로 코드를 컴파일과정에서 생성해주는 방식으로 동작한다.
#### 4. JPA
Java Persistence API. 자바 어플리케이션에서 관계형 데이터베이스를 사용하는 방식을 정의한 인터페이스이다. 
- Hibernate: JPA를 구현한 구현체이다.
- Repository
