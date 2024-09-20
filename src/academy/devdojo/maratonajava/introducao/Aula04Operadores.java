package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        int numero02 = 20;

        double resultado = (double) numero01 / numero02;

        System.out.println(resultado);

        // %

        int resto = 20 % 7;

        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;

        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte" + isDezIgualVinte);
        System.out.println("isDezIgualDez" + isDezIgualDez);
        System.out.println("isDezDiferenteDez " + isDezDiferenteDez);

        // && (AND)

        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorqueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorqueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorqueTrinta " + isDentroDaLeiMaiorqueTrinta);
        System.out.println("isDentroDaLeiMenorqueTrinta " + isDentroDaLeiMenorqueTrinta);

        // || (OR)

        double contaCorrente = 200;
        double contaPoupanca = 10000;
        float valorPlaystation = 5000F;

        boolean isPlaystationCincoCompravel = contaCorrente > valorPlaystation || contaPoupanca > valorPlaystation;

        if (isPlaystationCincoCompravel == true) {
            System.out.println("Playstation Comprável");
        } else {
            System.out.println("Não Consigo Comprar");
        }
        
        
        // = += -= *= /= %=
        double bonus = 1800;
        bonus = bonus + 1000;
        bonus = bonus - 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);
        
        
        // ++ --
        int contador = 0;
        contador += 1; // contador = contador + 1;
        contador++; // +1
        contador--; // -1
        ++contador; // +1
        --contador; // -1
        
        int contador2 = 0;
        System.out.println(++contador2);
    }
}
