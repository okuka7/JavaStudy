package enumeration.ex2;

public class ClassGradeEx2_1 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();
        discountService.discount(ClassGrade.BASIC, price);
        discountService.discount(ClassGrade.GOLD, price);
        discountService.discount(ClassGrade.GOLD, price);
    }
}
