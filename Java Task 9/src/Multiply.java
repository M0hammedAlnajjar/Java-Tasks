public class Multiply {

    static int multiply(int a, int b) {
        // Base case
        if (b == 0) {
            return 0;
        }

        // Recursive case
        return a + multiply(a, b - 1);
    }

    public static void main(String[] args) {

        IO.println("=== Multiply Two Numbers ===");

        int a = Integer.parseInt(IO.readln("Enter first number: "));
        int b = Integer.parseInt(IO.readln("Enter second number: "));

        IO.println("Result = " + multiply(a, b));
    }
}