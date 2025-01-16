package academy.devdojo.maratonajava.javacore.Hheranca.domain;

public class Employee extends People {
    private double salary;

    static{
        System.out.println("Dentro do bloco de inicialização estático de Employee");
    }

    {
        System.out.println("Dentro do bloco de inicialização de Employee 1");
    }

    {
        System.out.println("Dentro do bloco de inicialização de Employee 2");
    }


    public Employee(String name) {
        super(name);
        System.out.println("Dentro do construtor de Employee");
    }

    public void print() {
        // Super is a reference to the superclass
        super.print();
        System.out.println("Salário: " + this.salary);
    }
    
    public void PaymentReport() {
        System.out.println("Eu " + this.name + " recebi o salário de " + this.salary);
    }
    
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
