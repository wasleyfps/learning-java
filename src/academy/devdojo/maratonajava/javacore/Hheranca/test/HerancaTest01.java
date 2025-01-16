package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.domain.Address;
import academy.devdojo.maratonajava.javacore.Hheranca.domain.Employee;
import academy.devdojo.maratonajava.javacore.Hheranca.domain.People;

public class HerancaTest01 {
    public static void main(String[] args) {
        Address address = new Address();
        address.setStreet("Rua 3");
        address.setPostcode("123456-789");
        People people = new People("Wasley Carvalho");
//        people.setName();
        people.setCpf("123.456.789-10");
        people.setAddress(address);
        people.print();
        
        
        System.out.println("------------------------");
        Employee employee = new Employee("Jiraya");
//        employee.setName();
        employee.setCpf("321.654.987-10");
        employee.setAddress(address);
        employee.setSalary(20000);
        employee.print();
    }
}
