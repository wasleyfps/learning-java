package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais4 {
    public static void main(String[] args) {
        // 1a	up to and including € 34712	19.17%
        //1b	€ 36,713 - € 68,507	37.35%
        //2	€ 69,399 or more	49.50%
        
        double salario = 70000;
        
        // Taxas
        double taxa = 9.7;
        double taxa2 = 37.35;
        double taxa3 = 49.50;
        
        if(salario > 0 && salario <= 34712 ) {
            System.out.println("Você vai pagar €"+ (salario * taxa) / 100);
        } else if (salario >= 34713 && salario <= 68507){
            System.out.println("Você vai pagar €"+ (salario * taxa2) / 100); 
        } else {
            System.out.println("Você vai pagar €"+ (salario * taxa3) / 100);
        }
        
    }
}
