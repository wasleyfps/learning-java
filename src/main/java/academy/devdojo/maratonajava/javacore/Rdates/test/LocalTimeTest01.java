package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        LocalTime time2 = LocalTime.of(23, 59, 59);
        
        System.out.println(time);
        System.out.println(time2);
        
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println(time.get(ChronoField.HOUR_OF_DAY));
        
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);
    }
}
