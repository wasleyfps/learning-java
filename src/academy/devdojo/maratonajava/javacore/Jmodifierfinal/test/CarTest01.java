package academy.devdojo.maratonajava.javacore.Jmodifierfinal.test;

import academy.devdojo.maratonajava.javacore.Jmodifierfinal.domain.Buyer;
import academy.devdojo.maratonajava.javacore.Jmodifierfinal.domain.Car;
import academy.devdojo.maratonajava.javacore.Jmodifierfinal.domain.Ferrari;

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
