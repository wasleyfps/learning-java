package academy.devdojo.maratonajava.javacore.ZZinternalClasses.test;

class Animal{
    public void walk(){
        System.out.println("Animal Walking");
    }
}

class Dog extends Animal {
    @Override
    public void walk(){
            System.out.println("Dog Walking");
    }
}

public class AnonymousClassTest01 {
    public static void main(String[] args) {
        Animal animal = new Animal(){
            @Override
            public void walk(){
                System.out.println("Walking in the shadows");
            }
        };
        animal.walk();
    }
}
