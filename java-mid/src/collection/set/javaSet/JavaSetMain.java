package collection.set.javaSet;

import java.util.*;

public class JavaSetMain {

    public static void main(String[] args) {
        run(new HashSet<>());
        run(new LinkedHashSet<>());
        run(new TreeSet<>());
    }

    public static void run(Set<String> set) {
        System.out.println(set.getClass().getName());
        set.add("C");
        set.add("D");
        set.add("A1");
        set.add("2");
        set.add("B");
        System.out.println(set);

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }
        System.out.println();
    }

    //HashSet : 입력한 순서를 보장하지 않는다. O(1)
    //LinkedHashSet : 입력한 순서를 정확히 보장한다. O(1)
    //TreeSet :  데이터 값을 기준으로 정렬한다. O(log N)


}
