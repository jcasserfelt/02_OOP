package design;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws Exception {

        //Create the students
        Student student1 = new Student("student1");
        Student student2 = new Student("student2");
        Student student3 = new Student("student3");
        Student student4 = new Student("student4");
        Student student5 = new Student("student5");

        //Create the program
        Program java19program = new Program("Java19");

        //Create a few seminars
        Seminar seminar1 = new Seminar("seminar1");
        Seminar seminar2 = new Seminar("seminar2");
        Seminar seminar3 = new Seminar("seminar3");
        Seminar seminar4 = new Seminar("seminar4");
        Seminar seminar5 = new Seminar("seminar5");

        java19program.addSeminar(seminar1);
        java19program.addSeminar(seminar2);
        java19program.addSeminar(seminar3);
        java19program.addSeminar(seminar4);
        java19program.addSeminar(seminar5);

        //Create a few attendances
        List<Attendance> seminar1attendance = new ArrayList<>() {{
            new Attendance().registerAttendance(seminar1, student1);
            new Attendance().registerAttendance(seminar1, student2);
            new Attendance().registerAttendance(seminar1, student3);
            new Attendance().registerAttendance(seminar1, student4);
            new Attendance().registerAttendance(seminar1, student5);
        }};
        List<Attendance> seminar2attendance = new ArrayList<>() {{
            new Attendance().registerAttendance(seminar2, student1);
            new Attendance().registerAttendance(seminar2, student2);
            new Attendance().registerAttendance(seminar2, student3);
            new Attendance().registerAttendance(seminar2, student4);
            new Attendance().registerAttendance(seminar2, student5);
        }};
        List<Attendance> seminar3attendance = new ArrayList<>() {{
            new Attendance().registerAttendance(seminar3, student1);
            new Attendance().registerAttendance(seminar3, student2);
            new Attendance().registerAttendance(seminar3, student3);
            new Attendance().registerAttendance(seminar3, student4);
            new Attendance().registerAttendance(seminar3, student5);
        }};
        List<Attendance> seminar4attendance = new ArrayList<>() {{
            new Attendance().registerAttendance(seminar4, student1);
            new Attendance().registerAttendance(seminar4, student2);
            new Attendance().registerAttendance(seminar4, student3);
            new Attendance().registerAttendance(seminar4, student4);
            new Attendance().registerAttendance(seminar4, student5);
        }};
        List<Attendance> seminar5attendance = new ArrayList<>() {{
            new Attendance().registerAttendance(seminar5, student1);
            new Attendance().registerAttendance(seminar5, student2);
            new Attendance().registerAttendance(seminar5, student3);
            new Attendance().registerAttendance(seminar5, student4);
            new Attendance().registerAttendance(seminar5, student5);
        }};

        for (Attendance a : seminar1attendance) {
            seminar1.addAttendance(a);
        }
        for (Attendance a : seminar2attendance) {
            seminar2.addAttendance(a);
        }
        for (Attendance a : seminar3attendance) {
            seminar3.addAttendance(a);
        }
        for (Attendance a : seminar4attendance) {
            seminar4.addAttendance(a);
        }
        for (Attendance a : seminar5attendance) {
            seminar5.addAttendance(a);
        }
        System.out.println("Print av java19 studenLista :" + java19program.getStudents());
        System.out.println("");
        Teacher teacher = new Teacher("Sigrun");
        teacher.seminarList.add(seminar1);
        teacher.seminarList.add(seminar2);
        teacher.seminarList.add(seminar3);
        teacher.seminarList.add(seminar4);
        teacher.seminarList.add(seminar5);
        ProgramCoordinator sara = new ProgramCoordinator();
        sara.addTeacher(teacher);
        sara.teacherList.get(0).seminarList.get(0).addSubject(new Subject("engelska"));

        System.out.println("Programansvarig: " + sara);
        System.out.println("Programansvarigs lärare nr0: " + sara.teacherList.get(0));
        System.out.println("Programansvarigs lärares seminar: " + sara.teacherList.get(0).seminarList);
        System.out.println("Programansvarigs lärares seminars subject nr0: " + sara.teacherList.get(0).seminarList.get(0));
        System.out.println("Programansvarigs lärares seminar attendance nr0: " + sara.teacherList.get(0).seminarList.get(0).getAttendanceList().get(0));
        System.out.println("Programansvarigs lärares seminar attendance nr0 student: " + sara.teacherList.get(0).seminarList.get(0).getAttendanceList().get(0).getStudent());



    }
}
