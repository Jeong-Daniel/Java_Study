interface Predator {
    String getFood();

    default void printFood() {
        System.out.printf("my food is %s\n", getFood());
    }
    int LEG_COUNT = 4;
    static int speed() {
        return LEG_COUNT * 30;
    }
}

interface Barkable {
    void bark();
}

interface BarkablePredator extends Predator, Barkable {
}
// 인터페이스는 일반 클래스와는 달리 extends 를 이용하여 여러개의 인터페이스(Predator, Barkable)를 동시에 상속할 수 있다.
// 즉, 다중 상속이 지원된다.

class Animal{
    String name;

    void setName(String name){
        this.name = name;
    }
}


class Tiger extends Animal implements BarkablePredator{
        public String getFood() {
        return "apple";
    }
    public void bark() {
        System.out.println("어흥");
    }
}

class Lion extends Animal implements Predator, Barkable{
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
    } // 인터페이스는 위에서 보듯이 콤마(,)를 이용하여 여러개를 implements 할 수 있다.
      // 폴리모피즘을 이용하면 위의 예에서 보듯이 복잡한 형태의 분기문을 간단하게 처리할 수 있는 경우가 많다.
    /*
    void barkAnimal(Animal animal) {
        if (animal instanceof Tiger) {
            System.out.println("어흥");
        } else if (animal instanceof Lion) {
            System.out.println("으르렁");
        }//instanceof 는 어떤 객체가 특정 클래스의 객체인지를 조사할 때 사용되는 자바의 내장 명령어
    }// 하지만 새로운 동물 클래스가 만들어진다고 계속해서 이런 조건문을 추가하는 것은 비효율적일 것이다.
    */
}


public class Java_interface {
    public static void main(String[] args){
        Zookeeper zookeeper = new Zookeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();

        Bouncer bouncer= new Bouncer();
        bouncer.barkAnimal(tiger);
        bouncer.barkAnimal(lion);
    }
}
