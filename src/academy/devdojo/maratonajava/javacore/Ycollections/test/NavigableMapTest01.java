package academy.devdojo.maratonajava.javacore.Ycollections.test;

import academy.devdojo.maratonajava.javacore.Ycollections.domain.Consumer;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {
        Consumer consumer1 = new Consumer(1L,"Wasley Carvalho");
        NavigableMap<String, Consumer> map = new TreeMap<>();
        map.put("A", consumer1);
//        map.put("D", "Letra D");
//        map.put("B", "Letra B");
//        map.put("E", "Letra E");
//        map.put("C", "Letra C");
        for (Map.Entry<String, Consumer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        
        
    }
}
