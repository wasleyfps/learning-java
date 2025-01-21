package academy.devdojo.maratonajava.javacore.Npolimorfismo.domain;

public class TV extends Product{
    public static final double TAX = 0.21;
    
    public TV(String name, double value) {
        super(name, value);
    }

    @Override
    public double calculateTax() {
        System.out.println("Calculating TV tax");
        return this.value * TAX;
    }
}
