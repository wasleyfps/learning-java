package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.domain.People;

public class Employee02 extends People {
    public Employee02(String name) {
        super(name);
    }

    public void print(){
        this.name = "Jiraya";
    }
}
