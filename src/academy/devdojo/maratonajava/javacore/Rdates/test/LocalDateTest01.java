package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());
        System.out.println(Month.JANUARY.getValue());
        
        LocalDate date = LocalDate.now(); // Date of today
        System.out.println(date);
        LocalDate date2 = LocalDate.of(2022, 1, 1); // Date Expected output: 2022-01-01
        System.out.println(date2);
               
        // Methods of LocalDate
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.lengthOfMonth());

        System.out.println(date.isLeapYear()); // Whether the year is a leap year or not
        System.out.println(date.get(ChronoField.YEAR));
        System.out.println(date.get(ChronoField.MONTH_OF_YEAR));
        System.out.println(date.get(ChronoField.DAY_OF_MONTH));

        System.out.println(LocalDate.MAX);
        System.out.println(LocalDate.MIN);
    }
}
