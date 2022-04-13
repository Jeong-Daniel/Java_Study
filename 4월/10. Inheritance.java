class Animal {
    String name;
    void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
    void sleep() {
        System.out.println(this.name+" zzz");
    }
} // 클래스의 상속을 위해서는 extends라는 키워드를 사용한다.

class HouseDog extends Dog {
    void sleep() {
        System.out.println(this.name + " zzz in house");
    }

    void sleep(int hour) {
        System.out.println(this.name + " zzz in house for " + hour + " hours");
    } // 입력항목이 다른 경우 동일한 이름의 메소드를 만들 수 있는데 이를 메소드 오버로딩(method overloading)

} // HouseDog 클래스는 Dog 클래스를 상속하여 다음과 같이 만들 수 있다. : 매서드 오버라이딩

public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("poppy");
        System.out.println(dog.name);  // poppy 출력
        dog.sleep();  // poppy zzz 출력

        HouseDog houseDog = new HouseDog();
        houseDog.setName("happy");
        houseDog.sleep();  // happy zzz 출력
    }
}

// 다중 상속은 클래스가 동시에 하나 이상의 클래스를 상속받는 것을 뜻한다.
// C++, 파이썬 등 많은 언어들이 다중 상속을 지원하지만 자바는 다중 상속을 지원하지 않는다.
// 다른 언어는 다중상속을 허용하게 되면 우선순위를 명시해야한다. 함수오버라이딩 등에 있어서 어떤 것을 우선할지 지정해줘야한다.