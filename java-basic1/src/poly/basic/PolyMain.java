package poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        //부모 변수가 부모 인스턴스 참조
        System.out.println("parent -> parent");
        Parent parent = new Parent();
        parent.parentMethod();

        //자식 변수가 자식 인스턴스 참조
        System.out.println("child -> child");
        Child child = new Child();
        child.parentMethod(); //상속 받았기 때문에 가능하다.
        child.ChildMethod();

        //부모 변수가 자식 인스턴스를 참조(다형적 참조)
        System.out.println("parent -> child");
        Parent poly = new Child(); //부모타입은 자식을 참조 할 수 있다.
        poly.parentMethod();

        //Child child1 = new Parent() //자식은 부모를 담을 수 없다. 타입이 맞지 않는다.

        //poly.childMethod(); 자식의 기능은 호출할 수 없다. 부모는 자식의 기능을 호출 할 수없다.
    }
}
