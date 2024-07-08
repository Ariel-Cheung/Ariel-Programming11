import java.util.ArrayList;

public class School {
    // This is a class for School which contains a list of teachers and
    // a list of students
    ArrayList<Teacher> teachers = new ArrayList<>(); // array list of teachers
    ArrayList<Student> students = new ArrayList<>(); // array list of students

    private String schoolName; // store the school name
    private String schoolAddr; // store the school address
    private String schoolPhoneNum; // store the school phone number

    public School(String schoolName, String schoolAddr, String schoolPhoneNum) {
        // initialize this object with input school name, school address and phone number
        this.schoolName = schoolName;
        this.schoolAddr = schoolAddr;
        this.schoolPhoneNum = schoolPhoneNum;
    }

    // This method adds a teacher object into the teacher array list
    public void addTeacher(String firstname, String lastname, String subject) {
        teachers.add(new Teacher(firstname, lastname, subject));
    }

    // This method adds a student object into the student array list
    public void addStudent(String firstname, String lastname, int grade) {
        students.add(new Student(firstname,lastname, grade));
    }

    // This method removes the matching teacher from the teacher array list
    // The teacher is matched if the first name, last name and subject are the same
    public void removeTeacher(String firstname, String lastname, String subject) {
        int index = -1; // initialize index to -1
        for (int i = 0; i < teachers.size(); i++) { // loop through the array list of teacher to find a matching teacher
            if (teachers.get(i).getFirstName().equals(firstname) && teachers.get(i).getLastName().equals(lastname)
                    && teachers.get(i).getSubject().equals(subject)) {
                index = i; // store the index of the matching teacher in the array list
            }
        }
        if (index != -1) {
            teachers.remove(index); // remove the matching teacher from the array list of teachers
        }
    }

    // This method removes the matching student from the student array list
    // The student is matched if the first name, last name and student number are the same
    public void removeStudent(String firstname, String lastname, int grade, int studentnum) {
        int index = -1; // initialize the index to -1
        for (int i = 0; i < students.size(); i++) { // loop through the student array list to find a matching student
            if (students.get(i).getFirstName().equals(firstname) && students.get(i).getLastName().equals(lastname)
                    && students.get(i).getGrade() == grade && students.get(i).getStudentNum() == studentnum) {
                index = i; // store the index of the matching student in the array list
            }
        }
        if (index != -1) {
            students.remove(index); // remove the matching student from the array list of student
        }
    }

    // This method displays the list of teachers
    public void showTeacher() {
        for (int i = 0; i < teachers.size(); i++) {
            System.out.println(teachers.get(i));
        }
    }

    // This method displays the list of students
    public void showStudent() {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }
}
