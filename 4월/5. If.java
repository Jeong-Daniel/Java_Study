public class If {
    public static void main(String[] args) {
        boolean money = true;
        if (money) {
            System.out.println("택시를 타고 가라");
        } else {
            System.out.println("걸어가라");
        }// if-else 간단한 조건문

        ArrayList<String> pocket = new ArrayList<String>();
        pocket.add("paper");
        pocket.add("handphone");
        pocket.add("money");

        if (pocket.contains("money")) {
            System.out.println("택시를 타고 가라");
        }else {
            System.out.println("걸어가라");
        } // contains를 이용해서 리스트안에 있는지 참/거짓 판단

        boolean hasCard_1 = true;
        ArrayList<String> pocket_1 = new ArrayList<String>();
        pocket_1.add("paper");
        pocket_1.add("handphone");

        if (pocket_1.contains("money")) {
            System.out.println("택시를 타고 가라");
        }else {
            if (hasCard_1) {
                System.out.println("택시를 타고 가라");
            }else {
                System.out.println("걸어가라");
            } // 조건문안에 조건문 중첩
        }

        boolean hasCard_2 = true;
        ArrayList<String> pocket_2 = new ArrayList<String>();
        pocket_2.add("paper");
        pocket_2.add("handphone");

        if (pocket_2.contains("money")) {
            System.out.println("택시를 타고 가라");
        }else if(hasCard_2) {
            System.out.println("택시를 타고 가라");
        }else {
            System.out.println("걸어가라");
        } // else if를 이용한 3가지 조건문
   }
}
