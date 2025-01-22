package academy.devdojo.maratonajava.javacore.Npolimophism.test;

import academy.devdojo.maratonajava.javacore.Npolimophism.domain.Computer;
import academy.devdojo.maratonajava.javacore.Npolimophism.domain.Product;

public class ProductTest02 {
    public static void main(String[] args) {
        Product product = new Computer("Ryzen 9", 3000);
        System.out.println(product.getName());
        System.out.println(product.getValue());
    }
}
