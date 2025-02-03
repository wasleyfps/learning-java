package academy.devdojo.maratonajava.javacore.Sformatting.test;

import academy.devdojo.maratonajava.javacore.Gassociation.dominio.Local;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        
        LocalDate parse1 = LocalDate.parse("20211015", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2021-10-15+05:00", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2021-10-15", DateTimeFormatter.ISO_LOCAL_DATE);
        
        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);

        LocalDateTime dateTime = LocalDateTime.now();
        String s4 = dateTime.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s4);
        
        LocalDateTime parse4 = LocalDateTime.parse("2021-10-15T10:20:30", DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(parse4);
        
        // dd/MM/yyyy
        // MM/dd/yyyy
        // yyyy/MM/dd
        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDate.now().format(formatterBR);
        System.out.println(formatBR);
        System.out.println(dateTime.format(formatterBR));

        LocalDate parse5 = LocalDate.parse("15/10/2021", formatterBR);
        System.out.println(parse5);
        
        DateTimeFormatter formatterGR = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN);
        String formatGR = LocalDate.now().format(formatterGR);
        System.out.println(formatGR);
        LocalDate parse = LocalDate.parse("15.Oktober.2021", formatterGR);
        System.out.println(parse);
    }
}
