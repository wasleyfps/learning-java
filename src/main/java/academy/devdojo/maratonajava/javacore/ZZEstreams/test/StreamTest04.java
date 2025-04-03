package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> wasley = new ArrayList<>();
        List<String> graphicDesigners = List.of("Fernanda", "Katarina", "Castiel");
        List<String> developers = List.of("Mateus", "Jhonathan", "Wasley");
        List<String> students = List.of("Julio", "Bruno", "José","Eric");
        wasley.add(graphicDesigners);
        wasley.add(developers);
        wasley.add(students);
        
        for (List<String> peoples : wasley) {
            for (String people : peoples) {
                System.out.println(people);
            }
        }
        System.out.println("------------");
        
        Stream<List<String>> stream = wasley.stream();
        wasley.stream().flatMap(Collection::stream).forEach(System.out::println);
        
    }
}
