package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminary;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Student;

public class AssociationTest {
    public static void main(String[] args) {
        Local local = new Local("Rua Santos Dumont");
        Student student = new Student("Wasley Carvalho", 27);
        Professor professor = new Professor("Yoda", "Usar a força para programar");
        Student[] studentsForSeminary = {student};
        Seminary seminary = new Seminary("Como ser um baita programador", studentsForSeminary, local);
        
        Seminary[] seminariesAvailable = {seminary};
        
        professor.setSeminaries(seminariesAvailable);
        
        professor.imprime();
        
    }
}
