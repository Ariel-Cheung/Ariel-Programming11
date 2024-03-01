import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }

        School vancouver = new School("Killarney Secondary","Vancouver, BC", "604-123-1234");

        vancouver.addTeacher("Bill", "Gate", "Programming");
        vancouver.addTeacher("William","Shakespere", "English");

        vancouver.showTeacher();
        vancouver.addStudent("Ariel", "Cheung", 11);
        vancouver.addStudent("Justin", "Cheung", 12);
        vancouver.showStudent();

    }
}