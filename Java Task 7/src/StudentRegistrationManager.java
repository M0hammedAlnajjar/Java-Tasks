import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class StudentRegistrationManager {

    static void main(String[] args) {

        Queue<String> StudentsWaiting = new LinkedList<>();

        Stack<String> CompletedRegistrations  = new Stack<>();

        String students=IO.readln("Enter  the number of students waiting for registration :");
        int number =Integer.parseInt(students);

    if (number<= 0){
        IO.println("Invalid number of students");
    }

    }
}
