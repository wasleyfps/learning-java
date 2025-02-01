package academy.devdojo.maratonajava.javacore.Sformatting.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = new Locale("ja", "JP");
        Locale localeCH = new Locale("it", "CH");

        NumberFormat[] numberFormats = new NumberFormat[4];
        numberFormats[0] = NumberFormat.getCurrencyInstance();
        numberFormats[1] = NumberFormat.getCurrencyInstance(localeBR);
        numberFormats[2] = NumberFormat.getCurrencyInstance(localeJP);
        numberFormats[3] = NumberFormat.getCurrencyInstance(localeCH);

        double valor = 1000.2130;
        for (NumberFormat numberFormat : numberFormats) {
            System.out.println(numberFormat.getMaximumFractionDigits());
            System.out.println(numberFormat.format(valor));
        }
        
        String valueString = "$1,000.21";
        
        try {
            System.out.println(numberFormats[0].parse(valueString));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
