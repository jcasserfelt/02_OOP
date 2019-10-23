package Sprint2.UtanFactoryPatternSkoj;

public class FigurFactory {

    public static Figur getfigur(String input) {
        if (input.equalsIgnoreCase("cirkel")) {
            return new Cirkel(5, 1, 1);
        } else if (input.equalsIgnoreCase("rektangel")) {
            return new Rektangel(2, 5);
        } else if (input.equalsIgnoreCase("triangel")) {
            return new LiksidigTriangel(1);
        } else return null;
    }
}
