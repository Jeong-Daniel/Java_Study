import java.util.Arrays;
import java.util.HashSet;
// 집합 자료형 HashSet을 사용하여 만들 수 있다.

public class Set {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>(Arrays.asList("H", "e", "l", "l", "o"));
        System.out.println(set);  //  중복된 l을 제거하고 [e, H, l, o] 출력
        // 중복을 허용하지 않으며, 순서가 없음

        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));
        // 교집합 차집합 실습을 위해서 두가지 셋을 준비

        HashSet<Integer> intersection = new HashSet<>(s1); // s1으로 intersection 생성
        intersection.retainAll(s2); // 교집합 수행
        System.out.println(intersection);  // [4, 5, 6] 출력
        // retainAll 메소드를 이용하면 교집합을 간단히 구할 수 있다.

        HashSet<Integer> union = new HashSet<>(s1);  // s1으로 union 생성
        union.addAll(s2); // 합집합 수행
        System.out.println(union);  // [1, 2, 3, 4, 5, 6, 7, 8, 9] 출력
        // addAll 메소드를 이용하면 합집합을 구할 수 있음

        HashSet<Integer> substract = new HashSet<>(s1);  // s1으로 substract 생성
        substract.removeAll(s2); // 차집합 수행
        System.out.println(substract);  // [1, 2, 3] 출력
        // removeAll 메소드를 이용하면 차집합을 구할 수 있음


        //ACID
        HashSet<String> set_2 = new HashSet<>();
        set_2.add("Jump");
        set_2.add("To");
        set_2.add("Java");
        System.out.println(set_2);  // [Java, To, Jump] 출력
        // add를 이용하면 set에 값을 추가할 수 있음

        set_2.addAll(Arrays.asList("Join", "JSP"));
        System.out.println(set_2);  // [Java, JSP, Join, To, Jump] 출력
        // addAll을 사용하면 여러개 입력가능

        set_2.remove("To");
        System.out.println(set_2);  // [Java, JSP, Join, Jump] 출력
        // remove를 사용하면 제거

        /*
        TreeSet과 LinkedHashSet
        Set 자료형은 순서가 없다는 특징이 있다. 하지만 가끔은 Set에 입력된 순서대로 데이터를 가져오고 싶은 경우도 있고 때로는 오름차순으로 정렬된 데이터를 가져오고 싶을 수도 있을 것이다.
        이런경우에는 TreeSet과 LinkedHashSet을 사용한다.
        TreeSet - 오름차순으로 값을 정렬하여 저장하는 특징이 있다.
        LinkedHashSet - 입력한 순서대로 값을 정렬하여 저장하는 특징이 있다.
         */
    }
}