package Arraygrej;

import java.util.ArrayList;

public class Kurs {
    Lärare lärare;
    String kursnamn;
    ArrayList<Student> kursDeltagare = new ArrayList<Student>();

    public Kurs(Lärare lärare, String kursnamn) {
        this.lärare = lärare;
        this.kursnamn = kursnamn;
    }


    @Override
    public String toString() {
        return "Kurs{" +
                "lärare=" + lärare +
                '}';
    }

    public void addStudents(Student s) {
        kursDeltagare.add(s);
    }
}