package academy.devdojo.maratonajava.javacore.Npolimorfismo.domain;

import java.security.PublicKey;

public class Tomato extends Product{
    public static final double TAX = 0.06;
    private String dateValidity;
    
    public Tomato(String name, double value) {
        super(name, value);
    }

    @Override
    public double calculateTax() {
        System.out.println("Calculating tomate tax");
        return this.value * TAX;
    }

    public String getDateValidity() {
        return dateValidity;
    }

    public void setDateValidity(String dateValidity) {
        this.dateValidity = dateValidity;
    }
}
