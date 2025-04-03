package academy.devdojo.maratonajava.javacore.Npolimophism.services;

import academy.devdojo.maratonajava.javacore.Npolimophism.domain.Product;
import academy.devdojo.maratonajava.javacore.Npolimophism.domain.Tomato;

public class CalculateTax {
      
    public static void calculateTaxGeneric(Product product){
        System.out.println("Report of taxes for product");
        double tax = product.calculateTax();
        System.out.println("Product tax: " + product.getName());
        System.out.println("Value tax: " + product.getValue());
        System.out.println("Tax to be paid: " + tax);

        // instanceof is used to check if the object is an instance of a class
        if(product instanceof Tomato){
            String dateValidity = ((Tomato) product).getDateValidity();
            
            System.out.println("Date of validity: " + dateValidity);
        }
    }
}
