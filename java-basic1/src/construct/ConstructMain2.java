package construct;

public class ConstructMain2 {
    public static void main(String[] args) {
        MemberSonstruct member1 = new MemberSonstruct("user1",15,90);
        MemberSonstruct member2 = new MemberSonstruct("user2",13);
        //grade가 없는 생성자를 호출하면 기본적으로 점수가 50점이 된다.

        MemberSonstruct [] members = {member1,member2};

        for(MemberSonstruct s : members){
            System.out.println(s.name + s.age + s.grade);
        }
    }
}
