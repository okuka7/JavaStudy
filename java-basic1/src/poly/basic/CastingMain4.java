package poly.basic;

public class CastingMain4 {
    //다우캐스팅을 자동으로 하지 않는 이유
    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = (Child) parent1; //안댐
        child1.ChildMethod(); //문제 없음 다운 캐스팅해서

        Parent parent2 = new Parent();
        Child child2 = (Child) parent2; //런타임 오류 - ClassCaseException
        child2.ChildMethod();// 실행 불가

        //부모 타입으로 객체를 생성해서 메모리 상에 자식 타입은 전혀 존재하지 않는다. 그렇기 때문에 다운캐스팅을해도 존재하지 않기 때문에
        //런타임 에러가 발생한다.

        //객체를 생성하면 상위 부모 타입은 모두 함께 생성된다.
        //따라서 위로만 타입을 변경하는 업캐스팅은 메모리 상에 인스턴스가 모두 존재하기 때문에 항상 안전하다.
        //반면에 다운캐스팅은 문제가 발생할 수 있다. 객체를 생성하면 부모 타입은 모두 함께 생성되지만 자식 타입은 생성되지 않는다.
    }
}
