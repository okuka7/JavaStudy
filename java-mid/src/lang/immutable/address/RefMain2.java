package lang.immutable.address;

public class RefMain2 {
    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유 할 수 있다.
        ImmutableAddress a = new ImmutableAddress("서울");//x001
        ImmutableAddress b = a; // 참조 값의 대입을 막을 수 있는 방법은 없다. 자바 문법상 맞늡 방법이다. //x001

        System.out.println("a + " + a);
        System.out.println("b + " + b);

        //b.setValue("부산");
        b = new ImmutableAddress("부산"); //못바꾼다는 것을 깨닫고 어쩔수 없이 새로운 객체를 생성해서 대입한다. 방지를 할 수 있다.
        System.out.println("부산 -> b");
        System.out.println("a + " + a);
        System.out.println("b + " + b);
    }
}
