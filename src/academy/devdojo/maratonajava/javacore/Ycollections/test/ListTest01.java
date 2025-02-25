package academy.devdojo.maratonajava.javacore.Ycollections.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(16);
        List<String> names2 = new ArrayList<>(16);
        names.add("Wasley");
        names.add("Carvalho");
        names.remove("Carvalho"); // 
//        names.remove(1); // Remove por posição do array nesse caso o "Carvalho"
        
        names2.add("Saitama");
        names2.add("Naruto");
        names.addAll(names2);
        
        
        for (String name:names) {
            System.out.println(name);            
        }
        names.add("Oliveira");
        System.out.println("---------------");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        // As duas formas você pode trabalhar com as listas
        System.out.println(names);
        
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        System.out.println(numbers);
        

        
    }
}
