package Time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class IsSupportedMain1 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        boolean supported  = now.isSupported(ChronoField.SECOND_OF_MINUTE);
        System.out.println(supported);
        if(supported){
            int minut = now.get(ChronoField.SECOND_OF_MINUTE);
            System.out.println(minut);
        }


        int minut = now.get(ChronoField.SECOND_OF_MINUTE);
        System.out.println(minut); // 예외가 터진다.



    }
}
