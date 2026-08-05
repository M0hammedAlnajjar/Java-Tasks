public class StringReverse {
    public static void printReverse(String str) {
        if (str.isEmpty()) {
            return;

        }
        printReverse(str.substring(1));

        IO.println(str.charAt(0));
    }


    static void main(String[] args) {
        IO.println("=== Print String in Reverse ===");


    }
}
