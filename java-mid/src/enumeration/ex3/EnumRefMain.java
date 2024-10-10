package enumeration.ex3;

public class EnumRefMain {
    public static void main(String[] args) {
        System.out.println("Class BASIC" + Grade.BASIC.getClass());
        System.out.println("Class GOLD" + Grade.GOLD.getClass());
        System.out.println("Class DIAMOND" + Grade.DIAMOND.getClass());

        System.out.println("ref BASIC" + refValue(Grade.BASIC));
        System.out.println("ref BASIC" + refValue(Grade.GOLD));
        System.out.println("ref BASIC" + refValue(Grade.DIAMOND));
    }
    private static String refValue(Object grade){
        return Integer.toHexString(System.identityHashCode(grade));
    }
}
