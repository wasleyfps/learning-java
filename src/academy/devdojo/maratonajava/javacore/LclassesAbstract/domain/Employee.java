package academy.devdojo.maratonajava.javacore.LclassesAbstract.domain;

public abstract class Employee extends People {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        calculateBonus();
    }
    
    public abstract void calculateBonus();

    @Override
    public void print() {
        System.out.println("Printing employee");
    }
}
