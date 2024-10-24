package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class ArrayToMapTest {
    public static void main(String[] args) {
        String[][] productArr = {{"java","1000"},{"Spring","20000"},{"JPA","10000"}};

        //주어진 배열로부터 Map생성 - 코드 작성
        Map<String, Integer> productMap = new HashMap<>();
        for (String[] product : productArr) {
            String value = product[1];
            productMap.put(product[0], Integer.valueOf(value));
        }
        //Map의 모든 데이터 출력 - 코드 작성
        for (String key : productMap.keySet()) {
            System.out.println(key + ":" + productMap.get(key));
        }

    }
}
