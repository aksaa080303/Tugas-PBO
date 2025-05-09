import model.Student;
import service.StudentService;

public class Main {
    public static void main(String[] args) {
        StudentService service = new StudentService();

        Student s1 = new Student("Andi", "22001", 1);
        Student s2 = new Student("Budi", "22002", 2);

        service.addStudent(s1);
        service.addStudent(s2);

        service.showAllStudents();
    }
}