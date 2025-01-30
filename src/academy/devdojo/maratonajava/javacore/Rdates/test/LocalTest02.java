package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.util.Locale;

public class LocalTest02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        String[] isoLanguages = Locale.getISOLanguages();
        String[] isoCountries = Locale.getISOCountries();
        for (String isoLanguage : isoLanguages) {
            System.out.print(isoLanguage + " ");
        }
        
    }
}
















