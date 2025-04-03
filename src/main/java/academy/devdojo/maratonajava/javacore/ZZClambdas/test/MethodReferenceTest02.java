package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.domain.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest02 {
    // Reference to an instance method of a particular object
    public static void main(String[] args) {
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 20), new Anime("One Piece", 500), new Anime("Solo Leveling", 40)));
        // animeList.sort((a1,a2) -> animeComparators.compareByEpisodeNonStatic(a1,a2));
        animeList.sort(animeComparators::compareByEpisodeNonStatic);
        System.out.println(animeList);
    }
}
