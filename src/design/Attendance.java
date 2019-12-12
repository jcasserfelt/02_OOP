package design;

public class Attendance {
    private boolean attendanceLevel;
    private Student student;
    private Seminar seminar;

    public Attendance() {
    }

    public void registerAttendance(Seminar seminar, Student student) {
        this.student = student;
        this.seminar = seminar;
        this.student.attendSeminar(this);
        this.seminar.addAttendance(this);
        this.attendanceLevel = true;
    }

    public void removeAttendance(Student student, Seminar seminar) {
        this.attendanceLevel = false;
    }

    public Seminar getSeminar() {
        return seminar;
    }

    public Student getStudent() {
        return student;
    }

    public boolean isAttendanceLevel() {
        return attendanceLevel;
    }
}
