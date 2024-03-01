import java.util.ArrayList;

public class School {
    ArrayList<Teacher> teachers = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();

    private String schoolName;
    private String schoolAddr;
    private String schoolPhoneNum;

    public School(String schoolName, String schoolAddr, String schoolPhoneNum) {
        this.schoolName = schoolName;
        this.schoolAddr = schoolAddr;
        this.schoolPhoneNum = schoolPhoneNum;
    }

    public void addTeacher(String firstname, String lastname, String subject) {
        teachers.add(new Teacher(firstname, lastname, subject));
    }

    public void addStudent(String firstname, String lastname, int grade) {
        students.add(new Student(firstname,lastname, grade));
    }

    public void showTeacher() {
        for (int i = 0; i < teachers.size(); i++) {
            System.out.println(teachers.get(i));
        }
    }

    public void showStudent() {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }
}
