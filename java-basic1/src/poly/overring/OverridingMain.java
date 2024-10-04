package poly.overring;

public class OverridingMain {
    public static void main(String[] args) {
        //자식 변수가 자식 인스턴스 참조
        Child child = new Child();
        System.out.println("child -> Child");
        System.out.println(child.value);
        child.method();

        //부모 변수가 부모 인스턴스 참조
        Parent parent = new Parent();
        System.out.println("parent -> Parent");
        System.out.println(parent.value);
        parent.method();

        //부모 변수가 자식 인스턴스 참조 (다형적 참조)
        Parent poly = new Child();
        System.out.println("Parent -> child");
        System.out.println(poly.value); //변수는 오버라이딩이 안된다.
        poly.method(); //메서드는 오버라이딩이 가능하다.
        //오버라이딩 된 메서드는 항상 우선권을 가진다. 그래서 child메서드가 나온다.
        //하위 자식의 오버라이딩 된 메서드가 우선권을 가지는 것이다.
    }
}
