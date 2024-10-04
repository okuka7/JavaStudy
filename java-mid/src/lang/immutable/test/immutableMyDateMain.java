package lang.immutable.test;

public class immutableMyDateMain {
    public static void main(String[] args) {
        //x001
        ImmetableMyDate date1 = new ImmetableMyDate(2024,1,1);
        ImmetableMyDate date2 = date1; //date1 = x001,date2 = x001

        System.out.println(date1);
        System.out.println(date2);

        date1 = date1.withYear(2025);//x002 새로 생성했기 때문에 002를 갖게 된다.
        System.out.println(date1); //x002
        System.out.println(date2);

        //with는 관례처럼 사용되는데, 원본 객체의 상태가 그대로 유지됨을 강조하면서 변경사항을 새 복사본에 포함하는 과정을 간결하게 표현한다.
        //불변객체에서 원본을 두고 새로운것을 추가해서 복사할때 사용한다.
    }
}
