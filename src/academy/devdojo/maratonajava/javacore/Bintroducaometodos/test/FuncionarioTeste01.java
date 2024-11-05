package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

import java.security.PublicKey;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        
        funcionario.nome = "Wasley";
        funcionario.idade = 26;
        funcionario.salario = new double[]{1500, 987.32, 2000};
        
        funcionario.imprime();
    }
    
}
