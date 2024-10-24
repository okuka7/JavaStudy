package collection.map;

import java.util.*;

public class JavaMapMain {
    public static void main(String[] args) {
        run(new HashMap<>()); //순서보장 안됨 O(1)
        run(new LinkedHashMap<>()); //키를 기준으로 (입력한 순서)를 보장한다. O(1)
        run(new TreeMap<>()); //키 자체의 데이터 값을 기준으로 정렬한다. O(log N)
    }

    public static void run(Map<String, Integer> map) {
        System.out.println("map" + map);
        map.put("c", 10);
        map.put("b", 20);
        map.put("a", 30);
        map.put("1", 40);
        map.put("2", 50);

        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            System.out.println(key + ":" + map.get(key));
        }
        System.out.println();
    }
}
