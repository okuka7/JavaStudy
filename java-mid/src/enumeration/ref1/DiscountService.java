package enumeration.ref1;



//StringGrade를 참고하세요
public class DiscountService {
    public int discount(ClassGrade  classGrade, int price){
        //어차피 등급별로 할인율을 가지고 있다.
        return price * classGrade.getDiscountPercent() /100;
    }
}
