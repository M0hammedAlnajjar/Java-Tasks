public class CountDigitRecursive {
    public static int countDigit(int number, int digit){
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
    }

    static void main(String[] args) {

    }
}
