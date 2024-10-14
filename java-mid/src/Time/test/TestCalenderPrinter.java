package Time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class TestCalenderPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year");
        int year = sc.nextInt();

        System.out.println("Enter Month");
        int month = sc.nextInt();

        printCalender(year,month);
    }

    private static void printCalender(int year, int month) {
        LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);
        LocalDate firstDayOfNextMonth = firstDayOfMonth.plusMonths(1);

        //월요일 =1(1%6=1) ... 일요일7(7%7=0)
        int offsetWeekDays = firstDayOfNextMonth.getDayOfWeek().getValue() % 7;
        System.out.println("Su Mo Tu We Thu Fr Sa");
        for (int i = 0; i < offsetWeekDays; i++) {
            System.out.println("   ");
        }
        LocalDate dayIterator = firstDayOfMonth;
        while(dayIterator.isBefore(firstDayOfNextMonth)) {
            System.out.printf("%2d ",dayIterator.getDayOfMonth());
            if(dayIterator.getDayOfWeek() == DayOfWeek.SATURDAY) {
                System.out.println();
            }
            dayIterator = dayIterator.plusDays(1);
        }
    }
}
