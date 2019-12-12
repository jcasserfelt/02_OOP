package design;

import java.util.ArrayList;
import java.util.List;

public class Program {
    private String name;
    private List<Seminar> seminarList;

    public Program(String name) {
        this.name = name;
        this.seminarList = new ArrayList<>();
    }

    public void addSeminar(Seminar seminar) {
        seminarList.add(seminar);
    }

    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        for (Seminar seminar : seminarList) {
            for (Attendance attendance : seminar.getAttendanceList()) {
                if (!students.contains(attendance.getStudent())) {
                    students.add(attendance.getStudent());
                }
            }
        }
        return students;
    }

}
