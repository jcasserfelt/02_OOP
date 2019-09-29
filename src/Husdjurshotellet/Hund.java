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
        int foodCalcNumeratorHund = 100;
        return this.getVikt() * 1000 / foodCalcNumeratorHund;
    }

    @Override
    public void showFoodMessage() {
        String message = this.getNamn() + " ska få sig " + this.getFoodInGrams() + "g " + this.getMatVanor();
        JOptionPane.showMessageDialog(null, message);
    }
}

