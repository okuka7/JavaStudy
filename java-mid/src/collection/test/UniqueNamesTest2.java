package collection.test;

import java.util.*;

public class UniqueNamesTest2 {
    public static void main(String[] args) {
        Integer[] inputArr = {5,30,20,20,20,10,10};
        Set<Integer> set = new LinkedHashSet<>(List.of(inputArr));
        //Set구현체의 생성자에 배열은 전달할 수 없지만 List는 전달할 수 있다. 다음과 같이 배열을 List로 변환한다.

        //편하게 넣는 방법이 2가지 있는데 최근에는 ListOf를 권장한다.
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = List.of(4, 5, 6);
        for (Integer s : set) {
            System.out.println(s);
        }
    }
}
