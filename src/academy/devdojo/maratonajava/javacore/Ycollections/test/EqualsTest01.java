package academy.devdojo.maratonajava.javacore.Ycollections.test;

import academy.devdojo.maratonajava.javacore.Ycollections.domain.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone("1ABC1", "iPhone");
        Smartphone smartphone2 = new Smartphone("1ABC1", "iPhone");
        System.out.println(smartphone.equals(smartphone2));
    }
    
}
