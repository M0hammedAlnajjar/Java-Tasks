public class Multiply {
    static int multiply(int n) {
        // Base case
        if (n < 10) {
            return 1;

        }

        // Remove the last digit and count it
        return 1 + multiply(n / 10);
    }


    static void main() {
        IO.println("=== Count Digits in a Number ===");

        String input = IO.readln("Enter a positive number: ");
        int number = Integer.parseInt(input);

        if (number <= 0) {
            IO.println("Please enter a positive number!");
        } else {
            int digits = multiply(number);
            IO.println("Number of digits: " + digits);
        }
    }


}
