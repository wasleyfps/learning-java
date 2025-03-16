package academy.devdojo.maratonajava.javacore.ZZCLambdas.service;

import academy.devdojo.maratonajava.javacore.ZZCLambdas.domain.Anime;

public class AnimeComparators {
    public static int compareByTitle(Anime a1, Anime a2) {
        return a1.getTitle().compareTo(a2.getTitle());
    }
}
