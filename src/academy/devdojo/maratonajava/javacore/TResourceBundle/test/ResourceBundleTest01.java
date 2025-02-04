package academy.devdojo.maratonajava.javacore.TResourceBundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        ResourceBundle bundle2 = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));
        
        System.out.println(bundle2.getString("hello"));
        System.out.println(bundle2.getString("good.morning"));
        
        // Locale("fr", "CA") -> messages_fr_CA.properties
        // messages_fr.properties
        // messages_fr_CA.properties

        System.out.println(bundle.getString("hi"));
        
    }
}
