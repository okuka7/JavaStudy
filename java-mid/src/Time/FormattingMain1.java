package Time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingMain1 {
    public static void main(String[] args) {
        //포맷팅 : 날짜를 문자로
        LocalDate date = LocalDate.of(2024,12,31);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");//형태가 같아야 한다.
        String formaattedDate = date.format(formatter);
        System.out.println(formaattedDate);

        //파싱 : 문자를 날짜로
        String input = "2024년 01월 01일";
        LocalDate parsedDate = LocalDate.parse(input, formatter);
        System.out.println(parsedDate);

        //실제로 쓸일이 많다.
    }
}
