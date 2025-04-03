package academy.devdojo.maratonajava.javacore.Gassociation.teste;

import academy.devdojo.maratonajava.javacore.Gassociation.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociation.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Jiraya Sensei");
        Professor professor1 = new Professor("Kakashi Sensei");
        Professor[] professores = {professor, professor1};
        Escola escola = new Escola("Konoha", professores);
        escola.imprime();
    }
}
