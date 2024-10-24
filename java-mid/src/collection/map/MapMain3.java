package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain3 {
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        //학생 성적 데이터 추가
        studentMap.put("A", 90);
        System.out.println(studentMap);

        //학생이 없는 경우에만 추가1
        if(!studentMap.containsKey("A")) {
            studentMap.put("A", 90);
        }
        //학생이 없는 경우에만 추가1
        studentMap.putIfAbsent("A", 90);
        studentMap.putIfAbsent("B", 90);
        System.out.println(studentMap);
        //putIfAbsent()는 영어 그대로 없는 경우에만 입력하라는 뜻이다. 이 메서드를 사용하면 키가 없는 경우에만 데이터를 저장하고 싶을 때
        //코드 한줄로 편리하게 처리할 수 있다.


    }
}
