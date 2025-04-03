package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais5 {
    public static void main(String[] args) {
        // Imprima o dia da semana, considerando 1 como domingo;
        byte day = 10;
        
        switch (day){
            // char, int, byte, short, enum, String
            case 1:
                System.out.println("Domingo"); 
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia não Encontrado");
        } 
        
        char sex = 'M';
        
        switch (sex) {
            case 'M':
                System.out.println("Homem");
                break;
            case 'F':
                System.out.println("Mulher");
                break;
            default:
                System.out.println("Sexo Inválido");
        }
    }
}
