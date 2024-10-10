package enumeration.Ref2;



//StringGrade를 참고하세요
public class DiscountService {
    public int discount(Grade grade, int price){
        //할인율
        return price * grade.getDiscountPercent() /100;
    }
}
