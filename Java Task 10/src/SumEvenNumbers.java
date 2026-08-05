public class SumEvenNumbers {

    public static int sumEven(int n) {
        // Base case: stop when n reaches 0
        if (n == 0) {
            return 0;
        }
        // Check if the current number is even
        if (n % 2 == 0) {
            // Add n and continue with the previous number
            return n + sumEven(n - 1);
        }
        else {

    }
    static void main(String[] args) {

    }
}
