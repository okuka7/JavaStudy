package Time;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class OffsetDateTimeMain {
    public static void main(String[] args) {
        OffsetDateTime nowOdt = OffsetDateTime.now();
        System.out.println(nowOdt);

        LocalDateTime ldt = LocalDateTime.of(2030, 1, 1, 13, 30, 50);
        System.out.println(ldt);
       OffsetDateTime odt =  OffsetDateTime.of(ldt, ZoneOffset.of("+01:00"));
        System.out.println("odt" + odt);
        //ZoneDateTime이나 OffsetDateTime은 글로벌 서비스를 하지 않으면 잘 사용하지 않는다. 따라서 너무 깊이있게 파기 보다는 대략 이런 것이 있다 정도로만 알아두면 된더다.
        //실무에서 개발하면서 글로벌 서비스를 개발할 기회가 있다면 그때 필요한 부분을 찾아서 깊이있게 학습하면 된다.
    }
}
