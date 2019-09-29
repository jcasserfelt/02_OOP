package Husdjurshotellet;

import java.util.ArrayList;

abstract public class Djur implements ICalcFood {
    private String namn;
    private int vikt;
    DjurFoder matVanor;
    static ArrayList<Djur> djurlista = new ArrayList<Djur>();

    public Djur(String namn, int vikt) {
        this.namn = namn;
        this.vikt = vikt;
    }

    public Djur() {
    }

    public String getNamn() {
        return namn;
    }

    public int getVikt() {
        return vikt;
    }

    public DjurFoder getMatVanor() {
        return matVanor;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public void setVikt(int vikt) {
        this.vikt = vikt;
    }

    public void setMatVanor(DjurFoder matVanor) {
        this.matVanor = matVanor;
    }
}
