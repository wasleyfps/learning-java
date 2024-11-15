package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salario;
    private double mediaSalarial = 0;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salario == null) {
            System.out.println("Nenhum salário informado");
            return;
        }
        for (double salario : this.salario) {
            System.out.print(salario + " ");
        }
        imprimeMediaSalarial(salario);
    }

    public void imprimeMediaSalarial(double... salarios) {
        if (salario == null) {
            System.out.println("Nenhum salário informado");
            return;
        }
       
        for (double salario : salarios) {
            mediaSalarial += salario;
        }
        mediaSalarial /= salarios.length;
        System.out.println("\nMédia Salarial: " + mediaSalarial);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public double getMediaSalarial() {
        return mediaSalarial;
    }
    
}
