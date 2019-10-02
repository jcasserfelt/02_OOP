package Husdjurshotellet;

import javax.swing.*;

public class Orm extends Reptil {

    // Constructor
    public Orm() {
        matVanor = DjurFoder.ormpellets;
        Djur.djurlista.add(this);
    }

    // Constructor with parameters
    Orm(String _namn, int _vikt) {
        super(_namn, _vikt);
        matVanor = DjurFoder.ormpellets;
        Djur.djurlista.add(this);
    }

    // Method from Interface ICalcFood
    @Override
    public int getFoodInGrams() {
        return 20;
    } // Orm always get 20 grams

    // Method from Interface ICalcFood
    @Override
    public void showFoodMessage() {
        String message = this.getNamn() + " ska få sig " + this.getFoodInGrams() + "g " + this.matVanor;
        JOptionPane.showMessageDialog(null, message);
    }
}