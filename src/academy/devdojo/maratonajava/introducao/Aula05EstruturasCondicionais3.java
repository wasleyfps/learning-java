package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais3 {
    public static void main(String[] args) {
        // Doar se Salário > 5000;
        double salario = 3000;
        String mensagemDoar = "Eu fazer uma doação!";
        String mensagemNaoDoar = "Não tenho condições no momento";
        //String resultado;
        
        // Ternário (condição) ? Verdadeiro : Falso;
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        //String resultado = salario > 5000 ? "Eu fazer uma doação!" : "Não tenho condições no momento";
        
//        if (salario > 5000) {
//            resultado = mensagemDoar;
//        } else {
//            resultado = mensagemNaoDoar;
//        }
        System.out.println(resultado);
    }
}
