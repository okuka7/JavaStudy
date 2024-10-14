package Time.test;

import java.time.LocalDateTime;

public class TestPlus {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2024,1,1,0,0,0);
        LocalDateTime futureDate = dateTime.plusYears(1).plusMonths(2).plusDays(2).plusHours(4);
        System.out.println(futureDate);
    }
}
