package Husdjurshotellet;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Hund sixten = new Hund("Sixten", 5);
        Hund dogge = new Hund("Dogge", 10);
        Katt venus = new Katt("Venus", 5);
        Katt ove = new Katt("Ove", 3);
        Orm hypno = new Orm("Hypno", 1);

        String input = JOptionPane.showInputDialog(null, "Vilket djur ska få mat?");

        for (Djur temp : Djur.djurlista) {
            if (input.equalsIgnoreCase(temp.getNamn())) {
                temp.showFoodMessage();
            }
        }
    }
}