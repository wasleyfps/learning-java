package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 18;
        
        boolean autorizado = idade >= 18;
        
        if(autorizado){
            System.out.println("Autorizado a comprar bebida alcólica ");
        } 
        
        // Utilizando negação 
        if(!autorizado) {
            System.out.println("Não autorizado a comprar bebida alcólica ");
        }
        
    }
}
