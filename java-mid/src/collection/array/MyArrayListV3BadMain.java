package collection.array;

public class MyArrayListV3BadMain {
    public static void main(String[] args) {
        MyArrayListV3 numbetList = new MyArrayListV3();

        numbetList.add(1);
        numbetList.add(2);
        numbetList.add("문자");//문자를 입력
        System.out.println(numbetList);

        //Object를 반환하므로 다운 캐스팅 필요
        Integer num1 = (Integer) numbetList.get(0);
        Integer num2 = (Integer) numbetList.get(1);

        //ClassCaseException 발생 문자를 Integer 로 캐스팅
        Integer num3 = (Integer) numbetList.get(2);

    }
}
