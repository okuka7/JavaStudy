package Time;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdMain {
    public static void main(String[] args) {
        for(String availableZoneId : ZoneId.getAvailableZoneIds()){
            System.out.println(availableZoneId);//이용가능한 존 아이디가 나온다.
            ZoneId zoneId = ZoneId.of(availableZoneId);
            System.out.println(zoneId + "|" + zoneId.getRules());
        }
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("zoneId.systemDefault = " + zoneId);

        ZoneId soulZoneId = ZoneId.of("Asia/Seoul");
        System.out.println("seoulZoneId = " + soulZoneId);
    }
}
