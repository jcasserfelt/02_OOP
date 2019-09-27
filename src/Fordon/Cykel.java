package Fordon;

public class Cykel extends Fordon implements IHjulBuren {
    int _antalVaxlar;
    int _vaxelJustNu;
    int _antalHjul;

    public Cykel(int _hastighet, int _vikt, int antalVaxlar, int vaxelJustNu) {
        super(_hastighet, _vikt);
        this._antalVaxlar = _antalVaxlar;
        this._vaxelJustNu = _vaxelJustNu;
    }

    public void vaxla(int vaxel) {
        this._vaxelJustNu = vaxel;
    }

    @Override
    public void printMeByInterface() {
        System.out.printf("jag är en cykel. hastighet: %d, vikt: %d, antal växlar: %d, växel just nu: %d\n", _hastighet, _vikt, _antalVaxlar, _vaxelJustNu);

    }

    @Override
    public int getAntalHjul() {
        return this._antalHjul;
    }

    @Override
    protected void breakDown() {

    }
}