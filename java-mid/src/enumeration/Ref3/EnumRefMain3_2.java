package enumeration.Ref3;


/**
 * 리팩토링 한 코드
 */
public class EnumRefMain3_2 {
    public static void main(String[] args) {
        int price = 10000;
        System.out.println("BASIC: " + Grade.BASIC.discount(price));
        System.out.println("GOLD: " + Grade.GOLD.discount(price));
        System.out.println("DIAMOND: " + Grade.DIAMOND.discount(price));
    }
}
