package academy.devdojo.maratonajava.javacore.ZZBehavior.interfaces;

import academy.devdojo.maratonajava.javacore.ZZBehavior.domain.Car;

@FunctionalInterface
public interface CarPredicate {
    // Anonymous, functions, concise
    boolean test(Car car);
    // Parameters -> <expression>
    // (Car car) -> car.getColor().equals("Green");
}


