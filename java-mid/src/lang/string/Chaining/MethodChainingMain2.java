package lang.string.Chaining;

public class MethodChainingMain2 {
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        int result = adder.add(1).add(2).add(3).getValue();
        System.out.println(result);
        //자신을 반환하기 때문에 가능하다.
        //메서드가 체인 처럼 있기때문에 메서드 체이닝 가법이라고 한다.
        //가능한 이유는 자기 자신의 참조값을 반환하기 때문이다.
    }
}
