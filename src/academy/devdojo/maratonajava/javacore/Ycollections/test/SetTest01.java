package academy.devdojo.maratonajava.javacore.Ycollections.test;

import academy.devdojo.maratonajava.javacore.Ycollections.domain.Manga;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new LinkedHashSet<>();
        // Set -> Not permited items duplicated 
        mangas.add(new Manga(5L,"Attack on Titan", 19.9,0));
        mangas.add(new Manga(1L,"Berserk",9.5,5));
        mangas.add(new Manga(4L,"Saitama",11.20,10));
        mangas.add(new Manga(2L,"Pokemon",2.99,3));
        mangas.add(new Manga(3L,"Solo Leveling",5.20,7));
        mangas.add(new Manga(3L,"Solo Leveling",5.20,7));
        
        for (Manga manga : mangas) {
            System.out.println(manga.toString());
        }
    }
}
