package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        MemberSonstruct member1 = new MemberSonstruct("user1",15,90);
        MemberSonstruct member2 = new MemberSonstruct("user2",18,00);

        MemberSonstruct [] members = {member1,member2};

        for(MemberSonstruct s : members){
            System.out.println(s.name + s.age + s.grade);
        }
    }
}
