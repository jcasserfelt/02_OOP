package Husdjurshotellet;

import javax.swing.*;

public class Hund extends DäggDjur {

    // Constructor
    public Hund() {
        matVanor = DjurFoder.hundfoder;     // set to dogfood
        Djur.djurlista.add(this);           // add to the animal list
    }

    // Constructor with parameters
    public Hund(String _namn, int _vikt) {
        super(_namn, _vikt);
        matVanor = DjurFoder.hundfoder;
        Djur.djurlista.add(this);
    }

    // Method from Interface ICalcFood
    @Override
    public int getFoodInGrams() {
        int foodCalcNumeratorHund = 100;
        return this.getVikt() * 1000 / foodCalcNumeratorHund;
    }

    // Method from Interface ICalcFood
    @Override
    public void showFoodMessage() {
        String message = this.getNamn() + " ska få sig " + this.getFoodInGrams() + "g " + this.getMatVanor();
        JOptionPane.showMessageDialog(null, message);
    }
}