package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain3 {
    public static void main(String[] args) {
        //중복등록
        MyHashSetV2 set = new MyHashSetV2(10);
        Member m1 = new Member("A");
        Member m2 = new Member("B");
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
        Member searchValue = new Member("A");
        System.out.println(set.contains(searchValue.hashCode()));
        boolean contains = set.contains(searchValue);
        System.out.println(contains);

        //hashCode()를 항상 재정의해야 하는 것은 아니다. 하지만 해시 자료 구조를 사용하는 경우 HashCode()와 equals()를 반드시 함께 재정의 해야 한다.
        //물론 직접 재정의 하는 것은 쉽지 않으므로 IDE의 도움을 받자
    }
}
