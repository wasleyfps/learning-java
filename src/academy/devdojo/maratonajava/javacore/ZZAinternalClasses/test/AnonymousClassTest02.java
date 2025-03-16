package academy.devdojo.maratonajava.javacore.ZZAinternalClasses.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Boat;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
class BoatNameComparator implements Comparator<Boat>{

    @Override
    public int compare(Boat o1, Boat o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

public class AnonymousClassTest02 {
    public static void main(String[] args) {
        List<Boat> boatList = new ArrayList<>(List.of(new Boat("Canoe"), new Boat("Speedboat")));
        boatList.sort(new Comparator<Boat>(){
            @Override
            public int compare(Boat o1, Boat o2) {
                return o1.getName().compareTo(o2.getName());
            };
    });
        System.out.println(boatList);
    }
}
