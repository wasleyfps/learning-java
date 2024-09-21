package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // Quero os números pares de 0 á 1.000,000
        
        
        // Duas Formas de ser feita
        for(int i = 0; i <= 1000000 ; i++){
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
        
//        for(int i = 0; i<= 1000000; i+=2){
//            System.out.println(i);
//        }
        
    }
}
