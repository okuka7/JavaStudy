package lang.immutable.address;

public class RefMain1_1 {
    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유 할 수 있다.
        Address a = new Address("서울");
        Address b = a;
        //b = a라고 하면 a에 있는 참조값을 복사해서 b에 전달한다.
        //자바에서 모든 값 대입은 변수가 가지고 있는 값을 복사해서 전달한다.
        System.out.println("a + " + a);
        System.out.println("b + " + b);

        b.setValue("부산");
        System.out.println("부산 -> b");
        System.out.println("a + " + a);
        System.out.println("b + " + b);



    }
}
