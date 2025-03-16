package academy.devdojo.maratonajava.javacore.ZZBbehavior.interfaces;

import academy.devdojo.maratonajava.javacore.ZZBbehavior.domain.Car;

@FunctionalInterface
public interface CarPredicate {
    // Anonymous, functions, concise
    boolean test(Car car);
    // Parameters -> <expression>
    // (Car car) -> car.getColor().equals("Green");
}


