package Husdjurshotellet;

import java.util.ArrayList;

abstract public class Djur implements ICalcFood {
    protected String namn;
    protected int vikt;
    DjurFoder matVanor;
    static ArrayList<Djur> djurlista = new ArrayList<Djur>();

}
