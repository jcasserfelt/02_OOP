package Husdjurshotellet;

// Factorys are fun, so here is a animal factory
// Used to not mess up client side

public class DjurFactory {

    // we need three arguments. djurtyp, namn, vikt
    public static Djur skapaDjur(String djurTyp, String namn, int vikt) {

        if (djurTyp.equalsIgnoreCase("hund")) {
            return new Hund(namn, vikt);

        } else if (djurTyp.equalsIgnoreCase("katt")) {
            return new Katt(namn, vikt);

        } else if (djurTyp.equalsIgnoreCase("orm")) {
            return new Orm(namn, vikt);

            // in case input does not match with animal type
        } else return null;
    }
}
