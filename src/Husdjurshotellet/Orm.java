package Husdjurshotellet;

import javax.swing.*;

public class Orm extends Reptil {

    public Orm() {
        matVanor = DjurFoder.ormpellets;
        Djur.djurlista.add(this);
    }

    Orm(String _namn, int _vikt) {
        super(_namn, _vikt);
        matVanor = DjurFoder.ormpellets;
        Djur.djurlista.add(this);
    }

    @Override
    public int getFoodInGrams() {
        return 20;
    }

    @Override
    public void showFoodMessage() {
        String message = this.getNamn() + " ska få sig " + this.getFoodInGrams() + "g " + this.matVanor;
        JOptionPane.showMessageDialog(null, message);
    }
}