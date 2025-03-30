package academy.devdojo.maratonajava.javacore.ZZHdesignpatterns.domain;

import java.util.HashSet;
import java.util.Set;

public enum AircraftSingletonEnum {
    INSTANCE;

    private final Set<String> avaiableSeats;

    AircraftSingletonEnum() {
        this.avaiableSeats = new HashSet<>();
        this.avaiableSeats.add("1A");
        this.avaiableSeats.add("1B");
    }

    public boolean bookSeat(String seat){
        return avaiableSeats.remove(seat);
    }
}
