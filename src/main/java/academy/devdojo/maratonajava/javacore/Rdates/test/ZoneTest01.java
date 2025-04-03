package academy.devdojo.maratonajava.javacore.Rdates.test;

import academy.devdojo.maratonajava.javacore.Gassociation.dominio.Local;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());
        
        ZoneId zone = ZoneId.of("America/Chicago");
        System.out.println(zone);
        
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        
        ZonedDateTime zonedDateTime = now.atZone(zone);
        System.out.println(zonedDateTime);

        Instant nowInstant = Instant.now();
        System.out.println(nowInstant);
        
        ZonedDateTime zonedDateTime2 = nowInstant.atZone(zone);
        System.out.println(zonedDateTime2);

        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);
        
        ZoneOffset zoneOffset = ZoneOffset.of("-03:00");
        OffsetDateTime offsetDateTime = now.atOffset(zoneOffset);
        System.out.println(offsetDateTime);
        
        OffsetDateTime offsetDateTime2 = OffsetDateTime.of(now, zoneOffset);
        System.out.println(offsetDateTime2);
        
        OffsetDateTime offsetDateTime3 = nowInstant.atOffset(zoneOffset);
        System.out.println(offsetDateTime3);

        JapaneseDate japaneseDate = JapaneseDate.from(LocalDate.now());
        System.out.println(japaneseDate);
        LocalDate localDate = LocalDate.of(1900, 2, 1);
        JapaneseDate japaneseDate2 = JapaneseDate.from(localDate);
        System.out.println(japaneseDate2);
    }
}
