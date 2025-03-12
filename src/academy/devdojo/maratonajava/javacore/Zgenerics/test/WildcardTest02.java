package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import java.util.ArrayList;
import java.util.List;

public class WildcardTest02 {
    public static void main(String[] args) {
        List<Dog> dogs = List.of(new Dog(), new Dog());
        List<Cat> cats = List.of(new Cat(), new Cat());
        printConsult(dogs);
        printConsult(cats);
        List<Animal> animals = new ArrayList<>();
        printConsultAnimal(animals);
    }
    // Type erasure
    private static void printConsult(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.consult();
        }
    }
    private static void printConsultAnimal(List<? super Animal> animals) {
        Animal animal = new Dog();
        Animal animal2 = new Cat();
        animals.add(new);
    }
}
