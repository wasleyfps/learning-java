package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.domain.Client;
import academy.devdojo.maratonajava.javacore.Kenum.domain.TypeClient;
import academy.devdojo.maratonajava.javacore.Kenum.domain.TypePayment;


public class ClientTest {
    public static void main(String[] args) {
        Client client = new Client("Wasley Carvalho", TypeClient.NATURAL_PERSON, TypePayment.CREDIT);
        Client client1 = new Client("Saitama", TypeClient.LEGAL_PERSON, TypePayment.DEBIT);

        System.out.println(client);
        System.out.println(client1);
        System.out.println(TypePayment.DEBIT.calculateDiscount(100));
        System.out.println(TypePayment.CREDIT.calculateDiscount(100));
        TypeClient typeClient = TypeClient.valueOf("NATURAL_PERSON");
        System.out.println(typeClient.getNameReport());
        TypeClient typeClient2 = TypeClient.typeClientForNameReport("Natural Person");
        System.out.println(typeClient2);
    }
}
