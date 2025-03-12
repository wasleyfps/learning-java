package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Boat;
import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Car;
import academy.devdojo.maratonajava.javacore.Zgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class GenericClassTest03 {
    public static void main(String[] args) {
        List<Car> carAvaiable = new ArrayList<>(List.of(new Car("BMW"), new Car("Fusca")));
        List<Boat> boatAvaiable = new ArrayList<>(List.of(new Boat("Speedboat"), new Boat("Canoe")));
        RentalService<Car> rentalServiceCar = new RentalService<>(carAvaiable);
        Car car = rentalServiceCar.searchObjectAvaiable();
        System.out.println("Using the car for one month");
        rentalServiceCar.retornarObjectRented(car);

        System.out.println("--------------------");

        RentalService<Boat> rentalServiceBoat = new RentalService<>(boatAvaiable);
        Boat boat = rentalServiceBoat.searchObjectAvaiable();
        System.out.println("Using the boat for one month");
        rentalServiceBoat.retornarObjectRented(boat);
        
    }
}
