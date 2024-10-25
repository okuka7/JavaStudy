package collection.utils;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class OfMain {
    public static void main(String[] args) {
        //편리한 불변 컬렉션 생성
        List<Integer> list = List.of(1,2,3);
        Set<Integer> set = Set.of(1, 2, 3);
        Map<Integer, String> map = Map.of(1, "One", 3, "Three");

        System.out.println(list);
        System.out.println(set);
        System.out.println(map);
        System.out.println(list.getClass());
        //Of는 불면을 편리하게 만들어준다. 한번 만들고 나면 절대 변하지 않는다.

    }
}
