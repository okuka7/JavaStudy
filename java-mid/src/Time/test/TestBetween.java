package Time.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestBetween {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 12, 31);

        Period period = Period.between(startDate, endDate);
        long daysBetween = ChronoUnit.DAYS.between(startDate,endDate);

        System.out.println(startDate);
        System.out.println(endDate);
        System.out.println(period.getYears()+" "+period.getMonths()+" "+period.getDays());
        System.out.println(daysBetween);//d-day
    }
}
