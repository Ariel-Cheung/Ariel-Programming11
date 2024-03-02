import java.util.Objects;

public class Student {

    private String firstName;
    private String lastName;
    private int grade;
    private int studentNum;
    static private int idNum = 1;

    public Student() {
        this.firstName = " ";
        this.lastName = " ";
        this.grade = 1;
        this.studentNum = idNum;
        idNum++;
    }
    public Student(String firstname, String lastname, int grade) {
        this.firstName = firstname;
        this.lastName = lastname;
        this.grade = grade;
        this.studentNum = idNum;
        idNum++;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getGrade() {
        return grade;
    }

    public int getStudentNum() {
        return studentNum;
    }


    public String toString() {
        return ("Name: " + firstName + " " + lastName + " Student Number: " + studentNum);
    }

}
