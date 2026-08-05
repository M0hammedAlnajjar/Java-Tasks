public class StringReverse {
    public static void printReverse(String str) {
        if (str.isEmpty()) {
            return;

        }
        printReverse(str.substring(1));
    }


    static void main(String[] args) {

    }
}
