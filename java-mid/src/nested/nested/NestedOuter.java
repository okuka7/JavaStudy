package nested.nested;

public class NestedOuter {
    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    static class Nested {
        private int nestedInstanceValue = 1;
        public void print(){

            //자신의 멤버에 접근
            System.out.println(nestedInstanceValue);

            //바깥 클래스의 인스턴스 멤버에는 접근할 수 없다.
            //static 은 인스턴트에 접근할 수 없다. 관계가 없다.
            //static 으로 선언이 되었기 때문에
            //System.out.println(outInstanceValue);

            //바깥 클래스의 클래스 멤버에는 접근할 수 있다. private 도 접근 가능
            System.out.println(NestedOuter.outClassValue);
            //바깥클래스가 만든 인스턴스 필드에서는 바로 접근할 수 없다. 바깥 인스턴스의 참조가 없기 때문이다.
        }
    }

}
