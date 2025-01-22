package academy.devdojo.maratonajava.javacore.Jfinalmodifier.test;

import academy.devdojo.maratonajava.javacore.Jfinalmodifier.domain.Buyer;
import academy.devdojo.maratonajava.javacore.Jfinalmodifier.domain.Car;
import academy.devdojo.maratonajava.javacore.Jfinalmodifier.domain.Ferrari;

public class CarTest01 {
    public static void main(String[] args) {
        Car car = new Car();
        Buyer buyer = new Buyer();
        System.out.println(car.limitSpeed);
        System.out.println(car.buyer);
        car.buyer.setName("Kuririn");
        System.out.println(car.buyer);

        Ferrari ferrari = new Ferrari();
        ferrari.setName("Teste");
        ferrari.print();
    }
}
