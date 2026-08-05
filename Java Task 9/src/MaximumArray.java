public class MaximumArray{

    static int findMax(int[] numbers, int index) {
        // Base case: last element is the maximum for now
        if (index == numbers.length - 1) {
            return numbers[index];
        }

        // Recursive case
        int maxRest = findMax(numbers, index + 1);

        return Math.max(numbers[index], maxRest);
    }

    public static void main(String[] args) {

        IO.println("=== Find Maximum in an Array ===");

        String input = IO.readln("Enter numbers separated by spaces: ");

        if (input == null || input.isEmpty()) {
            IO.println("Array is empty!");
            return;
        }

        String[] parts = input.split(" ");

        int[] numbers = new int[parts.length];

        // Convert String values to integers
        try {
            for (int i = 0; i < parts.length; i++) {
                numbers[i] = Integer.parseInt(parts[i]);
            }
        } catch (NumberFormatException e) {
            IO.println("Please enter numbers only!");
            return;
        }

        IO.println("Maximum = " + findMax(numbers, 0));
    }
}

