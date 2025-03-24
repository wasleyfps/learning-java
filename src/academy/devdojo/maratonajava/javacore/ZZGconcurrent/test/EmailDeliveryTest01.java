package academy.devdojo.maratonajava.javacore.ZZGconcurrent.test;



import academy.devdojo.maratonajava.javacore.ZZGconcurrent.domain.Members;
import academy.devdojo.maratonajava.javacore.ZZGconcurrent.service.EmailDeliveryService;

import javax.swing.*;

public class EmailDeliveryTest01 {
    public static void main(String[] args) {
        Members members = new Members();
        Thread saitama = new Thread(new EmailDeliveryService(members), "Saitama");
        Thread naruto = new Thread(new EmailDeliveryService(members), "Naruto");
        
        saitama.start();
        naruto.start();
        
        while(true){
            String email = JOptionPane.showInputDialog("Enter email address");
            if (email == null || email.isEmpty()) {
                members.close();
                break;
            }
            members.addMemberEmail(email);
        }
    }
}
