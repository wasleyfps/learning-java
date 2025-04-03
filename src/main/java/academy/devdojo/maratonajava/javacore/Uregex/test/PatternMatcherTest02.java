package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d - all digits
        // \D - all non-digits
        // \s - all whitespaces
        // \S - all non-whitespaces
        // \w - all characters
        // \W - all non-characters
        
        String regex = "\\d";
        String text = "abaaba";
        String text2 = "@#gh51f_g4h8*f64";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text2);
        System.out.println("Text:  " + text2);
        System.out.println("Index: 0123456789");
        System.out.println("Regex: " + regex);
        System.out.println("Positions found:");
        while (matcher.find()) {
            System.out.print(matcher.start() + " "+ matcher.group() + "\n");
        }
               
    }
}
