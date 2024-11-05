package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario;

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

        double mediaSalarial = 0;
        for (double salario : salarios) {
            mediaSalarial += salario;
        }
        mediaSalarial /= salarios.length;
        System.out.println("\nMédia Salarial: " + mediaSalarial);
    }
}
