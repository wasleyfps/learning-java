package academy.devdojo.maratonajava.javacore.Aintroductionclass.test;

import academy.devdojo.maratonajava.javacore.Aintroductionclass.dominio.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();
        
        estudante.nome = "Midoryia";
        estudante2.nome = "Bakugou";
        
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println("----------------------");
        System.out.println(estudante2.nome);
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);
    }
}
