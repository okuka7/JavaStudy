package enumeration.ex2;

public class ClassRefMain {
    public static void main(String[] args) {
        System.out.println("BASIC" + ClassGrade.BASIC.getClass());
        System.out.println("GOLD" + ClassGrade.GOLD.getClass());
        System.out.println("DIAMOND" + ClassGrade.DIAMOND.getClass());

        System.out.println(ClassGrade.BASIC);
        System.out.println(ClassGrade.GOLD);
        System.out.println(ClassGrade.DIAMOND);
    }
}
