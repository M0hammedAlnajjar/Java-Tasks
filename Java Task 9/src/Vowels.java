public class Vowels {

    static int countVowels(String text) {
        // Base case
        if (text.length() == 0) {
            return 0;
        }

        char ch = Character.toLowerCase(text.charAt(0));

        int count = 0;

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            count = 1;
        }

        return count + countVowels(text.substring(1));
    }

    public static void main(String[] args) {

        IO.println("=== Number of Vowels in a String ===");

        String text = IO.readln("Enter a word: ");

        // Check empty input
        if (text == null || text.isEmpty()) {
            IO.println("Please enter a word!");
            return;
        }

        // Check if input contains numbers
        if (text.matches(".*\\d.*")) {
            IO.println("Numbers are not allowed!");
            return;
        }

        IO.println("Number of vowels = " + countVowels(text));
    }
}