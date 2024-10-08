package enumeration.ex1;

//StringGrade를 참고하세요
public class DiscountService {
    public int discount(String grade,int price){
        int discountPercent = 0;
        if(grade.equals(StringGrade.BASIC)){
            discountPercent = 10;
        }else if(grade.equals(StringGrade.GOLD)){
            discountPercent = 20;
        }else if(grade.equals(StringGrade.DIAMOND)){
            discountPercent = 30;
        }else {
            System.out.println(grade + "할인 X");
        }
        //할인율
        return price * discountPercent /100;
    }
}
