public class EvenNumberAnalyzer {

    public static void main(String[] args) {

        // Set the limit value
        int limit = 20;

        // Variables to store count and sum
        int count = 0;
        int sum = 0;

        // Loop from 1 to limit
        for (int i = 1; i <= limit; i++) {


            // Check if the number is even
            if (i % 2 == 0) {

                // Print even number
                System.out.println(i);

                // Increase count of even numbers
                count++;

                // Add even number to total sum
                sum += i;
            }
        }

        // Display total number of even numbers
        System.out.println("Total even numbers: " + count);

        // Display sum of even numbers
        System.out.println("Sum of even numbers: " + sum);
    }
}