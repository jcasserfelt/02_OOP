package Husdjurshotellet;

public class Hund extends DäggDjur {

    public Hund() {
        matVanor = DjurFoder.hundfoder;
        Djur.djurlista.add(this);
    }

    public Hund(String _namn, double _vikt) {
        this.namn = _namn;
        this.vikt = _vikt;
        matVanor = DjurFoder.hundfoder;
        Djur.djurlista.add(this);
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
