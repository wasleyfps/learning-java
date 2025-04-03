package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        LocalDateTime dateTime2 = LocalDateTime.of(2022, 1, 1, 23, 59, 59);
        System.out.println(dateTime);
        System.out.println(dateTime2);
        
        LocalTime time = LocalTime.of(9, 45, 21);
        LocalDate date = LocalDate.parse("2022-12-31");

        System.out.println(time);
        System.out.println(date);   
        
        LocalDateTime localDateTime1 = date.atTime(time);
        LocalDateTime localDateTime2 = time.atDate(date);
        System.out.println(localDateTime1);
        System.out.println(localDateTime2);
    }
}
