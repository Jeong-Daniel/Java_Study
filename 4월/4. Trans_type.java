// 자료형간 형변환
public class Trans_type {
    public static void main(String[] args) {
        String num = "123";
        int n = Integer.parseInt(num);
        System.out.println(n);  // 123 출력
        // 문자를 정수로 변환

        int b = 123;
        String s_num = "" + b;
        System.out.println(s_num);  // 123 출력
       // 정수를 문자로 변환하기 위해서는 빈문자열 ""을 더해준다다

        int c = 123;
        String num1 = String.valueOf(c);
        String num2 = Integer.toString(c);
        System.out.println(num1);  // 123 출력
        System.out.println(num2);  // 123 출력

        String point = "123.456";
        double d = Double.parseDouble(point);
        System.out.println(d);
        // 소수점의 경우 Double.parseDouble 또는 Float.parseFloat를 사용

        int n1 = 123;
        double d1 = n1;  // 정수를 실수로 바꿀때에는 캐스팅이 필요없다.
        System.out.println(d1);  // 123.0 출력

        double d2 = 123.456;
        int n2 = (int) d2; // 실수를 정수로 바꿀때에는 반드시 정수형으로 캐스팅해 주어야 한다.
        System.out.println(n2);  // 소숫점이 생략된 123 출력

        // 실수 형태의 문자열을 정수로 변경하려고 하면 NumberFormatException이 발생하므로 주의

        // final은 자료형에 값을 단 한번만 설정할수 있게 강제하는 키워드이다. 즉, 값을 한번 설정하면 그 값을 다시 설정할 수 없다는 말이다.
        final int final_n = 123;  // final 로 설정하면 값을 바꿀수 없다.
        // final_n = 456; 컴파일 에러 발생
        // 리스트의 경우도 final로 선언시 재할당은 불가능하다. 값을 더하거나(add) 빼는(remove) 것은 가능하다. 다만 재할당만 불가능

        final List<String> Finale_L = List.of("a", "b");
        // a.add("c"); 컴파일 에러 UnsupportedOperationException 발생
        // List.of를 사용하면 수정도 불가능
    }
}
