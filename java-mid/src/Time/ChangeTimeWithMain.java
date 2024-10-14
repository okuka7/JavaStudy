package Time;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class ChangeTimeWithMain {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2018, 1, 1, 13, 30, 59);
        System.out.println(dt);

        LocalDateTime changedDt1 = dt.with(ChronoField.YEAR, 2020);
        System.out.println(changedDt1); //새로운 연도를 만들어서 반환한 것이다.

        LocalDateTime ChangeDt2 = dt.withYear(2020);
        System.out.println(ChangeDt2);
        
        //TemporalAdjuster 사용
        //다음 주 금요일
        LocalDateTime with1 = dt.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println(dt); //기준날짜
        System.out.println(with1);//다음 금요일
        
        //이번 달의 마지막 일요일
        LocalDateTime with2 = dt.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
        System.out.println(with2);

        //Temporal.with()를 사용하면 날짜와 시간의 특정 필드의 값만 변경할 수 있다.
        //불변이므로 반환 값을 받아야 한다.
        //TemporalAdjuster을 사용하면 복잡한 날짜 계산을 할 수 있다.
        //날짜 계산하느라 고생하면 안되고 이런것들을 가져다가 써야 한다.
    }
}
