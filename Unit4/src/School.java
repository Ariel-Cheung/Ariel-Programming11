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

    public void removeTeacher(String firstname, String lastname, String subject) {
        int index = -1;
        for (int i = 0; i < teachers.size(); i++) {
            if (teachers.get(i).getFirstName().equals(firstname) && teachers.get(i).getLastName().equals(lastname)
                    && teachers.get(i).getSubject().equals(subject)) {
                index = i;
            }
        }
        if (index != -1) {
            teachers.remove(index);
        }
    }


    public void removeStudent(String firstname, String lastname, int grade, int studentnum) {
        int index = -1;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getFirstName().equals(firstname) && students.get(i).getLastName().equals(lastname)
                    && students.get(i).getGrade() == grade && students.get(i).getStudentNum() == studentnum) {
                index = i;
            }
        }
        if (index != -1) {
            students.remove(index);
        }
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
