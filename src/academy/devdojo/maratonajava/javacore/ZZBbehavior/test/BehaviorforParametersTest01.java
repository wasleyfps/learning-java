package academy.devdojo.maratonajava.javacore.ZZBbehavior.test;

import academy.devdojo.maratonajava.javacore.ZZBbehavior.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class BehaviorforParametersTest01 {
    private static final List<Car> cars = List.of(
            new Car(2011, "green"),
            new Car(1998, "black"),
            new Car(2025, "black"),
            new Car(2019, "red")
    );
    
    public static void main(String[] args) {
//        System.out.println(filterGreenCar(cars));
//        System.out.println(filterRedCar(cars));
        System.out.println(filterCarByColor(cars, "black"));
        System.out.println(filterCarByColor(cars, "red"));
        System.out.println("----");
        System.out.println(filterByYearBefore(cars, 2015));
    }
    
    private static List<Car> filterGreenCar(List<Car> cars){
        
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars){
            if (car.getColor().equals("green")){
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }

    private static List<Car> filterRedCar(List<Car> cars){

        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars){
            if (car.getColor().equals("red")){
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }

    private static List<Car> filterCarByColor(List<Car> cars , String color){

        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars){
            if (car.getColor().equals(color)){
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }

    private static List<Car> filterByYearBefore(List<Car> cars , int year){

        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars){
            if (car.getYear() < year){
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }
}
