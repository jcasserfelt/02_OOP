package Husdjurshotellet;

import java.util.ArrayList;


abstract public class Djur implements ICalcFood {
    private String namn;
    private int vikt;
    protected DjurFoder matVanor;
    static ArrayList<Djur> djurlista = new ArrayList<Djur>(); // used in all animal constructors to put them in this list.

    // Constructor
    public Djur(String namn, int vikt) {
        this.namn = namn;
        this.vikt = vikt;
    }

    // Constructor
    public Djur() {
    }

    // Getters and Setters.
    public String getNamn() {
        return namn;
    }

    public int getVikt() {
        return vikt;
    }

    public DjurFoder getMatVanor() {
        return matVanor;
    }

    public void setVikt(int vikt) {
        this.vikt = vikt;
    }
}
