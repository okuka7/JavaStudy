package nested.nested;

public class NestedOuterMain {
    public static void main(String[] args) {
        NestedOuter outer = new NestedOuter();
        NestedOuter.Nested nested = new NestedOuter.Nested();
        nested.print();

        System.out.println("nested = " + nested.getClass());
        //정적 중첩 클래스는 사실 다른 클래스를 그냥 중첩해 둔 것일 뿐이다. 쉽게 이야기해서 둘은 아무런 관계가 없다.
        //유일한 차이는 private 에 접근할 수 있다.
        //그냥 클래스 2개를 따로 만든 것과 같다.
    }
}
