package academy.devdojo.maratonajava.javacore.Zgenerics.test;

abstract class Animal {
    public abstract void consult();
}

class Dog extends Animal {
    @Override
    public void consult() {
        System.out.println("Dog consult!");
    }
}

class Cat extends Animal {
    @Override
    public void consult() {
        System.out.println("Cat consult!");
    }
}

public class WildcardTest01 {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[]{new Dog(), new Dog()};
        Cat[] cats = new Cat[]{new Cat(), new Cat()};
        printConsult(dogs);
        printConsult(cats);
        Animal[] animals = new Animal[]{new Dog(), new Dog()};
        printConsult(animals);
    }
    private static void printConsult(Animal[] animals) {
        for (Animal a : animals) {
            a.consult();
        }
//        animals[1] = new Cat();
    }
}
