package collection.iterable;

import java.util.Iterator;

public class MyArrayMain {
    public static void main(String[] args) {
        MyArray myArray = new MyArray(new int[]{1,2,3,4,5});
        Iterator<Integer> iterator = myArray.iterator();
        System.out.println("interator 사용");
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println(value );
        }

        System.out.println("for-each 사용");
        for (Integer value : myArray) {
            System.out.println(value);
        }
        //포이치문은 자료 구조를 순회하는 것이 목적이다. 자바는 이터레이블 인터페이스를 구현한 객체에 대해서 향상된 for문을 사용할 수 있게 해준다.

        //Iterable "반복가능한"
        //Iterator 반복자 라는 뜻이다.
    }

}
