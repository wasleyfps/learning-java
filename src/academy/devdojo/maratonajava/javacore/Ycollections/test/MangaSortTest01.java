package academy.devdojo.maratonajava.javacore.Ycollections.test;

import academy.devdojo.maratonajava.javacore.Ycollections.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(5L,"Attack on Titan", 19.9));
        mangas.add(new Manga(1L,"Berserk",9.5));
        mangas.add(new Manga(4L,"Saitama",11.20));
        mangas.add(new Manga(2L,"Pokemon",2.99));
        mangas.add(new Manga(3L,"Solo Leveling",5.20));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        Collections.sort(mangas);
        System.out.println("----------------------------");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

//        Collections.sort(mangas, new MangaByIdComparator());
        mangas.sort(new MangaByIdComparator());
        System.out.println("----------------------------");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
