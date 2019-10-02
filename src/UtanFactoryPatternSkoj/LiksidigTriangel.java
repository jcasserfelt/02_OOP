package UtanFactoryPatternSkoj;

public class LiksidigTriangel extends Figur {
    int sida;
    double hojd = sida * Math.sqrt(sida);


    public LiksidigTriangel() {
    }

    public LiksidigTriangel(int sida) {
        super();
        Figur.figurlista.add(this);
        this.sida = sida;
    }

    @Override
    double area() {
        return sida * sida * Math.sqrt(3) / 4;
    }
}