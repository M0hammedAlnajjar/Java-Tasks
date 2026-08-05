public class DisplayNumbers {
    static void printUp(int n){
        // Base case
        if (n == 0) {
            return;
        }

        // Recursive call
        printUp(n - 1);
    }
    static void main(String[] args) {

    }
}
