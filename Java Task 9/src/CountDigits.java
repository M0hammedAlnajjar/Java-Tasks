public class CountDigits {
    static int countDigits(int n) {
        // Base case
        if (n < 10) {
            return 1;

    }

        // Count one digit + count the remaining digits
        return 1 + countDigits(n / 10);
    }

    static void main(String[] args) {
        IO.println("=== Count Digits in a Number ===");

        String input = IO.readln("Enter a positive number: ");
        int number = Integer.parseInt(input);

    }

}