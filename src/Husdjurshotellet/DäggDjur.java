package Husdjurshotellet;

abstract public class DäggDjur extends Djur {

    // Constructor is needed to pass on parameters to its superclass
    public DäggDjur(String namn, int vikt) {
        super(namn, vikt);
    }

    public DäggDjur() {
        super();
    }
}