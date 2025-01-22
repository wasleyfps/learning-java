package academy.devdojo.maratonajava.javacore.Gassociation.teste;

import academy.devdojo.maratonajava.javacore.Gassociation.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Romário");
        Jogador jogador3 = new Jogador("Cafu");

        Jogador[] jogadores = {jogador1, jogador2, jogador3};

        for (Jogador jogador : jogadores) {
            System.out.println(jogador.getNome());
        }
    }
}
