package generic.test.ex4;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 10;
        Object object =  GenericMethod.objMethod(i);

        // 타입 인자(Type Argument) 명시적 전달
        System.out.println("명시적 타입 인자 전달");
        Integer result = GenericMethod.<Integer>genericMethod(i);// 타입인자가 전달이 된다. 완전 신기 호출하기 직전에 결정하고 호출한다.
        Integer integerValue =  GenericMethod.<Integer>numberMethod(10);
        Double doubleValue = GenericMethod.<Double>numberMethod(10.9);

        //static 메서드는 인스턴스 단위가 아니라 클래스 단위로 작동하기 때문에 제네릭 타입과는 무관하다.

        GenericMethod.<Integer>genericMethod(i);// 타입인자가 전달이 된다. 완전 신기 호출하기 직전에 결정하고 호출한다.


        //자바 컴파일러는 타입인자를 추론이 가능하다
        Integer result2 = GenericMethod.genericMethod(i);
        Integer integerValue2 =  GenericMethod.numberMethod(10);
        Double doubleValue2 = GenericMethod.numberMethod(10.9);

    }
}
