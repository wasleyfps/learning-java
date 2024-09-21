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
        }
        
    }
}
