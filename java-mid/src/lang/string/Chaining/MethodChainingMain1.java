package lang.string.Chaining;

public class MethodChainingMain1 {
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        ValueAdder adder1 = adder.add(1);
        ValueAdder adder2 = adder1.add(2);
        ValueAdder adder3 = adder2.add(3);

        int result = adder3.getValue();
        System.out.println(result);
        //자바의 라이브러리와 오픈 소스들은 메서드 체이닝 방식을 종종 사용한다.
    }
}
