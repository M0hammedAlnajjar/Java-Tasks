public class PrintNumbers {
    static void printNumbers (int n){
            // Base case
            if (n == 0) {
                return;

    }

        // Print smaller numbers first
        printNumbers(n - 1);

        // Then print current number
        IO.println(n);

    }


    static void main() {
        IO.println("=== Print Numbers from 1 to N ===");

        String input = IO.readln("Enter a positive number: ");
        int number = Integer.parseInt(input);

        if (number <= 0) {
            IO.println("Please enter a positive number!");
        } else {
            IO.println("\nNumbers from 1 to " + number + ":");
            printNumbers(number);
            IO.println("\nProgram finished!");
        }



    }
}
