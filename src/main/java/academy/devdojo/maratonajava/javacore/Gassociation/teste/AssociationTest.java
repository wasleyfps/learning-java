package academy.devdojo.maratonajava.javacore.Gassociation.teste;

import academy.devdojo.maratonajava.javacore.Gassociation.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociation.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociation.dominio.Seminary;
import academy.devdojo.maratonajava.javacore.Gassociation.dominio.Student;

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
