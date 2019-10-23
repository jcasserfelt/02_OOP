package Sprint2.UtanFactoryPatternSkoj;

import java.util.ArrayList;

abstract public class Figur {
    static ArrayList<Figur> figurlista = new ArrayList<Figur>();
    Punkt startpunkt = new Punkt();

    public Figur() {
    }

    public Figur(int x, int y) {
        this.startpunkt.x = x;
        this.startpunkt.y = y;
    }

    abstract double area();
}
