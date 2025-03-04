package academy.devdojo.maratonajava.javacore.Sformatting.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localeDefault = Locale.getDefault();
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = new Locale("ja", "JP");
        Locale localeCH = new Locale("it", "CH");
        
        NumberFormat[] numberFormats = new NumberFormat[4];
        numberFormats[0] = NumberFormat.getInstance();
        numberFormats[1] = NumberFormat.getInstance(localeBR);
        numberFormats[2] = NumberFormat.getInstance(localeJP);
        numberFormats[3] = NumberFormat.getInstance(localeCH);
        
        double valor = 1_000.2130;
        for (NumberFormat numberFormat : numberFormats) {
            numberFormat.setMaximumFractionDigits(2);
            System.out.println(numberFormat.format(valor));
        }
        
        String valueString = "1000,2130";
        try {
            System.out.println(numberFormats[0].parse(valueString));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
              

    }
}
