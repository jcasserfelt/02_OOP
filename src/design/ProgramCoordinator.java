package design;

import java.util.ArrayList;
import java.util.List;

public class ProgramCoordinator {
    String name;
    Program program;
    List<Teacher> teacherList = new ArrayList<>();

    public ProgramCoordinator(String name, Program program) {
        this.name = name;
        this.program = program;
    }

    public void addTeacher(Teacher teacher) {
        this.teacherList.add(teacher);
    }

    public Teacher findTeacher(String input) throws Exception {
        Teacher foundTeacher = null;
        for (Teacher t : this.teacherList) {
            if (t.getName().equals(t.getName())) {
                foundTeacher = t;
            }
        }
        if (foundTeacher == null) {
            throw new Exception("Lärare kunde inte hittas");
        }
        return foundTeacher;
    }

    public String getName() {
        return name;
    }

    public Program getProgram() {
        return program;
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }
}
