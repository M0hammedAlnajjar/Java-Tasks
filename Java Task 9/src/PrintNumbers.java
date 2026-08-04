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

    }
}
