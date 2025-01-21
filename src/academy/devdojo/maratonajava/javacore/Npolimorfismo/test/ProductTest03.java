package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Computer;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Product;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Tomato;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.services.CalculateTax;

public class ProductTest03 {
    public static void main(String[] args) {
        Product product = new Computer("Ryzen 9", 3000);

        Tomato tomato = new Tomato("American", 20);
        tomato.setDateValidity("10/12/2025");

        CalculateTax.calculateTaxGeneric(tomato);
        CalculateTax.calculateTaxGeneric(product);
    }
}
