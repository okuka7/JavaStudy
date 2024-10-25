package collection.compare;

import java.util.Collections;
import java.util.LinkedList;

public class SortMain4 {
    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("a",30);
        MyUser myUser2 = new MyUser("b",30);
        MyUser myUser3 = new MyUser("c",30);

        LinkedList<MyUser> list = new LinkedList<>();
        list.add(myUser1);
        list.add(myUser2);
        list.add(myUser3);
        System.out.println("기본 데이터");
        System.out.println(list);

        System.out.println("Comparable 기본 정렬");
        list.sort(null); // 객체 스스로 정렬 메서드를 가지고 있는 이것을 쓰는 것을 권장한다.
        //Collections.sort(list);
        System.out.println(list);

        System.out.println("IdComparator 정렬");
        list.sort(new IdComparator());
        //Collections.sort(list, new IdComparator());
        System.out.println(list);
    }
}
