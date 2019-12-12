package design;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private String name;
    List<Seminar> seminarList;

    Teacher(String name) {
        this.name = name;
        seminarList = new ArrayList<>();
    }

    public List<Seminar> getSeminarHistory() {
        if (this.seminarList.size() == 0) {
            System.out.println("Läraren har inga seminarier");
            //throw new Exception("Läraren har inga seminarier");
        }
        return this.seminarList;
    }

    public Seminar getCurrentSeminar() throws Exception {
        Seminar tempSeminar;
        if (!(this.seminarList.size() == 0)) {
            tempSeminar = this.seminarList.get(seminarList.size() - 1);
        } else throw new Exception("Läraren har inga seminarier");
        return tempSeminar;
    }

    public String getName() {
        return name;
    }

}
