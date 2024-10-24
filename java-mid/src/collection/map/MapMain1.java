package collection.map;

import java.util.HashMap;
import java.util.Map;

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

    }
}
