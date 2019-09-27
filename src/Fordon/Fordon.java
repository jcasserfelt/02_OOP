package Fordon;

abstract public class Fordon implements IPrintableByInterface {
    int _hastighet;
    int _vikt;

    public Fordon(int _hastighet, int _vikt) {
        this._hastighet = _hastighet;
        this._vikt = _vikt;
    }

    public Fordon() {
    }

    public void andraHastighet(int hastighet) {

        this._hastighet = hastighet;
        System.out.println("Ändra hastighet ---- fakka ur fakker");
    }

    protected void breakDown() {
    }

    ;
}