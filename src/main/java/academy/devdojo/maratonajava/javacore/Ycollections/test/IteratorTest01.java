package academy.devdojo.maratonajava.javacore.Ycollections.test;

import academy.devdojo.maratonajava.javacore.Ycollections.domain.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new LinkedList<>();
        mangas.add(new Manga(5L,"Attack on Titan", 19.9,0));
        mangas.add(new Manga(1L,"Berserk",9.5,5));
        mangas.add(new Manga(4L,"Saitama",11.20,10));
        mangas.add(new Manga(2L,"Pokemon",2.99,3));
        mangas.add(new Manga(3L,"Solo Leveling",5.20,7));
        
//        Iterator<Manga> mangaIterator = mangas.iterator();
//        while (mangaIterator.hasNext()) {
//            Manga manga = mangaIterator.next();
//            if(manga.getQuantity() == 0) {
//                mangaIterator.remove();
//            }
//        }
        
        mangas.removeIf(manga -> manga.getQuantity() == 0);
        System.out.println(mangas);
    }
}
