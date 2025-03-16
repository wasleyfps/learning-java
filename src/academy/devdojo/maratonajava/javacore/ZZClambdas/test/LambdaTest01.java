package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    public static void main(String[] args) {
        List<String> strings = List.of("a", "b", "c");
        List<Integer>  integers = Arrays.asList(1, 2, 3);
        List<Double> doubles = Arrays.asList(1.1, 2.2, 3.3);
        
        forEach(strings, (String s) -> System.out.println(s));
        forEach(integers, (Integer i) -> System.out.println(i));
        forEach(doubles, (Double d) -> System.out.println(d));
    }
    private static <T> void forEach(List<T> list, Consumer<T> consumer){
        for (T e: list){
            consumer.accept(e);
        }
    }
}
