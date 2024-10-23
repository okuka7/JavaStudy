package collection.set.member;

import collection.set.MemberNoHashNoEq;
import collection.set.MyHashSetV2;

public class HashAndEqualsMain2 {
    public static void main(String[] args) {
        //중복등록
        MyHashSetV2 set = new MyHashSetV2(10);
        MemberOnlyHash m1 = new MemberOnlyHash("A");
        MemberOnlyHash m2 = new MemberOnlyHash("B");
        System.out.println("m1.hashCode() = " + m1.hashCode());
        System.out.println("m2.hashCode() = " + m2.hashCode());
        System.out.println("m1.equals(m2) = " + m1.equals(m2));


        //equals 가 없기 때문에 참조값으로 비료하게 된다. 둘의 참조값은 다른 인스턴스이기 때문에 다르다.
        System.out.println("System.identityHashCode(m1) = " + System.identityHashCode(m1));
        System.out.println("System.identityHashCode(m2) = " + System.identityHashCode(m2));

        set.add(m1);
        set.add(m2);
        System.out.println(set);

        //set 에 데이터가 중복으로 들어간다.
        //검색 실패
        MemberOnlyHash searchValue = new MemberOnlyHash("A");
        System.out.println(set.contains(searchValue.hashCode()));
        boolean contains = set.contains(searchValue);
        System.out.println(contains);

    }
}
