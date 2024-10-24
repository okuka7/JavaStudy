package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain1 {
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        //학생 성적 데이터 추가
        studentMap.put("A", 100);
        studentMap.put("B", 20);
        studentMap.put("C", 30);
        System.out.println(studentMap);

        //map은 순서를 보장하지 않는다.

        //특정 학생의 값 조회
        Integer result = studentMap.get("A");
        System.out.println(result);

        System.out.println("keySet 활용");
        Set<String> keySet = studentMap.keySet();
        for(String key : keySet) {
            Integer value = studentMap.get(key);
            System.out.println(key + value);
        }

        System.out.println("entrySet활용");
        Set<Map.Entry<String, Integer>> entries = studentMap.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + value);

            //맺은 키와 값을 보관하는 자료 구조이다. 따라서 키와 값을 하나로 묶을 수 있는 방법이 필요하다. 이때 엔트리를 사용한다.
            //엔트리는 맵 내부에 있는 인터페이스 이다. 우리는 구현체보다는 이 인터페이스를 사용하면 된다.
        }
        
        System.out.println("values 활용"); //값만 꺼내는 것이다.
        Collection<Integer> values = studentMap.values(); //중복이 나올 수 있기 때문에 컬렉션으로 나온다.
        for (Integer value : values) {
            System.out.println(value);
        }

    }
}
