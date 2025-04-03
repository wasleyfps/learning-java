package academy.devdojo.maratonajava.javacore.Aintroductionclass.test;

import academy.devdojo.maratonajava.javacore.Aintroductionclass.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();
        
        carro.nome = "Fusca";
        carro.modelo = "Sedan";
        carro.ano = 1969;
        
        carro2.nome = "Tesla";
        carro2.modelo = "Model S";
        carro2.ano = 2022;
        
        
        System.out.println(carro.nome + " " + carro.modelo + " " + carro.ano);
        System.out.println(carro2.nome + " " + carro2.modelo + " " + carro2.ano);
    }
}
