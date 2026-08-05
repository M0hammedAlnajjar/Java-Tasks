public class  PowerFTow {

    static boolean isPowerOfTwo(int n) {
        // Base cases
        if (n == 1) {
            return true;
        }

        if (n == 0 || n % 2 != 0) {
            return false;
        }

        // Recursive case
        return isPowerOfTwo(n / 2);
    }

    public static void main(String[] args) {

        IO.println("=== Power of 2 Check ===");

        int number = Integer.parseInt(IO.readln("Enter a number: "));

        IO.println("Is power of 2 ? " + isPowerOfTwo(number));
    }
}