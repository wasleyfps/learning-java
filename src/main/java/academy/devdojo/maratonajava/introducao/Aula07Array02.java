package academy.devdojo.maratonajava.introducao;

public class Aula07Array02 {
    public static void main(String[] args) {
        // byte, short, int, long, float e double = 0 (Padrão)
        // char '\u0000' ' ' (Padrão)
        // boolean flase  (Padrão)
        // String null  (Padrão)
//        int[] idades = new int[3];
//        System.out.println(idades[0]);
//        System.out.println(idades[1]);
//        System.out.println(idades[2]);
//        
        
        String[] names = new String[4];
        
        names[0] = "Jesus";
        names[1] = "Luffy";
        names[2] = "Wasley";
        names[3] = "Saitama";
        
        for(int i = 0; i < names.length ; i++) {
            System.out.println(names[i]);
        }
        
        // A variável de cima morre, estou criando outro objeto na memória. Será substuida por uma novo array. Garbage Collector
        names = new String[3];
        
    }
}
