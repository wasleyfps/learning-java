package academy.devdojo.maratonajava.javacore.Ycollections.test;

import academy.devdojo.maratonajava.javacore.Ycollections.domain.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaPriceComparator().reversed());
        mangas.add(new Manga(5L,"Attack on Titan",19.9,0));
        mangas.add(new Manga(1L,"Berserk",9.5,5));
        mangas.add(new Manga(4L,"Saitama",11.20,10));
        mangas.add(new Manga(2L,"Pokemon",2.99,3));
        mangas.add(new Manga(3L,"Solo Leveling",5.20,7));
        
        while (!mangas.isEmpty()){
            System.out.println(mangas.poll());
        }
    }
}
