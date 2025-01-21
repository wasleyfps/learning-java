package academy.devdojo.maratonajava.javacore.Npolimorfismo.domain;

public class Computer extends Product {
    public static final double TAX = 0.21;
    
    public Computer(String name, double value) {
        super(name, value);
    }

    @Override
    public double calculateTax() {
        System.out.println("Calculating computer tax");
        return this.value * TAX;
    }
}
