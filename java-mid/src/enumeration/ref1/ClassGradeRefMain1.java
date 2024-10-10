package enumeration.ref1;



public class ClassGradeRefMain1 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();
        discountService.discount(ClassGrade.BASIC, price);
        discountService.discount(ClassGrade.GOLD, price);
        discountService.discount(ClassGrade.GOLD, price);
    }
}
