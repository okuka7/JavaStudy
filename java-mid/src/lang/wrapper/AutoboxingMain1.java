package lang.wrapper;

public class AutoboxingMain1 {
    public static void main(String[] args) {
        //Primitive -> Wrapper 박싱
        int value = 7;
        //Integer boxedValue = Integer.valueOf(value); // 박스에 숫자 7을 넣었다.
        Integer boxedValue = value; //auto-boxing

        //Wapper -> Primitive 언박싱
        //int unboxedValue = boxedValue.intValue();
        int unboxedValue = boxedValue; //auto-unboxing

        //auto-boxing 과 - auto-unboxing은 매우 자주 사용한다.

        //출력
        System.out.println(unboxedValue);
        System.out.println(boxedValue);
    }
}
