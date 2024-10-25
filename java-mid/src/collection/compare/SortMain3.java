package collection.compare;

import java.util.Arrays;

public class SortMain3 {
    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("a",30);
        MyUser myUser2 = new MyUser("b",30);
        MyUser myUser3 = new MyUser("c",30);
        MyUser[] array = {myUser1,myUser2,myUser3};
        System.out.println("기본 데이터");
        System.out.println(Arrays.toString(array));

        System.out.println("기본 정렬");
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        //추가
        System.out.println("정렬");
        Arrays.sort(array,new IdComparator());
        System.out.println(Arrays.toString(array));

        System.out.println("reversed 정렬");
        Arrays.sort(array,new IdComparator().reversed());
        System.out.println(Arrays.toString(array));
    }
}
