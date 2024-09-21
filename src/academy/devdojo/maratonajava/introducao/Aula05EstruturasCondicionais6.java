package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais6 {
    public static void main(String[] args) {
        // Dados os valores de 1 a 7 , Imprima se é dia útil ou final de semana
        // Considerando 1 como domingo
        
        byte day = 6;
        
        switch (day) {
            case 1:
                System.out.println("Domingo - Não é dia útil");
                break;
            case 2:
                System.out.println("Segunda - Dia útil");
                break;
            case 3:
                System.out.println("Terça - Dia útil");
                break;
            case 4:
                System.out.println("Quarta - Dia útil");
                break;
            case 5:
                System.out.println("Quinta - Dia útil");
                break;
            case 6:
                System.out.println("Sexta - Dia útil");
                break;
            case 7:
                System.out.println("Sábado - Não é dia útil");
                break;
            default:
                System.out.println("Opção Inválida");
                break;
        }
        
        byte dia = 5;
        switch (dia) {
            case 1:
            case 7:
                System.out.println("Final de Semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Opção Inválida");
                break;
        }
    }
}
