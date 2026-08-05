public class CheckNum {
    static boolean isEven(int n) {
        // Base cases
        if (n == 0) {
            return true;
        }
        if (n == 1) {
            return false;
        }

        // Recursive case
        return isEven(n - 2);
    }

    static void main(String[] args) {

        IO.println("=== Check if Number is Even ===");

        int number = Integer.parseInt(IO.readln("Enter a number: "));

        IO.println("Is even? " + isEven(number));

    }
}
