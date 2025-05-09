package service;

import model.Student;
import java.util.ArrayList;

public class StudentService {
    private ArrayList<Student> studentList = new ArrayList<>();

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void showAllStudents() {
        for (Student s : studentList) {
            s.showInfo();
            System.out.println("---------------");
        }
    }
}