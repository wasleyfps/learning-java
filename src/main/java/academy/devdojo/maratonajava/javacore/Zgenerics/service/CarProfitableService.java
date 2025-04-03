package academy.devdojo.maratonajava.javacore.Zgenerics.service;

import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class CarProfitableService {
    private List<Car> carAvailable = new ArrayList<>(
            List.of(new Car("BMW"), new Car("Mercedes")));
    
    public Car searchCarAvaiable(){
        System.out.println("BMW");
        Car car = carAvailable.remove(0);
        System.out.println("Renting Car");
        System.out.println("Car Avaiable for rent: ");
        System.out.println(carAvailable);
        return car;
    }   
    
    public void retornarCarRented(Car car){
        System.out.println("Returning the Car: " + car);
        carAvailable.add(car);
        System.out.println("Car Avaiable for Rent: ");
        System.out.println(carAvailable);
    }
}
