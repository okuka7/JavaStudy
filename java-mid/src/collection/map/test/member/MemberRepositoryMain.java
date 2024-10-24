package collection.map.test.member;

public class MemberRepositoryMain {
    public static void main(String[] args) {
        Member member1 = new Member("id1","회원1");
        Member member2 = new Member("id2","회원2");
        Member member3 = new Member("id3","회원3");

        //회원저장
        MemberRepository repository = new MemberRepository();
        repository.save(member1);
        repository.save(member2);
        repository.save(member3);

        //회원 조회
        Member findMember1 = repository.findById("id1");
        System.out.println(findMember1);

        //회원삭제
        repository.remove("id1");
        System.out.println(findMember1);
    }
}
