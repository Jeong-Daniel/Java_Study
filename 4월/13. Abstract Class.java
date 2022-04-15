// 추상클래스(Abstract Class)는 인터페이스의 역할도 하면서 클래스의 기능도 가지고 있는 자바의 돌연변이 같은 클래스이다.

abstract class Predator extends Animal {
    abstract String getFood();

    void printFood() {
        System.out.printf("my food is %s\n", getFood());
    }
    static int LEG_COUNT = 4; // 추상 클래스의 상수는 static 선언이 필요하다
    static int speed() {
        return LEG_COUNT * 30;
    }
} // abstract 메소드는 인터페이스의 메소드와 마찬가지로 몸통이 없다.
// 즉 abstract 클래스를 상속하는 클래스에서 해당 abstract 메소드를 구현해야만 하는 것이다.

interface Barkable {
    void bark();
}


class Animal{
    String name;

    void setName(String name){
        this.name = name;
    }
}


class Tiger extends Predator implements Barkable{
    public String getFood() {
        return "apple";
    }
    public void bark() {
        System.out.println("어흥");
    }
}

class Lion extends Predator implements Barkable{
    public String getFood() {
        return "banana";
    }
    public void bark() {
        System.out.println("으르렁");
    }
}

class Zookeeper{
    void feed(Predator predator) {
        System.out.println("feed "+predator.getFood());
    }
}

class Bouncer {
    void barkAnimal(Barkable animal) {  // Animal 대신 Barkable을 사용
        animal.bark();
    }
}


public class Abstrac {
    public static void main(String[] args){
        Zookeeper zookeeper = new Zookeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();

        Bouncer bouncer= new Bouncer();
        bouncer.barkAnimal(tiger);
        bouncer.barkAnimal(lion);
    }
}

// 인터페이스와 추상 클래스의 차이
//자바8 버전부터 인터페이스에 default 메서드가 추가되어 추상 클래스와의 차이점이 살짝 모호해졌다.
// 하지만 추상 클래스는 인터페이스와는 달리 일반 클래스처럼 객체변수, 생성자, private 메서드 등을 가질 수 있다.
//※ private 메서드는 클래스 내에서만 사용되는 메서드로 다른 클래스에서 호출이 불가능하다. 뒤에서 보다 자세히 공부