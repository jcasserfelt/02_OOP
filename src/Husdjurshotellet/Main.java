package Husdjurshotellet;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        // Create five nice animals
        Hund sixten = new Hund("Sixten", 5);
        Hund dogge = new Hund("Dogge", 10);
        Katt venus = new Katt("Venus", 5);
        Katt ove = new Katt("Ove", 3);
        Orm hypno = new Orm("Hypno", 1);

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
