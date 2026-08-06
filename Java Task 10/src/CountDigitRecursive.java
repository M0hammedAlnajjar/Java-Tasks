public class CountDigitRecursive {

    public static int countDigit(int number, int digit) {
        if (number == 0) {
            return (digit == 0) ? 1 : 0;
        }

        if (number < 10) {
            return (number == digit) ? 1 : 0;
        }

        if (number % 10 == digit) {
            return 1 + countDigit(number / 10, digit);
        } else {
            return countDigit(number / 10, digit);
        }
    }

    public static void main(String[] args) {

        IO.println("=== Count Occurrences of a Digit in a Number ===");

        int number = Integer.parseInt(IO.readln("Enter a number: "));
        int digit = Integer.parseInt(IO.readln("Enter the digit to count: "));

        int result = countDigit(number, digit);

        IO.println("The digit " + digit + " appears " + result + " time(s) in the number.");
    }
}