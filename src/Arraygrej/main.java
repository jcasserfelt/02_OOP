package Arraygrej;

public class main {

    public static void main(String[] args) {

        args[0] = "hello";


        Student stud1 = new Student("Kalle", 800101);
        Student stud2 = new Student("Olle", 900101);
        Student stud3 = new Student("Lisa", 200101);

        Lärare sigrun = new Lärare("Sigrun", 800101);

        Kurs OOP = new Kurs(sigrun,"OOP");

        stud1.addCourses(OOP);
        stud2.addCourses(OOP);
        stud3.addCourses(OOP);
        OOP.addStudents(stud1);
        OOP.addStudents(stud2);
        OOP.addStudents(stud3);
        sigrun.addCorse(OOP);
        System.out.println("vattafakk");

        System.out.println(OOP.toString());
        /*

        Student[] studentLista = new Student[5];
        Kurs[] kursLista1 = new Kurs[1];

        Student stud1 = new Student("Kalle", 800101);
        Student stud2 = new Student("Olle", 900101);
        Student stud3 = new Student("Lisa", 200101);
        studentLista[0] = stud1; studentLista[1] = stud2; studentLista[2] = stud3;


        Lärare lärare = new Lärare("Sigrun", 800101, kursLista1);

        Kurs OOP = new Kurs("OOP", lärare, studentLista);
        kursLista1[0] = OOP;

        System.out.println(Arrays.toString(kursLista1));

*/
    }
}
