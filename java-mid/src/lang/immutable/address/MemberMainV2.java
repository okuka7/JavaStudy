package lang.immutable.address;

public class MemberMainV2 {
    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("서울");

        //회원 A,B의 처음 주소는 모두 서울
        MemberV2 memberA = new MemberV2("회원A",address);
        MemberV2 memberB = new MemberV2("회원B",address);

        //회원 B의 주소를 부산으로 변경해야 합.
        memberB.setAddress(new ImmutableAddress("부산")); //새로 생성해준다.
        System.out.println("부산 -> memberB.address");
        System.out.println(memberA);
        System.out.println(memberB);

    }
}
