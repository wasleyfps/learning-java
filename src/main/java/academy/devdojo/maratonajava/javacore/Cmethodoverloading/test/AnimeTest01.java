package academy.devdojo.maratonajava.javacore.Cmethodoverloading.test;

import academy.devdojo.maratonajava.javacore.Cmethodoverloading.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        
        anime.init("One Punch Man 2", "TV", 12, "Ação");
        anime.imprime();
    }
}
