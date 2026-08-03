import java.util.Stack;

public class NumberStackAnalyzer {

    public static void main(String[] args) {

        // Create a stack to store numbers
        Stack<Integer> stack = new Stack<>();

        // Get the number of values from the user
        String input = IO.readln("Enter the number of values: ");
        int numberOfValues = Integer.parseInt(input);

        // Check if the number of values is valid
        if (numberOfValues <= 0) {

            IO.println("Invalid number of values.");

        } else {

            // Add initial numbers into the stack
            for (int i = 0; i < numberOfValues; i++) {

                String valueInput = IO.readln("Enter value " + (i + 1) + ": ");
                int value = Integer.parseInt(valueInput);

                stack.push(value);

            }

            int choice;

            // Display menu until user chooses exit
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

                // Process menu selection using switch-case
                switch (choice) {

                    case 1:

                        // Add a new number to the stack
                        String newNumberInput = IO.readln("Enter a new integer: ");
                        int newNumber = Integer.parseInt(newNumberInput);

                        stack.push(newNumber);

                        IO.println("Number added successfully.");
                        break;


                    case 2:

                        // Remove the top number from the stack
                        if (stack.isEmpty()) {

                            IO.println("Stack is empty.");

                        } else {

                            int removedNumber = stack.pop();

                            IO.println("Removed number: " + removedNumber);

                        }

                        break;


                    case 3:

                        // View the top number without removing it
                        if (stack.isEmpty()) {

                            IO.println("Stack is empty.");

                        } else {

                            IO.println("Top number: " + stack.peek());

                        }

                        break;


                    case 4:

                        // Display all numbers in the stack
                        if (stack.isEmpty()) {

                            IO.println("Stack is empty.");

                        } else {

                            IO.println("\nNumbers in the stack:");

                            for (int number : stack) {

                                IO.println(number);

                            }

                        }

                        break;


                    case 5:

                        // Analyze all numbers in the stack
                        if (stack.isEmpty()) {

                            IO.println("Stack is empty.");

                        } else {

                            // Initialize calculation variables
                            int sum = 0;
                            int evenCount = 0;
                            int oddCount = 0;
                            int positiveCount = 0;
                            int negativeCount = 0;
                            int zeroCount = 0;

                            // Set first number as largest and smallest
                            int largest = stack.get(0);
                            int smallest = stack.get(0);

                            // Loop through stack elements
                            for (int number : stack) {

                                // Calculate total sum
                                sum += number;


                                // Count even and odd numbers
                                if (number % 2 == 0) {

                                    evenCount++;

                                } else {

                                    oddCount++;

                                }


                                // Count positive, negative, and zero values
                                if (number > 0) {

                                    positiveCount++;

                                } else if (number < 0) {

                                    negativeCount++;

                                } else {

                                    zeroCount++;

                                }


                                // Find largest number
                                if (number > largest) {

                                    largest = number;

                                }


                                // Find smallest number
                                if (number < smallest) {

                                    smallest = number;

                                }

                            }

                            // Calculate average
                            double average = (double) sum / stack.size();


                            // Display analysis results
                            IO.println("\n===== Analysis Results =====");
                            IO.println("Total number of elements: " + stack.size());
                            IO.println("Sum of all numbers: " + sum);
                            IO.println("Average of all numbers: " + average);
                            IO.println("Largest number: " + largest);
                            IO.println("Smallest number: " + smallest);
                            IO.println("Total even numbers: " + evenCount);
                            IO.println("Total odd numbers: " + oddCount);
                            IO.println("Total positive numbers: " + positiveCount);
                            IO.println("Total negative numbers: " + negativeCount);
                            IO.println("Total zeros: " + zeroCount);

                        }

                        break;


                    case 6:

                        // Exit the program
                        IO.println("Exiting program...");
                        break;


                    default:

                        // Handle invalid menu choices
                        IO.println("Invalid choice.");

                }

            } while (choice != 6);

        }

    }

}