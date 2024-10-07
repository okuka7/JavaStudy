package lang.wrapper.test;

public class WrapperTest4 {
    public static void main(String[] args) {
        String str = "100";
        //String -> Integer String은 오토박싱이 안된다. 타입이 다르기때문에
        Integer integer1 = Integer.valueOf(str);
        System.out.println(integer1);

        //Integer -> int
        int intvalue = integer1.intValue();
        System.out.println(intvalue);

        //int -> Integer
        Integer integer2 = Integer.valueOf(intvalue);
        System.out.println(integer2);
    }
}
