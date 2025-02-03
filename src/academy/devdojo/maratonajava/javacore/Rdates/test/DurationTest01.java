package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationTest01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2).plusMinutes(10);
        LocalTime timeNow = LocalTime.now();
        LocalTime time = LocalTime.now().minusHours(7);
        Duration duration = Duration.between(timeNow, time);
        Duration duration1 = Duration.between(now, nowAfterTwoYears);
        Duration duration2 = Duration.between(Instant.now(), Instant.now().plusSeconds(1000));
        Duration duration3 = Duration.ofDays(20);
        Duration duration4 = Duration.ofMinutes(3);
        Duration duration5 = Duration.of(3, ChronoUnit.HOURS);
        
        System.out.println(now);
        System.out.println(nowAfterTwoYears);
        System.out.println(duration);
        System.out.println(duration1);
        System.out.println(duration2);
        System.out.println(duration3);
        System.out.println(duration4);
        System.out.println(duration5);
    }
}
