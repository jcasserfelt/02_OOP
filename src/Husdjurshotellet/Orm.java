package Husdjurshotellet;

import javax.swing.*;

public class Orm extends Reptil {

    public Orm() {
        matVanor = DjurFoder.ormpellets;
        Djur.djurlista.add(this);
    }

    public Orm(String _namn, int _vikt) {
        this.namn = _namn;
        this.vikt = _vikt;
        matVanor = DjurFoder.ormpellets;
        Djur.djurlista.add(this);
    }

    @Override
    public int getFoodInGrams() {
        return 20;
    }

    @Override
    public void showFoodMessage() {
        String message = this.getName() + " ska få sig " + this.getFoodInGrams() + "g " + this.matVanor;
        JOptionPane.showMessageDialog(null, message);
    }

    public String getName() {
        return this.namn;
    }

    public double getVikt() {
        return this.vikt;
    }
}