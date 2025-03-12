package academy.devdojo.maratonajava.javacore.Zgenerics.service;

import java.util.List;

public class RentalService<T> {
    private List<T> objectsAvailable;
    
    public RentalService(List<T> objectsAvailable) {
        this.objectsAvailable = objectsAvailable;
    }

    public T searchObjectAvaiable(){
        T t = objectsAvailable.remove(0);
        System.out.println("Renting Object");
        System.out.println("Object Avaiable for rent: ");
        System.out.println(objectsAvailable);
        return t;
    }

    public void retornarObjectRented(T t){
        System.out.println("Returning the Object: " + t);
        objectsAvailable.add(t);
        System.out.println("Object Avaiable for Rent: ");
        System.out.println(objectsAvailable);
    }
}
