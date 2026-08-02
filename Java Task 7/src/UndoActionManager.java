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
    }
}