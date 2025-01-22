package academy.devdojo.maratonajava.javacore.Bintroductionmethods.test;

import academy.devdojo.maratonajava.javacore.Bintroductionmethods.dominio.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        
        estudante01.nome = "Midoryia";
        estudante01.idade = 15;
        estudante01.sexo = 'M';
        
        estudante01.imprime();
    }
}
