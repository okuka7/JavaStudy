package Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {
    public static void main(String[] args) {
        LocalDateTime nowDt = LocalDateTime.now();
        LocalDateTime ofDt = LocalDateTime.of(2014,3,14,8,10,10);
        System.out.println("현재 날짜 시간" + nowDt);
        System.out.println("지정 날짜 시간" + ofDt);

        //날짜 시간 분리
        LocalDate localDate = ofDt.toLocalDate();
        LocalTime localTime = ofDt.toLocalTime();
        System.out.println("localTime" + localTime);
        System.out.println("localDate" + localDate);

        //날짜와 시간 합체
        LocalDateTime localDateTime =LocalDateTime.of(localDate,localTime);
        System.out.println("localDateTime" + localDateTime);

        //계산 (불변)
        LocalDateTime ofDtPlus = ofDt.plusDays(1000);
        System.out.println("지정 날짜 시간 + 1000 = " + ofDtPlus);
        LocalDateTime ofDtPlus1Year = ofDt.plusYears(1);
        System.out.println("지정 날짜 시간 + 1년 = " + ofDtPlus1Year);

        //비교
        System.out.println("현재 날짜 시간이 지정 날짜 시간보다 이전인가?" + nowDt.isBefore(ofDt));
        System.out.println("현재 날짜 시간이 지정 날짜 시간보다 이후인가?" + nowDt.isAfter(ofDt));
        System.out.println("현재 날짜 시간이 지정 날짜 시간과 같은가? " + nowDt.isEqual(ofDt));

        //isEquals는 단순히 비교대상이 시간적으로 같으면 True를 반환한다. -> 이것을 많이 쓴다.
        //equals는 객체의 타입, 타임존 등 내부 데이터의 모든 구성요소가 같아야 True를 반환한다.
    }
}
