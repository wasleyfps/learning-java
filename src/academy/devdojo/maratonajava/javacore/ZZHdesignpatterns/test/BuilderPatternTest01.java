package academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.test;

import academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.domain.Person;

public class BuilderPatternTest01 {
    public static void main(String[] args) {
        // new Person("Wasley", "Carvalho", "Wasleyfps", "wasleyoliveiradecarvalho@gmail.com");
        Person build = new Person.PersonBuilder()
                .firstName("Wasley")
                .lastName("Carvalho")
                .userName("Wasleyfps")
                .email("wasleyoliveiradecarvalho@gmail.com")
                .build();
        System.out.println(build);
    }
    
    
}
