package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String name = "Wasley ";
        String numbers = "012345";
        System.out.println(name.charAt(0));
        System.out.println(name.length());
        System.out.println(name.replace("a", "A"));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(numbers.substring(0, 2));
        System.out.println(numbers.substring(3,numbers.length()));
        System.out.println(name.trim()); // Remove space in the beginning and end of the string
    }
}
