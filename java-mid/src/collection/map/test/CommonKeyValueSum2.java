package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class CommonKeyValueSum2 {
    public static void main(String[] args) {
        Map<String, Integer> map1 = Map.of("a",1,"b",2,"c",3);
        Map<String, Integer> map2 = Map.of("b",4,"c",5,"d",6);
        //Map.of()를 사용해서 생성한Map은 불변이다 따라서 내용을 변경할 수 없다.

        HashMap<String, Integer> result = new HashMap<>();
        for (String key : map1.keySet()) {
            if(map2.containsKey(key)) {
                int value = map1.get(key) + map2.get(key);
                result.put(key, value);
            }
        }

        System.out.println(result);

    }
}
