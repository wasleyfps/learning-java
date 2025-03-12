package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Car;
import academy.devdojo.maratonajava.javacore.Zgenerics.service.CarProfitableService;

public class GenericClassTest01 {
    public static void main(String[] args) {
        CarProfitableService carProfitableService = new CarProfitableService();
        Car car = carProfitableService.searchCarAvaiable();
        System.out.println("Using the car for one moth....");
        carProfitableService.retornarCarRented(car);
        
    }
}
