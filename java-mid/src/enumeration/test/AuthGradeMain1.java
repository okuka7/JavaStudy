package enumeration.test;

public class AuthGradeMain1 {
    public static void main(String[] args) {
        AuthGrade[] values = AuthGrade.values();
        for (AuthGrade value : values) {
            System.out.println("Grade" + value.name()+"레벨" +value.getLevel()+ "설명 "+value.getDescription() );
        }
    }
}
