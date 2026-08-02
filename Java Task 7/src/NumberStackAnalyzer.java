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

        }

    }
}