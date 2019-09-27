package Fordon;

public class Tag extends Fordon implements IHjulBuren {
    int _antalVagnar;
    int _antalhjul;

    public Tag(int _hastighet, int _vikt, int _antalVagnar) {
        super(_hastighet, _vikt);
    }

    public void kopplaVagn() {
    }

    @Override
    public void printMeByInterface() {
        System.out.printf("jag är ett tåg. hastighet: %d, vikt: %d, antal vagnar: %d\n", _hastighet, _vikt, _antalVagnar);

    }

    @Override
    public int getAntalHjul() {
        return this._antalhjul;
    }

    @Override
    protected void breakDown() {

    }
}