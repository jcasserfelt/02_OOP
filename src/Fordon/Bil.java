package Fordon;

public class Bil extends Fordon implements IHjulBuren {
    private int _antalVaxlar;
    int _vaxelJustNu;
    int _antalHjul = 4;

    public Bil(int _hastighet, int _vikt, int _antalVaxlar, int _vaxelJustNu) {
        super();

        this._antalVaxlar = _antalVaxlar;
        this._vaxelJustNu = _vaxelJustNu;
    }

    public void vaxla(int vaxel) {
        this._vaxelJustNu = vaxel;
    }

    @Override
    public void printMeByInterface() {
    }

    @Override
    public int getAntalHjul() {
        return this._antalHjul;
    }

    @Override
    public void andraHastighet(int hastighet) {
        super.andraHastighet(hastighet);
        System.out.println("Bilen ändrar hastighet till " + hastighet + "km/h");
    }

    @Override
    protected void breakDown() {
        System.out.println("Bilen har pajjat inte bra");
    }
}