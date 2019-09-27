package Bilfirma;

public class MotorCykelAnnons extends FordonsAnnons implements Publishable {

    int slagVolym;

    public MotorCykelAnnons(int pris, String rubrik, String beskrivning, int årsmodell, int antalmil, int slagVolym) {
        super(pris, rubrik, beskrivning, årsmodell, antalmil);
        this.slagVolym = slagVolym;
    }

    @Override
    public void GetAnnonsText() {
        super.GetAnnonsText();
    }

    @Override
    public void PrintHeader() {
        System.out.println("Fantastisk motorcykel, 25000 kr");
    }

    @Override
    public void PrintCompleteAd() {
        System.out.printf("slagvolym %d, pris %d, rubrik %s, beskrivning %s, årsmodell %d, antalmil %d", slagVolym, pris, rubrik, beskrivning, årsmodell, antalmil);

    }
}
