package academy.devdojo.maratonajava.javacore.Oexception.exception.domain;

import java.io.FileNotFoundException;

public class Person {
    public void save() throws LoginInvalidException, FileNotFoundException {
        System.out.println("Saving person");
    }
}
