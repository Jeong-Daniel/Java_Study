public class For {
    public static void main(String[] args) {
        String[] numbers = {"one", "two", "three"};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        } // for(시작;조건;증가치)

        int[] marks = {90, 25, 67, 45, 80};
        for(int i=0; i<marks.length; i++) {
            if (marks[i] >= 60) {
                System.out.println((i+1)+"번 학생은 합격입니다.");
            }else {
                System.out.println((i+1)+"번 학생은 불합격입니다.");
            }
        } // 처음부터 리스트 길이만큼 순회

        int[] marks_2 = {90, 25, 67, 45, 80};
        for(int i=0; i<marks_2.length; i++) {
            if (marks_2[i] < 60) {
                continue;
            }
            System.out.println((i+1)+"번 학생 축하합니다. 합격입니다.");
        } // continue도 마찬가지로 동일하게 동작

        for(int i=2; i<10; i++) {
            for(int j=1; j<10; j++) {
                System.out.print(i*j+" ");
            }
            System.out.println("");
        } // 2중  for문을 통해 구구단 생성
    }
}
