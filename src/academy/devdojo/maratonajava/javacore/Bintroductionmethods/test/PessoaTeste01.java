package academy.devdojo.maratonajava.javacore.Bintroductionmethods.test;

import academy.devdojo.maratonajava.javacore.Bintroductionmethods.dominio.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Jiraya");
        pessoa.setIdade(70);
        pessoa.imprime();
        
        // Pegando o nome da pessoa
        System.out.println(pessoa.getNome());
        // Pegando a idade da pessoa
        System.out.println(pessoa.getIdade());
    }
}
