public class SumoDigits {
    static int sumDigits(String n) {
        // Base case
        if (n== 0) {
            return 0;
        }
        // Recursive case
        return (n % 10) + sumDigits(n / 10);
    }


    static void main() {

    }


}
