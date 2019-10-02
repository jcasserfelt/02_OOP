package Husdjurshotellet;

import javax.swing.*;

public class Katt extends DäggDjur {

    // Constructor
    public Katt() {
        matVanor = DjurFoder.kattfoder;     // set to cat food // #Enums
        Djur.djurlista.add(this);           // add to the animal list
    }

    // Constructor with parameters
    public Katt(String _namn, int _vikt) {
        super(_namn, _vikt);
        matVanor = DjurFoder.kattfoder; // #Enums
        Djur.djurlista.add(this);
    }

    // Method from Interface ICalcFood
    // #Polymorfism
    @Override
    public int getFoodInGrams() {
        int foodCalcNumeratorKatt = 150;
        return this.getVikt() * 1000 / foodCalcNumeratorKatt;
    }

    // Method from Interface ICalcFood
    // #Polymorfism
    @Override
    public void showFoodMessage() {
        String message = this.getNamn() + " ska få sig " + this.getFoodInGrams() + "g " + this.matVanor;
        JOptionPane.showMessageDialog(null, message);
    }
}
