import java.util.Stack;

public class UndoActionManager {

    static void main() {

        String actions = IO.readln("Enter the number of actions:");
        int number = Integer.parseInt(actions);

        if (number <= 0) {
            IO.println("Invalid number of actions.");
        } else {
            Stack<String> stack = new Stack<>();

            for (int i = 0; i < number; i++) {
                String action = IO.readln("Enter action:");
                stack.push(action);
            }
        }
        int choice;

        do {
            IO.println("\nMenu");
            IO.println("1. Add Action");
            IO.println("2. Undo Last Action");
            IO.println("3. View Last Action");
            IO.println("4. Search Action");
            IO.println("5. Display All Actions");
            IO.println("6. Display Action Statistics");
            IO.println("7. Clear All Actions");
            IO.println("8. Exit");

            choice = Integer.parseInt(IO.readln("Enter your choice:"));
            switch (choice) {

                // Add Action
                case 1:
                    String action = IO.readln("Enter action: ");
                    stack.push(action);
                    System.out.println("Action added.");
                    break;
                // Undo Last Action
                case 2:
                    if (stack.isEmpty()) {
                        System.out.println("No actions available.");
                    } else {
                        System.out.println("Removed action: " + stack.pop());
                    }
                    break;

            }
        } while (choice != 8);
    }
}