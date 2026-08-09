public class SumEvenIndex {

    // Recursive method to add elements at even indexes
    static int sumEvenIndex(int[] numbers, int index) {

        // Base case: index is past the end of the array
        if (index >= numbers.length) {
            return 0;
        }

        // Add the current element and move 2 indexes forward
        return numbers[index] + sumEvenIndex(numbers, index + 2);
    }

    public static void main(String[] args) {

        // Display the program title
        IO.println("=== Sum of Array Elements at Even Indexes ===");

        // Ask the user for the size of the array
        String sizeInput = IO.readln("Enter the size of the array: ");
        int size = Integer.parseInt(sizeInput);

        // Create the array
        int[] numbers = new int[size];

        // Ask the user to enter each element
        for (int i = 0; i < numbers.length; i++) {
            String numberInput = IO.readln("Enter element " + i + ": ");
            numbers[i] = Integer.parseInt(numberInput);
        }

        // Call the recursive method starting at index 0
        int result = sumEvenIndex(numbers, 0);

        // Display the result
        IO.println("Sum of elements at even indexes: " + result);
    }
}
