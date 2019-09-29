package Husdjurshotellet;

public class Katt extends DäggDjur {

    public Katt() {
    }

    public Katt(String _namn, double _vikt) {
        this.namn = _namn;
        this.vikt = _vikt;
        matVanor = DjurFoder.kattfoder;
    }

    @Override
    public double getFoodInGrams() {
        return this.vikt * 1000 / 150;
    }

    public String getName() {
        return this.namn;
    }

    public double getVikt() {
        return this.vikt;
    }



}
