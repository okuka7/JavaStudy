package construct;

public class MethodInitMain3 {
    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        member1.initMember("user1",15,90);

        MemberInit member2 = new MemberInit();
        member2.initMember("user2",12,100);

        MemberInit [] members = {member1,member2};

        for(MemberInit s : members){
            System.out.println(s.name + s.age + s.grade);
        }
    }

}
