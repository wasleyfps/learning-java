package academy.devdojo.maratonajava.javacore.LclassesAbstract.test;

import academy.devdojo.maratonajava.javacore.LclassesAbstract.domain.Developer;
import academy.devdojo.maratonajava.javacore.LclassesAbstract.domain.Employee;
import academy.devdojo.maratonajava.javacore.LclassesAbstract.domain.Manager;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Manager manager = new Manager("Nami", 5000);
        Developer developer = new Developer("Luffy", 12000);
        System.out.println(manager);
        System.out.println(developer);
        manager.print();
        developer.print();
    }
}
