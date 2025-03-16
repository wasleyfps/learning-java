package academy.devdojo.maratonajava.javacore.ZZBbehavior.test;

import academy.devdojo.maratonajava.javacore.ZZBbehavior.domain.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class BehaviorforParametersTest03 {
    private static List<Car> cars = List.of(
            new Car(2011, "green"),
            new Car(1998, "black"),
            new Car(2025, "black"),
            new Car(2019, "red")
    );
    
    public static void main(String[] args) {
        List<Car> greenCars = filter(cars, car -> car.getColor().equals("black"));
        List<Car> yearCars = filter(cars, car -> car.getYear() < 2022);
        System.out.println("greenCars = " + greenCars);
        System.out.println("yearCars = " + yearCars);
        
        List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println(filter(nums, num -> num % 2 == 0));
    }
    
    private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
//        return list.stream().filter(predicate).collect(Collectors.toList());
        List<T> filteredList = new ArrayList<>();
        for (T e : list) {
            if (predicate.test(e)) {
                filteredList.add(e);
            }
        }
        return filteredList;
    }
    
    
}
