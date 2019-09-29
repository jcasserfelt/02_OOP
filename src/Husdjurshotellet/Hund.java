package Husdjurshotellet;

public class Hund extends DäggDjur {

    public Hund() {
    }

    public Hund(String _namn, double _vikt) {
        this.namn = _namn;
        this.vikt = _vikt;
    }

    @Override
    public double getFoodInGrams() {
        return this.vikt * 1000 / 100;
    }

    public String getName() {
        return this.namn;
    }

    public double getVikt() {
        return this.vikt;
    }

}
