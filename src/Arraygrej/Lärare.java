package Arraygrej;

import java.util.ArrayList;

public class Lärare extends Person {
    ArrayList<Kurs> kursLista = new ArrayList<Kurs>();

    protected int kursIndex;

    public Lärare(String namn, int personNummer) {
        super(namn, personNummer);
    }

    public Lärare() {
    }

    public void addCorse(Kurs k) {
    }

    public void addCourses(Kurs k) {
        this.kursLista.add(k);
    }
}