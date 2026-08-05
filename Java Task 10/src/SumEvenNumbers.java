public class SumEvenNumbers {

    // Recursive method to calculate sum of even numbers
    public static int sumEven(int n) {

        // Show current step
        IO.println("Checking: " + n);

        // Base case
        if (n == 0) {
            IO.println("Reached 0, return 0");
            return 0;
        }

        // If n is even
        if (n % 2 == 0) {
            IO.println(n + " is even, add it");
            return n + sumEven(n - 1);
        }

        // If n is odd
        else {
            IO.println(n + " is odd, skip it");
            return sumEven(n - 1);
        }
    }

    public static void main(String[] args) {

        IO.println("=== Sum of Even Numbers from 1 to N ===");

        int n = Integer.parseInt(IO.readln("Enter a number: "));

        int result = sumEven(n);

        IO.println("Final result: " + result);
    }
}