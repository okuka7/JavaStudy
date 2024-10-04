package lang.string;

public class StringConcatMain {
    public static void main(String[] args) {
        String a = "hello";
        String b = "java";

        String result1 = a.concat(b); // 가능
        String result2 = a + b; //참조 값은 더할수 없다. 원칙상 안되는데 자바에서는 편의를 위해서 하게 해준다.

        //자바에서 문자열을 더할 때는 String이 제공하는 concat()과 같은 메서드를 사용해야 한다.
        //하지만 문자열은 너무 자주 다루어지기 대문에 자바 언어에서 편의상 특별히 + 연산을 제공한다.
    }
}
