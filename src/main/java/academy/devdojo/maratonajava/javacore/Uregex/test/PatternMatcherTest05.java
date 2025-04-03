package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
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
        // . 1.3 - 123, 133, 1@3, 1a3, 1 3
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String text = "saitama@hotmail.com, naruto123@hotmail.com, #@!kenpachi@mail.br, teste@gmail.com.br, hinata@mail.com";
        System.out.println("E-mail Valid: ");
        System.out.println("#@!kenpachi@mail.br".matches(regex));
        System.out.println(text.split(",")[2].trim());
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
