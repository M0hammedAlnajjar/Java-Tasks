import java.util.Stack;

public class NumberStackAnalyzer {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        String input = IO.readln("Enter the number of values: ");
        int numberOfValues = Integer.parseInt(input);

        if (numberOfValues <= 0) {

            IO.println("Invalid number of values.");

        } else {

            for (int i = 0; i < numberOfValues; i++) {

                String valueInput = IO.readln("Enter value " + (i + 1) + ": ");
                int value = Integer.parseInt(valueInput);

                stack.push(value);

            }

            int choice;

            do {

                IO.println("\n===== Number Stack Analyzer =====");
                IO.println("1. Add Number");
                IO.println("2. Remove Top Number");
                IO.println("3. View Top Number");
                IO.println("4. Display All Numbers");
                IO.println("5. Analyze Numbers");
                IO.println("6. Exit");

                String choiceInput = IO.readln("Enter your choice: ");
                choice = Integer.parseInt(choiceInput);

                switch (choice) {

                    case 1:

                        String newNumberInput = IO.readln("Enter a new integer: ");
                        int newNumber = Integer.parseInt(newNumberInput);

                        stack.push(newNumber);

                        IO.println("Number added successfully.");
                        break;
                    case 2:

                        if (stack.isEmpty()) {

                            IO.println("Stack is empty.");

                        } else {

                            int removedNumber = stack.pop();

                            IO.println("Removed number: " + removedNumber);

                        }

                        break;

                    case 3:

                        if (stack.isEmpty()) {

                            IO.println("Stack is empty.");

                        } else {

                            IO.println("Top number: " + stack.peek());

                        }

                        break;

                    case 4:
                        IO.println("Display All Numbers");
                        break;

                    case 5:
                        IO.println("Analyze Numbers");
                        break;

                    case 6:
                        IO.println("Exiting program...");
                        break;

                    default:
                        IO.println("Invalid choice.");

                }

            } while (choice != 6);

        }

    }
}