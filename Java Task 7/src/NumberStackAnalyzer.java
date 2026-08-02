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

                System.out.println("\n===== Number Stack Analyzer =====");
                System.out.println("1. Add Number");
                System.out.println("2. Remove Top Number");
                System.out.println("3. View Top Number");
                System.out.println("4. Display All Numbers");
                System.out.println("5. Analyze Numbers");
                System.out.println("6. Exit");

                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();

                switch (choice) {

                    case 1:
                        System.out.println("Add Number");
                        break;

                    case 2:
                        System.out.println("Remove Top Number");
                        break;

                    case 3:
                        System.out.println("View Top Number");
                        break;

                    case 4:
                        System.out.println("Display All Numbers");
                        break;

                    case 5:
                        System.out.println("Analyze Numbers");
                        break;

                    case 6:
                        System.out.println("Exiting program...");
                        break;

                    default:
                        System.out.println("Invalid choice.");

                }

            } while (choice != 6);

        }

    }
}