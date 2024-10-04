package poly.basic;

public class CastingMain6 {
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
        if(parent instanceof Child child){ //16이상 부터 변수를 선언 할 수 있다.
            //왼쪽이 오른쪽에 들어갈 수 있는지 대입을 해보면 된다.
            System.out.println("Child인스턴스가 맞음");
            child.ChildMethod();
        }
    }
}
