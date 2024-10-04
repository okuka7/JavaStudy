package poly.basic;

public class CastingMain5 {
    //다우캐스팅을 자동으로 하지 않는 이유
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2" );
        call(parent2);
    }

    private static void call(Parent parent){
        parent.parentMethod();
        if(parent instanceof Child){
            //왼쪽이 오른쪽에 들어갈 수 있는지 대입을 해보면 된다.
            System.out.println("Child인스턴스가 맞음");
            Child child = (Child) parent;
            child.ChildMethod();
        }
    }
}
