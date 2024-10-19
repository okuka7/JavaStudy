package collection.array;

public class MyArrayListMainV3 {
    public static void main(String[] args) {
        MyArrayListV3 list = new MyArrayListV3();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);
        //원하는 위치애 추가
        list.add(3,"addList");
        System.out.println(list);
        //앞에 추가
        list.add(0,"fistList"); //O(n)
        System.out.println(list);

        //삭제
        Object removed1 = list.remove(4); //O(1)
        System.out.println(removed1);
        Object removed2 = list.remove(0);//O(n)
        System.out.println(removed2);

        list.add("d");
        list.add("e");
    }
}
