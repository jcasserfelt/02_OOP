package Bilfirma;

public class HusvagnsAnnons extends FordonsAnnons implements Publishable {
    int antalBaddar;

    @Override
    public void GetAnnonsText() {
        super.GetAnnonsText();
        System.out.println("Jak är bök");
    }

    public HusvagnsAnnons(int antalBaddar, int pris, String rubrik, String beskrivning, int årsmodell, int antalmil) {
        super(pris, rubrik, beskrivning, årsmodell, antalmil);
    }

    @Override
    public void PrintHeader() {
        System.out.println("Fantastisk husvagn, 25 000 kr");
    }

    @Override
    public void PrintCompleteAd() {
        System.out.printf("antalbäddar %d, pris %d, rubrik %s, beskrivning %s, årsmodell %d, antalmil %d", antalBaddar, pris, rubrik, beskrivning, årsmodell, antalmil);
    }
}
