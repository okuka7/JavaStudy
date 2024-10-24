package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain2 {
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        //학생 성적 데이터 추가
        studentMap.put("A", 90);
        System.out.println(studentMap);

        studentMap.put("A", 100); //같은 키에 저장시 기존 값 교채
        System.out.println(studentMap);

        boolean containsKey = studentMap.containsKey("A");
        System.out.println(containsKey);
        //특정 학생의 값 삭제
        studentMap.remove("A");
        System.out.println(studentMap);
    }
}
