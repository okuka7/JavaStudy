package collection.utils;

import java.util.*;

public class EmptyListMain {
    public static void main(String[] args) {
        //빈 가변 리스트 생성
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        //빈 불변 리스트 생성
        List<Object> list3 = Collections.emptyList();//자바 5
        List<Object> list4 = List.of(); //자바 9 이 기능을 권장한다.

        System.out.println(list3.getClass());
        System.out.println(list4.getClass());

        List<Integer> list5 = Arrays.asList(1, 2, 3);
        List<Integer> list6 = List.of(1, 2, 3);

        Integer[] arr = {1,2,3,4,5};
        List<Integer> arrList = Arrays.asList(arr);
        List<Integer> arr1 = List.of(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arrList);

        //일반적으로 List.of()를 사용하는 것을 권장한다. 다음고 같을 경우 Arrays.asList를 선택할수 있다.
        // 크기가 어마어마 하게 크거나, 리스트 내부의 요소를 변경해야 하는 경우( 리스트의 크기는 변경할 수 없음)
        // 자바 9 이전 버전에서 작업 해야 하는 경우
    }
}
