package lang.immutable.test;

public class ImmetableMyDate {
    private final int year;
    private final int month;
    private final int day;

    public ImmetableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public ImmetableMyDate withYear(int newYear) {
        return new ImmetableMyDate(newYear, month, day);
    }

    public int getMonth() {
        return month;
    }

    public ImmetableMyDate withMonth(int newMonth) {
        return new ImmetableMyDate(year, newMonth, day);
    }

    public int getDay() {
        return day;
    }

    public ImmetableMyDate withDay(int newDay) {
        return new ImmetableMyDate(year, month, newDay);
    }

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}
