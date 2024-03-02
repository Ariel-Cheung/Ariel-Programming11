import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        School vancouver = new School("Vancouver Secondary","Vancouver, BC", "604-123-1234");

        System.out.println("===Add 3 teachers===");
        vancouver.addTeacher("Steve", "Mac", "Programming");
        vancouver.addTeacher("Charles","Dickson", "English");
        vancouver.addTeacher("Tiffany","Kim", "Chemistry");


        vancouver.showTeacher();

        System.out.println("===Add 10 students===");
        vancouver.addStudent("Ariel", "Cheung", 11);
        vancouver.addStudent("Jasmine", "Watson", 11);
        vancouver.addStudent("Justin", "Job", 11);
        vancouver.addStudent("Anson", "White", 11);
        vancouver.addStudent("Sophia", "Stone", 11);
        vancouver.addStudent("Olivia","Lee",12);
        vancouver.addStudent("Emma", "Wood", 12);
        vancouver.addStudent("Jeremy","Chan",12);
        vancouver.addStudent("William","Grant",12);
        vancouver.addStudent("Ryan","Hunt", 12);


        vancouver.showStudent();
        System.out.println();
        System.out.println("---Remove 1 teacher---");
        vancouver.removeTeacher("Charles","Dickson","English");
        //System.out.println("---Show list of teachers---");
        vancouver.showTeacher();

        System.out.println("---Remove 2 students---");
        //vancouver.removeStudent("Ariel","Cheung",11,1);
        vancouver.removeStudent("Ryan","Hunt",12,10);
        vancouver.removeStudent("Anson","White",11,4);
        //System.out.println("---Show list of students---");
        vancouver.showStudent();
    }
}