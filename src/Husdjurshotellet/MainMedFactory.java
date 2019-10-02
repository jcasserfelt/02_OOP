package Husdjurshotellet;

import javax.swing.*;

public class MainMedFactory {
    public static void main(String[] args) {

        // Create five nice animals with factory
        DjurFactory.skapaDjur("Hund", "Sixten", 5);
        DjurFactory.skapaDjur("Hund", "Dogge", 10);
        DjurFactory.skapaDjur("katt", "Venus", 5);
        DjurFactory.skapaDjur("katt", "Ove", 3);
        DjurFactory.skapaDjur("orm", "Hypno", 1);

        // Ask user for a animal name
        // Then iterate through the animal list and performe actions if input matches with a animal name
        while (true) {
            String input = JOptionPane.showInputDialog(null, "Vilket djur ska få mat?");
            if (input == null) break;
            for (Djur djur : Djur.djurlista) {
                if (input.equalsIgnoreCase(djur.getNamn())) {
                    djur.showFoodMessage();
                }
            }
        }
    }
}