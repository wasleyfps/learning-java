package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Girafales";
        professor.idade = 60;
        professor.sexo = 'M';
        
        System.out.println(professor.nome + " " + professor.idade + " " + professor.sexo);
    }
}
