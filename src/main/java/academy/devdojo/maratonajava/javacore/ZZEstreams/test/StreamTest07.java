package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

public class StreamTest07 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5);

        integers.stream().reduce((x, y) -> x + y).ifPresent(System.out::println);
        System.out.println(integers.stream().reduce((x, y) -> x + y));
        integers.stream().reduce(Integer::sum).ifPresent(System.out::println);
        System.out.println(integers.stream().reduce(0, Integer::sum));
    }
}
