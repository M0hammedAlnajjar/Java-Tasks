public class SumoDigits {
    static int sumDigits(Integer n) {
        // Base case
        if (n == 0) {
            return 0;
        }

        // Recursive case
        return (n % 10) + sumDigits(n / 10);
    }

    static void main() {
        IO.println(5);;
        IO.println(123);;
        IO.println(sumDigits(999));
        IO.println(4021);;
    }


}
