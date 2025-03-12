package academy.devdojo.maratonajava.javacore.Zgenerics.service;

import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Boat;

import java.util.ArrayList;
import java.util.List;

public class BoatProfitableService {
    private List<Boat> boatAvailable = new ArrayList<>(
            List.of(new Boat("Speedboat"), new Boat("Canoe")));
    
    public Boat searchBoatAvaiable(){
        System.out.println("BMW");
        Boat car = boatAvailable.remove(0);
        System.out.println("Renting Boat");
        System.out.println("Boat Avaiable for rent: ");
        System.out.println(boatAvailable);
        return car;
    }   
    
    public void retornarBoatRented(Boat boat){
        System.out.println("Returning the Boat: " + boat);
        boatAvailable.add(boat);
        System.out.println("Boat Avaiable for Rent: ");
        System.out.println(boatAvailable);
    }
}
