package Husdjurshotellet;

import javax.swing.*;

public class Katt extends DäggDjur {

    public Katt() {
        super();
        matVanor = DjurFoder.kattfoder;
        Djur.djurlista.add(this);
    }

    public Katt(String _namn, int _vikt) {
        super(_namn, _vikt);
        matVanor = DjurFoder.kattfoder;
        Djur.djurlista.add(this);
    }

    @Override
    public int getFoodInGrams() {
        int foodCalcNumeratorHund = 150;
        return this.getVikt() * 1000 / foodCalcNumeratorHund;
    }

    @Override
    public void showFoodMessage() {
        String message = this.getNamn() + " ska få sig " + this.getFoodInGrams() + "g " + this.matVanor;
        JOptionPane.showMessageDialog(null, message);
    }
}
