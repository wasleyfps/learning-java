package academy.devdojo.maratonajava.javacore.Ycollections.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Attack on Titan");
        mangas.add("Berserk");
        mangas.add("Saitama");
        mangas.add("Pokemon");
        mangas.add("Solo Leveling");
        
        Collections.sort(mangas);
        
        List<Double> money = new ArrayList<>();
        money.add(100.21);
        money.add(23.98);
        money.add(25.55);
        money.add(98.95);
        
        Collections.sort(money);
        
        for (String manga : mangas){
            System.out.println(manga);
        }

        System.out.println(money);
    }
}
