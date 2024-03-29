package Sprint2.UtanFactoryPatternSkoj;

public class Cirkel extends Figur {
    double radie;

    public Cirkel() {
        super();
        Figur.figurlista.add(this);
    }

    public Cirkel(double radie, int x, int y) {
        super(x, y);
        this.radie = radie;
        Figur.figurlista.add(this);
    }


    double area() {
        return radie * radie * Math.PI;
    }
}
