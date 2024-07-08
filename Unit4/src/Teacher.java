public class Teacher {
    // This is a class for Teacher which contains first name, last name and
    // subject taught by the teacher
    private String firstName; // store first name of the teacher
    private String lastName; // store last name of the teacher
    private String subject; // store the subject taught by the teacher


    public Teacher() {
        // initialize this object with blank values
        this.firstName = "";
        this.lastName = "";
        this.subject = "";
    }

    public Teacher(String firstname, String lastname, String subject) {
        // initialize this object with the input first name, last name and subject
        this.firstName = firstname;
        this.lastName = lastname;
        this.subject = subject;
    }

    //set the first name of the teacher
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //set the last name of the teacher
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //set the subject of the teacher
    public void setSubject(String subject) {
        this.subject = subject;
    }

    //get the first  name of the teacher
    public String getFirstName() {
        return firstName;
    }
    //get the last name of the teacher
    public String getLastName() {
        return lastName;
    }
    //get the subject of the teacher
    public String getSubject() {
        return subject;
    }
    // return the first name, last name and subject taught by the teacher
    public String toString() {
        return ("Name: " + firstName + " " + lastName + " Subject: " + subject);
    }
}



