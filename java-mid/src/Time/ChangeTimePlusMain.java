package Time;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class ChangeTimePlusMain {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2019,1,1,13,30,40);
        System.out.println(dt);

        LocalDateTime plustDt1 = dt.plus(10, ChronoUnit.YEARS);
        System.out.println(plustDt1);

        LocalDateTime plusDt2 = dt.plusYears(10);
        System.out.println(plusDt2);

        Period period = Period.ofYears(10);
        LocalDateTime plusDt3 = dt.plus(period);
        System.out.println(plusDt3);
    }
}
