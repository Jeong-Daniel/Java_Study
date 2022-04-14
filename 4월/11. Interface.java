// 인터페이스는 왜 필요한가?
// 인터페이스는 함수의 껍데기만 있는데, 그 이유는 그 함수의 구현을 강제하기 위해서 이다 구현을 강제함으로써 구현 객체의 같은 동작을 보장할 수 있다.
// 자바는 다중상속을 지원하지 않기 때문에 이런 구분을 한다.

interface Predator {
    String getFood();

    default void printFood() {
        System.out.printf("my food is %s\n", getFood());
    } // 인터페이스의 메서드는 몸통(구현체)을 가질 수 없지만 디폴트 메서드를 사용하면 실제 구현된 형태의 메서드를 가질 수 있다.

    int LEG_COUNT = 4;  // 인터페이스 상수

    static int speed() {
        return LEG_COUNT * 30;
    }
    // 인터페이스에 스태틱 메서드를 구현하면 인터페이스명.스태틱메서드명 과 같이 사용하여 일반 클래스의 스태틱 메서드를 사용하는 것과 동일하게 사용할 수 있다.

}// 인터페이스의 메소드는 메소드의 이름과 입출력에 대한 정의만 있고 그 내용은 없다. 규칙이 그렇다

class Animal{
    String name;

    void setName(String name){
        this.name = name;
    }
}

// 인터페이스 구현은 위와같이 implements 라는 키워드를 사용한다.
class Tiger extends Animal implements Predator{
    public String getFood() {
        return "apple";
    } // 인터페이스의 메소드는 항상 public으로 구현한다.
}

class Lion extends Animal implements Predator{
    public String getFood() {
        return "banana";
    }
}

class Zookeeper{

    void feed(Predator predator) {
        System.out.println("feed "+predator.getFood());
    }
// tiger, lion은 각각 Tiger, Lion의 객체이기도 하지만 Predator 인터페이스의 객체가 된다.
// 식동물이 추가 될 때마다 다음과 같이 Predator 인터페이스를 구현한 클래스를 작성하기만 하면 된다.
    /*
    void feed(Tiger tiger){
        System.out.println("feed apple");
    }//호랑이가 오면 사과를 던져준다.

    void feed(Lion lion) {
        System.out.println("feed banana");
    }// 사자가 오면 바나나를 던져준다.
     */
}

public class Java_interface {
    public static void main(String[] args){
        Zookeeper zookeeper = new Zookeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        zookeeper.feed(tiger); // feed apple출력
        zookeeper.feed(lion); // feed banana출력
    } // 하지만 동물이 계속 추가가 된다면?
}

/* 단순히 메소드의 갯수가 줄어들었다는 점이 아니라
ZooKeeper 클래스가 동물들의 종류에 의존적인 클래스에서
동물들의 종류와 상관없는 독립적인 클래스가 되었다는 점이다.
바로 이 점이 인터페이스의 핵심
 */