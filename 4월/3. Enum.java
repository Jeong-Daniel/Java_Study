// Enum은 서로 관련이 있는 여러 개의 상수 집합을 정의할 때 사용하는 자료형이다.
public class Enum {
    enum CoffeeType{
        AMERICANO,
        ICE_AMERICANO,
        CAFE_LATTE
    }; //Enum 선언

    public static void main(String[] args) {
        System.out.println(CoffeeType.AMERICANO);  // AMERICANO 출력
        System.out.println(CoffeeType.ICE_AMERICANO);  // ICE_AMERICANO 출력
        System.out.println(CoffeeType.CAFE_LATTE);  // CAFE_LATTE 출력
        // 직접 하나씩 호출하기
        for(CoffeeType type: CoffeeType.values()) {
            System.out.println(type);  // 순서대로 AMERICANO, ICE_AMERICANO, CAFE_LATTE 출력
        }// 반복문을 이용해서 호출
    }
    // 왜 Enum같은 자료형을 사용하는가? 단순하게 순서로 지정을 해놓으면 해당 순서를 전부 기억해야함
    // 매직넘버(상수로 선언하지 않은 숫자)를 사용할 때보다 코드가 명확해 진다.
    // 잘못된 값을 사용함으로 인해 발생할수 있는 위험성이 사라진다.
}
