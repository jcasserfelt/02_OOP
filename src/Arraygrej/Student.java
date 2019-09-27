package Arraygrej;

import java.util.ArrayList;

public class Student extends Person {
    ArrayList<Kurs> aktivaKurser = new ArrayList<Kurs>();

    public Student(String namn, int personNummer) {
        super(namn, personNummer);
    }

    public Student(ArrayList<Kurs> aktivaKurser) {
        this.aktivaKurser = aktivaKurser;
    }

    public void addCourses(Kurs k) {
        aktivaKurser.add(k);
    }

    @Override
    public String toString() {
        return "Student: " +
                this.namn;
    }
}
