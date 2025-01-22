package academy.devdojo.maratonajava.javacore.Dconstructor.test;


import academy.devdojo.maratonajava.javacore.Dconstructor.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One Punch Man 2", "TV", 12, "Ação", "Production I.G");
        
        anime.imprime();
        //anime.init("One Punch Man 2", "TV", 12, "Ação");
    }
}
