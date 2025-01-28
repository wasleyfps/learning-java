package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        // Strings são imutáveis, ficar atento a isso.
        
        String name = "Wasley"; // String pool
        String name2 = "Wasley"; // String pool
        name = name.concat(" Carvalho"); // Wasley Carvalho
        System.out.println(name);
        System.out.println(name == name2);
        String name3 = new String("Wasley"); // 1 - Variável de referência, 2 - Um objeto do tipo string, 3 - Uma string no pool de strings
        System.out.println(name2 == name3); 
        System.out.println(name2 == name3.intern()); 
    }
}
