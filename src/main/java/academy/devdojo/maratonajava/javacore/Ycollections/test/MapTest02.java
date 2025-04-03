package academy.devdojo.maratonajava.javacore.Ycollections.test;

import academy.devdojo.maratonajava.javacore.Ycollections.domain.Consumer;
import academy.devdojo.maratonajava.javacore.Ycollections.domain.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumer consumer1 = new Consumer(1L,"Wasley Carvalho");
        Consumer consumer2 = new Consumer(2L,"Saitama");

        Manga manga1 = new Manga(5L,"Attack on Titan", 19.9);
        Manga manga2 = new Manga(1L,"Berserk",9.5);
        Manga manga3 = new Manga(4L,"Saitama",11.20);
        Manga manga4 = new Manga(2L,"Pokemon",2.99);
        Manga manga5 = new Manga(3L,"Solo Leveling",5.20);
        
        Map<Consumer, Manga> consumerMangaMap = new HashMap<>();
        consumerMangaMap.put(consumer1, manga1);
        consumerMangaMap.put(consumer2, manga4);
        for(Map.Entry<Consumer, Manga> entry : consumerMangaMap.entrySet()){
            System.out.println(entry.getKey().getName() + " - " + entry.getValue().getName());
        };
    }
}
