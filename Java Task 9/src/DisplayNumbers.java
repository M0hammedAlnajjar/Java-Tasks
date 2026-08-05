public class DisplayNumbers {
    static void printUp(int n){
        // Base case
        if (n == 0) {
            return;
        }

        // Recursive call
        printUp(n - 1);


        // Print after the recursive call
        IO.println(n);
    }
    static void main(String[] args) {
        IO.println("=== Print Numbers from 1 to N ===");

    }
}
