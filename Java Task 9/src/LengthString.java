public class LengthString {


    static int Length(String n) {
        // Base case
        if (n.equals("")) {
            return 0;

        }

        // Count one character + the rest of the string
        return 1 + Length(n.substring(1));
    }
    static void main() {

        IO.println("=== Length of a String ===");

    }
}
