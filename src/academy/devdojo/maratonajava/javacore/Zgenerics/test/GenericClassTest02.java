package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Boat;
import academy.devdojo.maratonajava.javacore.Zgenerics.service.BoatProfitableService;

public class GenericClassTest02 {
    public static void main(String[] args) {
        BoatProfitableService boatProfitableService = new BoatProfitableService();
        Boat boat = boatProfitableService.searchBoatAvaiable();
        System.out.println("Using the boat for one moth....");
        boatProfitableService.retornarBoatRented(boat);
        
    }
}
