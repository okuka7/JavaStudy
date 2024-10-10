package enumeration.ref1;

public class ClassGrade {
    public static final ClassGrade BASIC = new ClassGrade(10); //x001
    public static final ClassGrade GOLD = new ClassGrade(20); //x002
    public static final ClassGrade DIAMOND = new ClassGrade(30); //x003
    //회원 등급별로 할인율을 가지고 관리하도록 했다.
    private final int discountPercent;

    public ClassGrade(int discountPercent) {
        //생성할때 discountPercent를 가지고 생성하게 만들 것이다.
        this.discountPercent = discountPercent;
    }
    public int getDiscountPercent() {
        return discountPercent;
    }
}
