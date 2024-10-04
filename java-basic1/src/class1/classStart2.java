package class1;

public class classStart2 {
    public static void main(String[] args) {

        String[] studentNames = {"학생1","학생2","학생3","학생4"};
        int [] studentAges = {15,16,19,20};
        int [] studentGrade = {90,100,200,30};

        for(int i = 0; i< studentNames.length; i++){
            System.out.println(studentNames[i]+studentAges[i]+studentGrade[i]);
        }
    }
}
