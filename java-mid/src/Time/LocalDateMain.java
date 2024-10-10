package Time;

import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        LocalDate ofDate = LocalDate.of(2024,11,21);
        System.out.println("오늘 날찌" + nowDate);
        System.out.println("지정 날짜" + ofDate);

        //계산(불변)
        //불변이기 때문에 변하지 않는다.
        ofDate.plusDays(1);// 변하지 않는다.
        ofDate = ofDate.plusDays(10);//반환 값을 받아야 한다.
        System.out.println("지정날짜 + 10일" + ofDate);
        //모든 날짜는 불변ㅇ이다. 따라서 변경이 발생하는 경우 새로운 객체를 생성해서 반환하므로
        //반환 값을 꼭 받아야 한다.
    }
}
