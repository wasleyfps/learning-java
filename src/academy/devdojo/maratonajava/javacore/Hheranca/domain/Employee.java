package academy.devdojo.maratonajava.javacore.Hheranca.domain;

public class Employee extends People {
    private double salary;

    public void print() {
        // Super is a reference to the superclass
        super.print();
        System.out.println("Salário: " + this.salary);
    }
    
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
