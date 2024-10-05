package lang.string.immutable;

public class StringImmutable2 {
    public static void main(String[] args) {
        String str = "hello";
        String str2 = str.concat("java");
        System.out.println("str" + str);
        System.out.println("str2" + str2);
        //String은 불변이기 때문에 반환해줘야 한다.
        //String은 불변으로 되어있어서 사이드 이펙트가 발생하지 않는다.

    }
}
