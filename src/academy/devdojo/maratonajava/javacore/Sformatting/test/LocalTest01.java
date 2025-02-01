package academy.devdojo.maratonajava.javacore.Sformatting.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocalTest01 {
    public static void main(String[] args) {
        Locale localePortugal = new Locale("pt", "PT");
        Locale localeCH = new Locale("it", "CH");
        Locale localeIndia = new Locale("hi", "IN");
        Locale localeJapan = new Locale("ja");
        Locale localNetherlands = new Locale("nl", "NL");
        
        Calendar calendar = Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localePortugal);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeJapan);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localNetherlands);
        
        System.out.println("Portugal: " + df1.format(calendar.getTime()));
        System.out.println("Switzerland: " + df2.format(calendar.getTime()));
        System.out.println("India: " + df3.format(calendar.getTime()));
        System.out.println("Japan: " + df4.format(calendar.getTime()));
        System.out.println("Netherlands: " + df5.format(calendar.getTime()));

        System.out.println(localePortugal.getDisplayCountry());
        System.out.println(localePortugal.getDisplayLanguage());
    }
}
