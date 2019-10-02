package Husdjurshotellet;

abstract class Reptil extends Djur {

    // Constructor is needed to pass on parameters to its superclass
    public Reptil(String namn, int vikt) {
        super(namn, vikt);
    }

    public Reptil() {
        super();
    }
}
