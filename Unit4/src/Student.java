import java.util.Objects;

public class Student {

    private String firstName; // store the first name of the student
    private String lastName; // store the last name of the student
    private int grade; // store the grade of the student
    private int studentNum; // store the student number
    static private int idNum = 1; //store the student number counter

    // Constructor
    // Initialize the student with blank information
    public Student() {
        this.firstName = " ";
        this.lastName = " ";
        this.grade = 1;
        this.studentNum = idNum;
        idNum++;
    }

    // Constructor
    // Initialize the student with first name, last name, grade
    // assign a new student number
    public Student(String firstname, String lastname, int grade) {
        this.firstName = firstname;  // store the first name
        this.lastName = lastname;  // store the last name
        this.grade = grade; // store the grade
        this.studentNum = idNum; // assign the student number
        idNum++;  // increment the student number counter by 1
    }

    // set the student first name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // set the student last name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // set the student grade
    public void setGrade(int grade) {
        this.grade = grade;
    }

    // get the student first name
    public String getFirstName() {
        return firstName;
    }

    // get the student last name
    public String getLastName() {
        return lastName;
    }

    // get the student grade
    public int getGrade() {
        return grade;
    }

    // get the student number
    public int getStudentNum() {
        return studentNum;
    }

    // return the String of first name, last name and student number
    public String toString() {
        return ("Name: " + firstName + " " + lastName + " Student Number: " + studentNum);
    }

}
