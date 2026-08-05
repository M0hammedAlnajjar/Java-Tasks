public class Vowels {

    static int countVowels(String text) {
        // Base case
        if (text == null || text.length() == 0) {
            return 0;
        }


        // Check first character
        char ch = Character.toLowerCase(text.charAt(0));

        int count = 0;

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            count = 1;
        }
        // Recursive case
        return count + countVowels(text.substring(1));
    }





    static void main(String[] args) {

        IO.println("=== Number of Vowels in a String ===");

        String text = IO.readln("Enter a word: ");


    }
}
