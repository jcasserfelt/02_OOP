package design;

import java.util.ArrayList;
import java.util.List;

public class Seminar {
    private String name;
    private List<Attendance> attendanceList;
    private List<Subject> subjectList;


    //här bortser jag från att ett Seminar har relationen 1..* till Attendance
    public Seminar(String name) {
        this.name = name;
        this.attendanceList = new ArrayList<>();
        this.subjectList = new ArrayList<>();
    }

    public int getTotalAttendance() {
        int k = 0;
        for (Attendance a : attendanceList) {
            if (a.isAttendanceLevel()) {
                k++;
            }
        }
        return k;
    }

    public void addAttendance(Attendance attendance) {
        this.attendanceList.add(attendance);
    }

    public List<Attendance> getAttendanceList() {
        return this.attendanceList;
    }

    public void addSubject(Subject subject) {
        if (!this.subjectList.contains(subject)) {
            this.subjectList.add(subject);
        }
    }

    public List<Subject> getSubjectList() {
        return subjectList;
    }
}
