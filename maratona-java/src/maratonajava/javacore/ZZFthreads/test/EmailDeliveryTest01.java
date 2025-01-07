package maratonajava.javacore.ZZFthreads.test;

import maratonajava.javacore.ZZFthreads.dominio.Members;
import maratonajava.javacore.ZZFthreads.service.EmailDeliveryService;

import javax.swing.*;

public class EmailDeliveryTest01 {
    public static void main(String[] args) {
        Members members = new Members();

        Thread confucio = new Thread(new EmailDeliveryService(members), "Confucio");
        Thread laoTzu = new Thread(new EmailDeliveryService(members), "Lao Tzu");

        confucio.start();
        laoTzu.start();

        while (true) {
            String email = JOptionPane.showInputDialog("Entre com seu email");

            if (email == null || email.isEmpty()) {
                members.close();
                break;
            }

            members.addMemberEmail(email);
        }
    }
}
