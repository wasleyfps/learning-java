package academy.devdojo.maratonajava.javacore.Fstaticmodifier.test;

import academy.devdojo.maratonajava.javacore.Fstaticmodifier.dominio.Carro;

public class CarroTeste01 {
    
    public static void main(String[] args) {
        // Modificadores de Acesso Estático, vai fazer o atributo agora pertencer à classe e todos os objetos vão compartilhar de mesmo valor
        Carro.setVelocidadeLimite(180);

        Carro carro1 = new Carro("BMW", 280);
        Carro carro2 = new Carro("Audi", 275);
        Carro carro3 = new Carro("Mercedes", 290);


        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
        
    }

}
