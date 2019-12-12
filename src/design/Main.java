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
        Program java19program = new Program("Java19", "sara");

        //Create a Program Coordinator
        ProgramCoordinator coordinator = new ProgramCoordinator("inteSara", java19program);

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
        coordinator.addTeacher(teacher);
        coordinator.teacherList.get(0).seminarList.get(0).addSubject(new Subject("engelska"));

        // Vilket program en Coordinator ansvarar för?
        coordinator.getProgram();
        //Vilka lärare som finns för ett Program?
        java19program.getTeachers();
        //Hur många studenter som finns i ett Program?
        java19program.getStudents().size();
        //Hur man lägger till en ny student till ett Program
        // nope
        //Vad närvaron är för Student X?
        student1.getSeminarAttended();
        //Vilka kurser/seminarier som en lärare undervisat i?
        teacher.getSeminarList();
        //Vilka ämnen som undervisats i ett Seminar?
        seminar1.getSubjectList();
        //Närvaron för Seminar X?
        seminar1.getAttendanceList();
        //Hur man skapar en ny Attendance?
        Attendance attendance = new Attendance();


//        System.out.println("Programansvarig: " + coordinator);
//        System.out.println("Programansvarigs lärare nr0: " + coordinator.teacherList.get(0));
//        System.out.println("Programansvarigs lärares seminar: " + coordinator.teacherList.get(0).seminarList);
//        System.out.println("Programansvarigs lärares seminars subject nr0: " + coordinator.teacherList.get(0).seminarList.get(0));
//        System.out.println("Programansvarigs lärares seminar attendance nr0: " + coordinator.teacherList.get(0).seminarList.get(0).getAttendanceList().get(0));
//        System.out.println("Programansvarigs lärares seminar attendance nr0 student: " + coordinator.teacherList.get(0).seminarList.get(0).getAttendanceList().get(0).getStudent());
//

//        System.out.println("Vilket program en Coordinator ansvarar för?");
//        System.out.println("Coordinator: " + coordinator + " ansvarig for: " + coordinator.getProgram());
//        System.out.println("");
//        System.out.println("Vilka studenter som finns för ett Program");
//        System.out.println("Program: " + java19program + " Studenter: " + java19program.getStudents());
//        System.out.println("");
//        System.out.println("Hur många studenter som finns i ett Program?");
//        System.out.println("Program: " + java19program + " Antal studenter: " + java19program.getStudents().size());
//        System.out.println("");
//        System.out.println("Vad närvaron är för Student X?");
//        System.out.println("Student: " + java19program.getStudents().get(0) + "narvaro: " + java19program.getStudents().get(0).getSeminarAttended().size());
//        System.out.println("");
//        System.out.println("Vilka kurser/seminarier som en lärare undervisat i");
//        System.out.println("");











    }
}
