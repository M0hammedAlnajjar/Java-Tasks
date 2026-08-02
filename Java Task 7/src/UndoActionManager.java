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
                // View Last Action
                case 3:
                    if (stack.isEmpty()) {
                        System.out.println("No actions available.");
                    } else {
                        System.out.println("Last action: " + stack.peek());
                    }
                    break;

                // Search Action
                case 4:
                    String searchAction = IO.readln("Enter action to search: ");
                    int position = stack.search(searchAction);

                    if (position == -1) {
                        System.out.println("Action not found.");
                    } else {
                        System.out.println("Position from top: " + position);
                    }
                    break;

                // Display All Actions
                case 5:
                    System.out.println("All Actions:");
                    System.out.println(stack);
                    break;

                // Display Action Statistics
                case 6:
                    System.out.println("Total number of actions: " + stack.size());

                    if (stack.isEmpty()) {
                        System.out.println("Most recent action: None");
                    } else {
                        System.out.println("Most recent action: " + stack.peek());
                    }

                    System.out.println("Stack is empty: " + stack.isEmpty());
                    break;
                // Clear All Actions
                case 7:
                    stack.clear();
                    System.out.println("All actions have been cleared.");
                    break;




            }
        } while (choice != 8);
    }
}