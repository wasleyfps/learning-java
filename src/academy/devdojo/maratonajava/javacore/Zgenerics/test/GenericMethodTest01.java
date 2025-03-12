package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Boat;

import java.util.List;

public class GenericMethodTest01 {
    public static void main(String[] args) {
        createArrayObject(new Boat("Speedboat"));        
    }
    
//    private static <T> void createArrayObject(T t){
//        List<T> list = List.of(t);
//        System.out.println(list);
//    }

    private static <T extends Comparable<T>> List<T> createArrayObject(T t){
        return List.of(t);
    }
}



