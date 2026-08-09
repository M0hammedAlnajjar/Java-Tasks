
public class CountZeros {

    // Method to recursively count the zeros in a number
    static int countZeros(int number) {

        // If the number is 0, count it as one zero
        if (number == 0) {
            return 1;
        }

        // If the number is a single non-zero digit, there are no zeros
        if (number < 10) {
            return 0;
        }

        // Get the last digit
        int lastDigit = number % 10;

        // Remove the last digit
        int remainingNumber = number / 10;

        // If the last digit is 0, add 1 and continue recursively
        if (lastDigit == 0) {
            return 1 + countZeros(remainingNumber);
        }

        // If the last digit is not 0, continue checking the remaining number
        return countZeros(remainingNumber);
    }

    public static void main(String[] args) {

        // Display the program title
        IO.println("=== Count Zeros in a Number ===");

        // Ask the user to enter a number
        String numberInput = IO.readln("Enter a number: ");

        // Convert the input from String to int
        int number = Integer.parseInt(numberInput);

        // Call the recursive method
        int result = countZeros(number);

        // Display the number of zeros
        IO.println("Number of zeros: " + result);
    }
}
