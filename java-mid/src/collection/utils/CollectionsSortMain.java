package collection.utils;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSortMain {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Integer max = Collections.max(list); //가장 큰값
        Integer min = Collections.min(list);

        System.out.println(max);
        System.out.println(min);
        System.out.println(list);
        System.out.println("list = " + list);

        Collections.shuffle(list);//랜덤하게 리스트의 요소를 섞는다.
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);


    }
}
