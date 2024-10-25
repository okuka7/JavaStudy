package collection.compare;

import java.util.Arrays;
import java.util.Comparator;

public class SortMain2 {
    public static void main(String[] args) {
        Integer[] array = {3,2,1,};
        System.out.println(Arrays.toString(array));
        System.out.println("Comparator 비교");
        Arrays.sort(array, new AscComparator());
        System.out.println(Arrays.toString(array));

        Arrays.sort(array, new DescComparator());
        System.out.println(Arrays.toString(array));
        Arrays.sort(array, new AscComparator().reversed());//DescComparator 와 같다.
        System.out.println(Arrays.toString(array));
    }
    static class AscComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            System.out.println("o1:" + o1 + o2);
            return (o1<o2) ? -1 : ((o1==o2) ? 0 : 1);
        }
    }

    static class DescComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            System.out.println("o1:" + o1 + o2);
            return (o1<o2) ? -1 : ((o1==o2) ? 0 : 1) + -1; //반대 값을 반환해 버린다.
        }
        //비교자를 사용하면 정렬의 기준을 자유롭게 변경할 수 있다.
    }
}
