package Time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class GetTimeMain {
    public static void main(String[] args) {
        //겟을 이용해서 가지고 온다.
        LocalDateTime dt = LocalDateTime.of(2939,1,1,13,30,59);
        System.out.println(dt.get(ChronoField.YEAR));
        System.out.println(dt.get(ChronoField.MONTH_OF_YEAR));
        System.out.println(dt.get(ChronoField.DAY_OF_MONTH));
        System.out.println(dt.get(ChronoField.HOUR_OF_DAY));
        System.out.println(dt.get(ChronoField.MINUTE_OF_HOUR));
        System.out.println(dt.get(ChronoField.SECOND_OF_MINUTE));

        System.out.println("편의 메서드 제공");
        System.out.println(dt.getYear());
        System.out.println(dt.getMonthValue());
        System.out.println(dt.getDayOfMonth());
        System.out.println(dt.getHour());
        System.out.println(dt.getMinute());
        System.out.println(dt.getSecond());

        System.out.println("편의 메서드에 없음");
        System.out.println(dt.get(ChronoField.MICRO_OF_DAY)); //하루에 있는 시간만 구하기
        System.out.println(dt.get(ChronoField.SECOND_OF_DAY));


    }
}
