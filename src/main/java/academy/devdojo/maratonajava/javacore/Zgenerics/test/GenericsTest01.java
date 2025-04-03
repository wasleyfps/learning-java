package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Ycollections.domain.Consumer;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add("Saitama");
        list.add(123L);
        list.add(new Consumer(1L,"Wasley Carvalho"));
        
        for (Object o : list) {
            System.out.println(o);
        }
        add(list, new Consumer(2L,"Wasley Carvalho"));

        for (Object o : list) {
            System.out.println(o);
        }
    }
    private static void add(List list, Consumer consumer) {
        list.add(consumer);
    }
}
