public class CountDownCountUp {

    static void count(int n) {
        if (n == 0) {
            // Base case
            IO.println(n);
            return;
        }
        // Count down part
        IO.println("Counting down: " + n);

        // Recursive call
        if (n>1) {
            count(n - 1);

            // Count up part (runs when recursion returns)
            IO.println("Counting up: " + n);

        }
    }
        public static void main(String[] args) {
            IO.println("=== Count Down & Count Up Program ===");

            String countdown=IO.readln("Enter your number : ");
            int number=Integer.parseInt(countdown);

            if (number <= 0) {
                IO.println("Please enter a positive number!");
            } else {
                IO.println("\nStarting count...\n");

                count(number);

                IO.println("\n Finished counting!");
        }
    }
}

