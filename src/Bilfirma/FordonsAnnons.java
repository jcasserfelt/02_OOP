package Bilfirma;

public class FordonsAnnons {
    int pris;
    String rubrik;
    String beskrivning;
    int årsmodell;
    int antalmil;

    public FordonsAnnons(int pris, String rubrik, String beskrivning, int årsmodell, int antalmil) {
        this.pris = pris;
        this.rubrik = rubrik;
        this.beskrivning = beskrivning;
        this.årsmodell = årsmodell;
        this.antalmil = antalmil;
    }

    void GetAnnonsText() {
        System.out.printf("pris %d, rubrik %s, beskrivning %s, årsmodell %d, antalmil %d", pris, rubrik, beskrivning, årsmodell, antalmil);
    }
}
