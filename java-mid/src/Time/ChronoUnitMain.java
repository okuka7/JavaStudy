package Time;

import java.time.temporal.ChronoUnit;

public class ChronoUnitMain {
    public static void main(String[] args) {
        ChronoUnit[] values = ChronoUnit.values();
        for(ChronoUnit value : values) {
            System.out.println(value);
        }
        }
}
