package academy.devdojo.maratonajava.javacore.ZZDoptional.test;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Estamos em aprendizado");
        Optional<String> optional2 = Optional.ofNullable(null);
        Optional<String> optional3 = Optional.empty();
        System.out.println(optional);
        System.out.println(optional2);
        System.out.println(optional3);
        System.out.println("---------");

        Optional<String> nameOptional = Optional.ofNullable(findName("Wasley"));
        String empty = nameOptional.orElse("Empty");
        System.out.println(empty);
//        nameOptional.ifPresent(System.out::println);
        nameOptional.ifPresent(s -> System.out.println(s.toUpperCase()));
    }

    private static String findName(String name) {
        List<String> list = List.of("Wasley", "Carvalho");
        int i = list.indexOf(name);
        if (i != -1) {
            return list.get(i);
        }
        return null;
    }
}
