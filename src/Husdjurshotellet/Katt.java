package Husdjurshotellet;

import javax.swing.*;

public class Katt extends DäggDjur {

    public Katt() {
        matVanor = DjurFoder.kattfoder;
        Djur.djurlista.add(this);
    }

    public Katt(String _namn, int _vikt) {
        this.namn = _namn;
        this.vikt = _vikt;
        matVanor = DjurFoder.kattfoder;
        Djur.djurlista.add(this);
    }

    @Override
    public int getFoodInGrams() {
        return this.vikt * 1000 / 150;
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
