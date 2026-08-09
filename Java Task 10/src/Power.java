public class Power {
    static int powerOfNumber(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        int half = power(base, exponent / 2);

        if (exponent % 2 == 0) {
            return half * half;

        }
        else {

            return base * half * half;
        }
    }


    static void main(String[] args) {

        IO.println("=== Raise a Number to a Power ===");
    }
}
