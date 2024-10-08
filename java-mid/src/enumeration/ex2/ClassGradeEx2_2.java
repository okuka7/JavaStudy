package enumeration.ex2;

public class ClassGradeEx2_2 {
    public static void main(String[] args) {
        int price = 10000;

        /*DiscountService discountService = new DiscountService();
        ClassGrade newClassGrade = new ClassGrade();//x009 프라이빗으로 만들어서 컴파일 오류가 난다.
        int result = discountService.discount(newClassGrade, price);
        System.out.println(result);*/
        //안된다. 이유는 완전히 새로운 참조값을 만들어 내기때문에 없다.
    }
}
