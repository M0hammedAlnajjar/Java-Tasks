public class CharacterCount {
    static int countChar(String text, char letter){
        // Base case
        if (text.length() == 0) {
            return 0;
        }

        // Check first character and add result of the rest
        int count = 0;

        if (text.charAt(0) == letter) {
            count = 1;
        }
        // Recursive case
        return count + countChar(text.substring(1), letter);
    }

    static void main(String[] args) {

        IO.println("=== Count a Character in a String ===");



    }
}
