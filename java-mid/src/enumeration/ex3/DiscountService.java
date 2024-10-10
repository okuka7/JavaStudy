package enumeration.ex3;


import static enumeration.ex3.Grade.*;
//StringGrade를 참고하세요
public class DiscountService {
    public int discount(Grade classGrade, int price){
        int discountPercent = 0;


        if(classGrade == Grade.BASIC){
            discountPercent = 10;
        }else if(classGrade == GOLD){ //상수기때문에 스태틱으로 간단하게 할 수 있다.
            discountPercent = 20;
        }else if(classGrade == DIAMOND){
            discountPercent = 30;
        }else {
            System.out.println("할인 X");
        }
        //할인율
        return price * discountPercent /100;
    }
}
