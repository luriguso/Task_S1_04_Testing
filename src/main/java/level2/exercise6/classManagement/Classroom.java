package level2.exercise6.classManagement;

import level2.exercise6.classData.Student;

import java.util.ArrayList;

public class Classroom {
    private Student[] students;

    public Classroom() {
        this.students =  new  Student[]{};
    }

    public Student[] getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students = new  Student[]{student};
    }

    public String triggerOutOfBounds(){
        return students[1].getName();
    }
}
