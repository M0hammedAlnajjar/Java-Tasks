public class SumoDigits {

    static int sumDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sumDigits(n / 10);
    }

    public static void main(String[] args) {

        IO.println("=== Sum of Digits ===");

        String input = IO.readln("Enter a number: ");
        int number = Integer.parseInt(input);

        IO.println("Sum of digits = " + sumDigits(number));
    }
}