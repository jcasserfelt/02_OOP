package UtanFactoryPatternSkoj;

public class Main {

    public static void main(String[] args) {

        Cirkel c1 = new Cirkel(5, 0, 0);
        Rektangel r1 = new Rektangel(2, 5);
        LiksidigTriangel ls1 = new LiksidigTriangel(1);
        for (Figur temp : Figur.figurlista) {
            System.out.println(temp.area());
        }
        System.out.println("------------------------");

        FigurFactory.getfigur("cirkel");
        FigurFactory.getfigur("rektangel");
        FigurFactory.getfigur("triangel");

        for (Figur temp : Figur.figurlista) {
            System.out.println(temp.area());
        }
    }
}
