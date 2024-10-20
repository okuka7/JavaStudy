package collection.array;

public class MyArrayListMainV4 {
    public static void main(String[] args) {
        MyArrayListV4<String> stringList = new MyArrayListV4<>();
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        String string = stringList.get(0);
        System.out.println(string);

        MyArrayListV4<Integer> integerList = new MyArrayListV4<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        Integer integer = integerList.get(0);
        System.out.println(integer);
        //배열 리스트는 순서대로 마지막에 데이터를 추가하거나 삭제할 때는 성능이 좋지만, 앞이나 중간에 데이터를 추가하거나 삭제할 때는 성능이 좋지 않다.
        //정확한 크기를 알지 않으면 메모리가 낭비된다.
        //List 자료 구조 : 순서가 있고 , 중복을 허용하는 자료 구조를 리스트라고 한다.
    }
}
