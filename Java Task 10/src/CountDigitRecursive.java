public class CountDigitRecursive {
    public static int countDigit(int number, int digit) {
        // Special case: if the number is 0
        if (number == 0) {
            return (digit == 0) ? 1 : 0;

            // Base case
            if (number < 10) {
                return (number == digit) ? 1 : 0;
            }

            // Check the last digit and recurse on the remaining digits
            if (number % 10 == digit) {
                return 1 + countDigit(number / 10, digit);
            } else {
                return countDigit(number / 10, digit);
            }
        }}

    static void main(String[] args) {

            IO.println("=== Count Occurrences of a Digit in a Number ===");

        int number = IO.readInt("Enter a number: ");
        int digit = IO.readInt("Enter the digit to count: ");

        int result = countDigit(number, digit);

        IO.println("The digit " + digit + " appears " + result + " time(s) in the number.");

    }

    }

