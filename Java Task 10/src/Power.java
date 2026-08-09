public class Power {

    // Recursive method to calculate base raised to exponent
    static int powerOfNumber(int base, int exponent) {

        // Base case: any number raised to the power 0 is 1
        if (exponent == 0) {
            return 1;
        }

        // Calculate power for half of the exponent
        int half = powerOfNumber(base, exponent / 2);

        // If the exponent is even
        if (exponent % 2 == 0) {

            // Square the result
            return half * half;

        } else {

            // If the exponent is odd, multiply by the base once more
            return base * half * half;
        }
    }

    static void main(String[] args) {

        // Display the program title
        IO.println("=== Raise a Number to a Power ===");

        // Ask the user to enter the base
        String baseInput = IO.readln("Enter the base: ");

        // Check that the input is not empty
        if (!baseInput.isEmpty()) {

            // Convert the base from String to integer
            int base = Integer.parseInt(baseInput);

            // Ask the user to enter the exponent
            String exponentInput = IO.readln("Enter the exponent: ");

            // Check that the exponent input is not empty
            if (!exponentInput.isEmpty()) {

                // Convert the exponent from String to integer
                int exponent = Integer.parseInt(exponentInput);

                // Calculate the power using recursion
                int result = powerOfNumber(base, exponent);

                // Display the result
                IO.println("Result: " + result);

            } else {

                // Display a message if the exponent is empty
                IO.println("Exponent cannot be empty.");
            }

        } else {

            // Display a message if the base is empty
            IO.println("Base cannot be empty.");
        }
    }
}

