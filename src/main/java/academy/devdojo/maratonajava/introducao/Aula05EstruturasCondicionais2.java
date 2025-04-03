package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais2 {
    public static void main(String[] args) {
        // Idade for menor que 15 - Categoria Infantil
        // Idade for maior ou igual a 15 && menor que 18 - Categoria Juvenil
        // Idade for maior ou igual a 18 - Adulto

        int idade = 26;
        String categoria;
        
        if (idade < 15) {
            System.out.println("Categoria Infantil");
        } else if(idade >= 15 && idade < 18) {
            System.out.println("Categoria Juvenil");
        } else {
            System.out.println("Categoria Adulto");
        }
    }
}
