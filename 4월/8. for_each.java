public class for_each {
    // for each는 J2SE 5.0 부터 추가되었다.
    // 기존 for문과 동일하지만 조건식의 문법이 조금 다르다.
    public static void main(String[] args) {
        String[] numbers = {"one", "two", "three"};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        String[] numbers_2 = {"one", "two", "three"};
        for(String number: numbers_2) {
            System.out.println(number);
        } // 위 두 for문은 완벽하게 똑같이 작동한다. type var: iterate 형태로 직관적으로 변경됨
          // iterate로 사용할 수 있는 자료형은 루프를 돌릴수 있는 자료형(배열 및 ArrayList 등)만 가능
    } // 단, for each 문은 따로 반복회수를 명시적으로 주는 것이 불가능하고, 1스탭씩 순차적으로 반복될때만 사용가능하다는 제약이 있다.
}
