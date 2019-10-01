package UtanFactoryPatternSkoj;

public class LiksidigTriangel extends Figur {
    int sida;
    double hojd = sida * Math.sqrt(sida);

    public LiksidigTriangel(int sida) {
        this.sida = sida;
    }

    @Override
    double area() {
        return sida * hojd / 2;
    }
}