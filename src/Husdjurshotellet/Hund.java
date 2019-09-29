package Husdjurshotellet;

import javax.swing.*;

public class Hund extends DäggDjur {

    public Hund() {
        matVanor = DjurFoder.hundfoder;
        Djur.djurlista.add(this);
    }

    public Hund(String _namn, int _vikt) {
        super(_namn, _vikt);
        matVanor = DjurFoder.hundfoder;
        Djur.djurlista.add(this);
    }

    @Override
    public int getFoodInGrams() {
        return this.getVikt() * 1000 / 100;
    }

    @Override
    public void showFoodMessage() {
        String message = this.getNamn() + " ska få sig " + this.getFoodInGrams() + "g " + this.matVanor;
        JOptionPane.showMessageDialog(null, message);
    }
}

