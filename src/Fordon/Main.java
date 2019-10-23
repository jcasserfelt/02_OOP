package Fordon;

public class Main {
    public static void printaNu(IPrintableByInterface fordon) {
        fordon.printMeByInterface();
        Bil boil = new Bil(1, 1, 1, 1);
    }

    public static int getAntalHjul(IHjulBuren h1) {
        return h1.getAntalHjul();
    }

    public static void main(String[] args) {
        Bil bil = new Bil(70, 1000, 5, 1);
        Tag tag = new Tag(1, 1, 1);

        IPrintableByInterface i1 = new Bil(1, 1, 1, 1);
        printaNu(tag);
        printaNu(i1);
        System.out.println(getAntalHjul(bil));
        bil.andraHastighet(100);

        bil.breakDown();
        tag.breakDown();
    }
}