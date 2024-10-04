package poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
        //자식의 기능은 호출 할 수없다.
        //polly.childmethod();

        //다운캐스팅(부모타입 -> 자식타입)
        //특정 타입으로 변경하는 것을 캐스팅이라고 한다.
        Child child = (Child) poly; //x001
        child.ChildMethod();
        //캐스팅을 한다고 해서 poly의 타입이 변하는 것은 아니다. 해당 참조 값을 꺼내고 꺼낸 참조값이 Child 타입이 되는 것이다.
        //따라서 poly의 타입은  Parent로 기존과 같이 유지된다.

    }
}
