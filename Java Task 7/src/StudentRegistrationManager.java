import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class StudentRegistrationManager {

    static void main(String[] args) {

        Queue<String> StudentsWaiting = new LinkedList<>();

        Stack<String> CompletedRegistrations = new Stack<>();

        String students = IO.readln("Enter the number of students waiting for registration: ");
        int number = Integer.parseInt(students);

        if (number <= 0) {
            IO.println("Invalid number of students");

        } else {

            for (int i = 0; i < number; i++) {

                String studentName = IO.readln("Enter student name: ");

                StudentsWaiting.offer(studentName);
            }
        }

        int option;

        do {
            // Display student registration menu
            IO.println("\n----- Student Registration Menu -----");
            IO.println("1. Add Student to Queue");
            IO.println("2. Process Student Registration");
            IO.println("3. View Next Student");
            IO.println("4. Undo Last Registration");
            IO.println("5. Search Student");
            IO.println("6. Display Waiting Students");
            IO.println("7. Display Registered Students");
            IO.println("8. Display Statistics");
            IO.println("9. Exit");

            // Read user's choice
            String choice = IO.readln("Enter your choice: ");
            option = Integer.parseInt(choice);

            // Process menu selection
            switch (option) {

                case 1:
                    // Add student to queue
                    String newStudent = IO.readln("Enter student name: ");

                    StudentsWaiting.add(newStudent);

                    IO.println("Student added to registration queue successfully.");
                    break;


                case 2:
                    // Process student registration
                    if (StudentsWaiting.isEmpty()) {
                        IO.println("No students waiting for registration.");
                    } else {

                        String registeredStudent = StudentsWaiting.remove();

                        CompletedRegistrations.push(registeredStudent);

                        IO.println("Student registration completed.");
                    }
                    break;

                case 3:
                    // View next student
                    if (StudentsWaiting.isEmpty()) {
                        IO.println("No students in the queue.");
                    } else {

                        IO.println("Next student: " + StudentsWaiting.element());
                    }
                    break;

                case 4:
                    IO.println("Undo Last Registration selected.");
                    break;

                case 5:
                    IO.println("Search Student selected.");
                    break;

                case 6:
                    IO.println("Display Waiting Students selected.");
                    break;

                case 7:
                    IO.println("Display Registered Students selected.");
                    break;

                case 8:
                    IO.println("Display Statistics selected.");
                    break;

                case 9:
                    IO.println("Exiting Student Registration System.");
                    break;

                default:
                    IO.println("Invalid option. Please try again.");
            }

        } while (option != 9);
    }
}