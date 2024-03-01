public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;


    public Teacher() {
        this.firstName = "";
        this.lastName = "";
        this.subject = "";
    }

    public Teacher(String firstname, String lastname, String subject) {
        this.firstName = firstname;
        this.lastName = lastname;
        this.subject = subject;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSubject() {
        return subject;
    }

    public String toString() {
        return ("Name: " + firstName + " " + lastName + " Subject: " + subject);
    }
}
