package academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.domain;

import java.util.HashSet;
import java.util.Set;

public class AircraftSingletonLazy {
    private static AircraftSingletonLazy INSTANCE;
    private final Set<String> avaiableSeats = new HashSet<>();
    private final String name;

    private AircraftSingletonLazy(String name) {
        this.name = name;
    }
    
    public static AircraftSingletonLazy getINSTANCE() {
        if (INSTANCE == null) {
            synchronized (AircraftSingletonLazy.class) {
                if (INSTANCE == null) {
                    INSTANCE = new AircraftSingletonLazy("787-900");
                }
            }
        }
        return INSTANCE;
    }

    {
        avaiableSeats.add("1A");
        avaiableSeats.add("1B");
    }
    
    public boolean bookSeat(String seat){
        return avaiableSeats.remove(seat);
    }
}
