package academy.devdojo.maratonajava.javacore.Ycollections.test;

import academy.devdojo.maratonajava.javacore.Ycollections.domain.Manga;
import academy.devdojo.maratonajava.javacore.Ycollections.domain.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneTestComparator implements Comparator<Smartphone> {
    @Override
    public int compare(Smartphone o1, Smartphone o2){
        return o1.toString().compareTo(o2.toString());
    };
}


public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneTestComparator());
        new Smartphone("123", "Samsung");
//        set.add(new Smartphone("456", "Samsung"));
        System.out.println(set);
        System.out.println("-------------------");
        
        NavigableSet<Manga> mangas = new TreeSet<>();
        mangas.add(new Manga(5L,"Attack on Titan", 19.9,0));
        mangas.add(new Manga(1L,"Berserk",9.5,5));
        mangas.add(new Manga(4L,"Saitama",11.20,10));
        mangas.add(new Manga(2L,"Pokemon",2.99,3));
        mangas.add(new Manga(3L,"Solo Leveling",5.20,7));
        mangas.add(new Manga(3L,"Solo Leveling",5.20,7));
        
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
