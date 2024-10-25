package collection.compare;

import java.util.TreeSet;

public class SortMain5 {
    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("a",30);
        MyUser myUser2 = new MyUser("b",30);
        MyUser myUser3 = new MyUser("c",30);

        TreeSet<MyUser> treeSet1 = new TreeSet<>();
        treeSet1.add(myUser1);
        treeSet1.add(myUser2);
        treeSet1.add(myUser3);
        System.out.println("기본정렬");
        System.out.println(treeSet1);

        TreeSet<MyUser> treeSet2 = new TreeSet<>(new IdComparator());
        treeSet2.add(myUser1);
        treeSet2.add(myUser2);
        treeSet2.add(myUser3);

        System.out.println("Idcomp 정렬");
        System.out.println(treeSet2);

        //자바의 정렬 알고리즘은 매우 복잡하고 거의 완성형에 가깝다.

    }
}
