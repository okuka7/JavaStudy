package poly.overring;

public class Child extends Parent {
    public String value = "child";

    @Override
    public void method(){
        System.out.println("child.method");
    }
}
