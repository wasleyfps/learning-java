package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        // \d - all digits
        // \D - all non-digits
        // \s - all whitespaces
        // \S - all non-whitespaces
        // \w - all characters
        // \W - all non-characters
        // []
        // ? - zero or one
        // * - zero or more
        // + - one or more
        // {n,m} - n to m
        // ()
        // | o(u|l)ha - ouha or olha
        // $ - end of line
//        String regex = "[a-zA-C]";
        String regex = "0[xX]([0-9a-fA-F])+\\s";
        String text = "12x 0x 0X 0xFFABC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        System.out.println("Text:  " + text);
        System.out.println("Index: 0123456789");
        System.out.println("Regex: " + regex);
        System.out.println("Positions found:");
        while (matcher.find()) {
            System.out.print(matcher.start() + " "+ matcher.group() + "\n");
        }
        
        int numberHex = 0x59F86A; // Hexadecimal number
        System.out.println(numberHex);
               
    }
}
