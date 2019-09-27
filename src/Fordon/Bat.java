package Fordon;

public class Bat extends Fordon implements IHjulBuren {
    int _dodVikt;

    public Bat(int _hastighet, int _vikt, int _dodVikt) {
        super(_hastighet, _vikt);
    }

    public void svang() {

    }

    /*@Override
    void printMe() {
        System.out.printf("jag är en båt. hastighet: %d, vikt: %d, dödvikt: %d\n", _hastighet, _vikt, _dodVikt);
    }*/

    @Override
    public void printMeByInterface() {
        System.out.printf("jag är en båt. hastighet: %d, vikt: %d, dödvikt: %d\n", _hastighet, _vikt, _dodVikt);

    }

    @Override
    public int getAntalHjul() {
        return 0;
    }

    @Override
   protected void breakDown() {
        System.out.println("jag är en jävla båt");
    }
}
