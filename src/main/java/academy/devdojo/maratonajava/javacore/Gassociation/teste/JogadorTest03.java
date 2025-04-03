package academy.devdojo.maratonajava.javacore.Gassociation.teste;

import academy.devdojo.maratonajava.javacore.Gassociation.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociation.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("Pelé");
        Time time = new Time("Seleção Brasileira");
        Jogador[] jogadores = {jogador, jogador2};
        
        jogador.setTime(time);
        jogador2.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("---- Jogador ----");
        jogador.imprime();
        jogador2.imprime();
        
        System.out.println("---- Time ----");
        time.imprime();
    }
}
