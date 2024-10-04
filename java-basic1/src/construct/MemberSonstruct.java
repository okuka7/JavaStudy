package construct;

public class MemberSonstruct {
    String name;
    int age;
    int grade;

    //추가
    MemberSonstruct(String name,int age){
        this(name,age,60);
    }

    MemberSonstruct(String name, int age,int grade){
        System.out.println(name + age + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
