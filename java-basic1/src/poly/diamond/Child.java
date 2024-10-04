package poly.diamond;

public class Child implements InterfaceA,InterfaceB{
    @Override
    public void methodA() {
        System.out.println("Child methodA");
    }

    @Override
    public void methodCommon() {
        System.out.println("Child methodCommon");
    }

    @Override
    public void methodB() {
        System.out.println("Child methodB");
    }

    //인터페이스는 다중 구현을 할 수 있다.
}
