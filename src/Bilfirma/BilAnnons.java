package Bilfirma;

public class BilAnnons extends FordonsAnnons implements Publishable {
    String colour;
    boolean sommarDack;
    boolean VinterDack;

    public BilAnnons(int pris, String rubrik, String beskrivning, int årsmodell, int antalmil, String colour, boolean sommarDack, boolean vinterDack) {
        super(pris, rubrik, beskrivning, årsmodell, antalmil);
        this.colour = colour;
        this.sommarDack = sommarDack;
        VinterDack = vinterDack;
    }

    @Override
    public void GetAnnonsText() {
        super.GetAnnonsText();
    }

    @Override
    public void PrintHeader() {
        System.out.println("Fantastisk bil, 250 000 kr");
    }

    @Override
    public void PrintCompleteAd() {
        System.out.printf("färg %s, pris %d, rubrik %s, beskrivning %s, årsmodell %d, antalmil %d", colour, pris, rubrik, beskrivning, årsmodell, antalmil);


    }
}
