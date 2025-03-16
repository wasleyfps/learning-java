package academy.devdojo.maratonajava.javacore.ZZDoptional.test;

import academy.devdojo.maratonajava.javacore.ZZDoptional.domain.Manga;
import academy.devdojo.maratonajava.javacore.ZZDoptional.repository.MangaRepository;

import java.util.List;
import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        Optional<Manga> bokuNoHero = MangaRepository.findByTitle("Boku no Hero");
        bokuNoHero.ifPresent(manga -> manga.setTitle("Boku no Hero 2"));;
        System.out.println(bokuNoHero);
        
        Manga mangaById = MangaRepository.findById(2).orElseThrow(IllegalArgumentException::new);
        System.out.println(mangaById);
        
        Manga manga = MangaRepository.findByTitle("Saitama")
                .orElseGet(() -> new Manga(3, "Saitama", 25));
        System.out.println(manga);
    }
}
