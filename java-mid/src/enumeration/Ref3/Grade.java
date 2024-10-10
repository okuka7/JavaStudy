package enumeration.Ref3;

public enum Grade {
    BASIC(10),GOLD(20),DIAMOND(30);
    //ref1에서 생성할때 퍼센테이지 넣은것과 같다.
    private final int discountPercent;

    //private이 생략되어있다.
    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }
    public int getDiscountPercent() {
        return discountPercent;
    }
    //추가  할인율 계산
    public int discount(int price){
        return price * discountPercent/100;
    }
}
