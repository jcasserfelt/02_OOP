package design;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Attendance> attendanceList;

    public Student(String name) {
        this.name = name;
        this.attendanceList = new ArrayList<>();
    }

    public List<Seminar> getSeminarAttended() {
        return null;
    }

    public void attendSeminar(Attendance attendance) {
        this.attendanceList.add(attendance);
    }
}
