package academy.devdojo.maratonajava.javacore.Npolimophism.test;

import academy.devdojo.maratonajava.javacore.Npolimophism.domain.Computer;
import academy.devdojo.maratonajava.javacore.Npolimophism.domain.TV;
import academy.devdojo.maratonajava.javacore.Npolimophism.domain.Tomato;
import academy.devdojo.maratonajava.javacore.Npolimophism.services.CalculateTax;

public class ProductTest01 {
    public static void main(String[] args) {
        Computer computer = new Computer("Dell", 2000);
//        computer.calculateTax();
        
        System.out.println("----------------------");
        Tomato tomato = new Tomato("Tomato", 10);
//        tomato.calculateTax();

        CalculateTax.calculateTaxGeneric(computer);
        System.out.println("----------------------");
        CalculateTax.calculateTaxGeneric(tomato);

        TV tv = new TV("Samsung 50\" ", 5000);
        System.out.println("----------------------");
        CalculateTax.calculateTaxGeneric(tv);
    }
}
