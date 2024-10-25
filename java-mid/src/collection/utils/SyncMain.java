package collection.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SyncMain {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //쓰레드1
        list.add(1);
        list.add(2);
        list.add(3);

        //쓰레드2
        list.remove(1);

        System.out.println(list.getClass());
        Collection<Integer> synchronizedList = Collections.synchronizedCollection(list);
        System.out.println(synchronizedList.getClass());
        //일반 리스트를 멀티스레드 상황에서 동기화 문제가 발생하지 않는 안전한 리스트로 만들 수 있다.
    }
}
