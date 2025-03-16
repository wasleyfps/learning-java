package academy.devdojo.maratonajava.javacore.ZZBbehavior.test;

import academy.devdojo.maratonajava.javacore.ZZBbehavior.domain.Car;
import academy.devdojo.maratonajava.javacore.ZZBbehavior.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;

public class BehaviorforParametersTest02 {
    private static List<Car> cars = List.of(
            new Car(2011, "green"),
            new Car(1998, "black"),
            new Car(2025, "black"),
            new Car(2019, "red")
    );
    
    public static void main(String[] args) {
//        List<Car> greenCars = filter(cars, new CarPredicate() {
//            @Override
//            public boolean test(Car car) {
//                return car.getColor().equals("red");
//            }
//        });
//        System.out.println("greenCars = " + greenCars);

        List<Car> greenCars = filter(cars, car -> car.getColor().equals("black"));
        List<Car> yearCars = filter(cars, car -> car.getYear() < 2022);
        System.out.println("greenCars = " + greenCars);
        System.out.println("yearCars = " + yearCars);
    }
    
    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate) {
        List<Car> filteredCars = new ArrayList<>();
        for (Car car : cars) {
            if (carPredicate.test(car)) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }
    
    
}
