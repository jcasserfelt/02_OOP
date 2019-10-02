package UtanFactoryPatternSkoj;

public class Rektangel extends Figur {
    int langd;
    int bredd;

    public Rektangel(int l, int b) {
        super();
        Figur.figurlista.add(this);
        this.langd = l;
        this.bredd = b;
    }

    @Override
    double area() {
        return langd * bredd;
    }
}
