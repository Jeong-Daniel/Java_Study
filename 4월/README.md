### 1. Hash  
자바의 맵(Map)중 가장 간단한 HashMap  
Map 역시 List와 마찬가지로 인터페이스이다. Map 인터페이스를 구현한 Map자료형에는 HashMap, LinkedHashMap, TreeMap등이 있다.  
집합(Set) 자료형은 집합과 관련된 것을 쉽게 처리하기 위해 만든 자료형이다. 특징으로는 중복을 허용하지 않으며 순서가 없다.  
---
### 2. Set  
교집합(retainAll), 합집합(addAll), 차집합(removeAll)  
값 추가(add), 여러 값 추가(addAll), 특정 값 제거(remove)  
TreeSet - 오름차순으로 값을 정렬하여 저장하는 특징이 있다.  
LinkedHashSet - 입력한 순서대로 값을 정렬하여 저장하는 특징이 있다.  
---
### 3. Enum  
Enum은 서로 관련이 있는 여러 개의 상수 집합을 정의할 때 사용하는 자료형이다.
---
### 4. 형변환  
형변환하는 방법과, final 사용방법
---
### 5. 조건문
if, for, for each, switch case
---
### 6. 객체지향(Object Oriented)
Class, Method, Call by value, 생성자(Constructor), Inheritance
---
### 7. 인터페이스(Interface)
인터페이스(interface)란 다른 클래스를 작성할 때 기본이 되는 틀을 제공하면서, 다른 클래스 사이의 중간 매개 역할까지 담당하는 일종의 추상 클래스를 의미  
자바에서 추상 클래스는 추상 메소드뿐만 아니라 생성자, 필드, 일반 메소드도 포함할 수 있다. 하지만 인터페이스(interface)는 오로지 추상 메소드와 상수만을 포함
---
### 8. 다형성(Polymorphism)
다형성(polymorphism)이란 하나의 객체가 여러 가지 타입을 가질 수 있는 것을 의미  
자바에서는 이러한 다형성을 부모 클래스 타입의 참조 변수로 자식 클래스 타입의 인스턴스를 참조할 수 있도록 하여 구현  
---
### 9. 추상클래스(Abstract Class)
추상 메소드(abstract method)란 자식 클래스에서 반드시 오버라이딩해야만 사용할 수 있는 메소드  
자바에서 추상 메소드를 선언하여 사용하는 목적은 추상 메소드가 포함된 클래스를 상속받는 자식 클래스가 반드시 추상 메소드를 구현하도록 하기 위함  
추상 메소드는 선언부만이 존재하며, 구현부는 작성하지 않는다. 작성되어 있지 않은 구현부를 자식 클래스에서 오버라이딩하여 사용
---

참고 : http://www.tcpschool.com/java/java_polymorphism_abstract