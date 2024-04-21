package time;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class OffsetDateTimeMain {
    public static void main(String[] args) {
        OffsetDateTime notOdt = OffsetDateTime.now();
        System.out.println("notOdt = " + notOdt);

        LocalDateTime localDateTime = LocalDateTime.of(2030, 1, 1, 13, 30, 50);
        OffsetDateTime.of(localDateTime, ZoneOffset.of("+01:00"));
    }
}
