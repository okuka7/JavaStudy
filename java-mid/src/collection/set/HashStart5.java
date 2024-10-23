package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class HashStart5 {
    static final int CAPACITY = 10;

    public static void main(String[] args) {
        LinkedList<Integer>[] buckets = new LinkedList[CAPACITY]; //LinkedList가 들어 갈수 있는 배열을 만들어 준 것이다.
        for(int i = 0; i < CAPACITY; i++) {
            buckets[i] = new LinkedList<>();
        }
        add(buckets,1);
        add(buckets,2);
        add(buckets,5);
        add(buckets,9);
        add(buckets,99);
        System.out.println(Arrays.toString(buckets));

        //검색
        int searchValue = 9;
        boolean contains = contains(buckets,searchValue);
        System.out.println(contains);

    }

    private static void add(LinkedList<Integer>[] buckets, int value){
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex]; //O(1)
        if(!bucket.contains(value)) { //중복이 없으면
            bucket.add(value);
        }
    }

    private static boolean contains(LinkedList<Integer>[] buckets, int searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex]; //O(1)
        return bucket.contains(searchValue); //O(n)
    }



    static int hashIndex(int value){
        return value % CAPACITY;
    }

    //해시 인덱스를 사용하는 방식은 사실 최악의 경우는 거의 발생하지 않는다. 배열의 크기만 적절하게 잡아주면 대부분 O(1)에 가까운 매우빠른 성능을 보여준다.
}
