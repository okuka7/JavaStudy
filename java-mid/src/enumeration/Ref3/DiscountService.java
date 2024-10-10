package enumeration.Ref3;


//StringGrade를 참고하세요
public class DiscountService {
    public int discount(Grade grade, int price){
        return grade.discount(price);
    }
}
