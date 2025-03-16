package academy.devdojo.maratonajava.javacore.ZZCLambdas.test;

import academy.devdojo.maratonajava.javacore.ZZCLambdas.domain.Anime;
import academy.devdojo.maratonajava.javacore.ZZCLambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 20), new Anime("One Piece", 500), new Anime("Solo Leveling", 40)));
        //Collections.sort(animeList, (a1,a2) -> a1.getTitle().compareTo(a2.getTitle()));
        //Collections.sort(animeList,(a1, a2) -> AnimeComparators.compareByTitle(a1, a2));
        //Collections.sort(animeList, AnimeComparators::compareByTitle);
        Collections.sort(animeList, AnimeComparators::compareByEpisode);
        for (Anime anime : animeList) {
            System.out.println(anime);
        }
    }
}
