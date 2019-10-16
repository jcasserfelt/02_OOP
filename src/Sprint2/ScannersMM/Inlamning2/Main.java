package Sprint2.ScannersMM.Inlamning2;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        while (true) {
            String input = JOptionPane.showInputDialog(null, "Ange namn eller personNr");
            if (input == null) break;
            Gym.customerCheckIn(input);
        }


       /* Customer test = new Customer("2","2", LocalDate.MAX);
        System.out.println(test.getPayDate());*/
    }
}
