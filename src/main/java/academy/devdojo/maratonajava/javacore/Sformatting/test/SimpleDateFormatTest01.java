package academy.devdojo.maratonajava.javacore.Sformatting.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
        System.out.println(simpleDateFormat.format(System.currentTimeMillis()));
        
        
        String pattern = "'Brasil' dd 'de' MMMM 'de' yyyy";
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(pattern);
        System.out.println(simpleDateFormat2.format(new Date()));
        
    }
}
