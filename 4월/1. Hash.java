import java.util.HashMap;
public class Hash {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("people", "사람");
        map.put("baseball", "야구");
        // put 매서드를 이용해서 입력

        System.out.println(map.get("people"));
        // get 매서드를 이용해서 "사람" 출력
        // 맵의 key에 해당하는 value가 없을 경우에 get 메소드를 사용하면 다음처럼 null이 리턴된다.
        // 이때 null 대신 디폴트 값을 얻고 싶은 경우에는 getOrDefault 메소드를 사용한다.

        System.out.println(map.containsKey("people"));
        // containsKey 메소드는 맵(Map)에 해당 키(key)가 있는지를 조사하여 그 결과값을 리턴

        System.out.println(map.remove("people"));  // "사람" 출력
        // remove 메소드는 맵(Map)의 항목을 삭제하는 메소드로 key값에 해당되는 아이템(key, value)을 삭제한 후 그 value 값을 리턴한다.

        System.out.println(map.size());
        // size 메소드는 Map의 갯수를 리턴한다.

        System.out.println(map.keySet());  // [baseball, people(아까 삭제함)] 출력
        // keySet은 맵(Map)의 모든 Key를 모아서 리턴한다.

        //keySet() 메소드는 Map의 모든 Key를 모아서 Set 자료형으로 리턴한다. Set 자료형은 잠시후에 알아본다. Set 자료형은 다음과 같이 List 자료형으로 바꾸어 사용할수도 있다.
        // List<String> keyList = new ArrayList<>(map.keySet());
    }
}