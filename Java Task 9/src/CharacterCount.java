public class CharacterCount {

    static int countChar(String text, char letter) {
        // Base case
        if (text == null || text.length() == 0) {
            return 0;
        }

        int count = 0;

        if (text.charAt(0) == letter) {
            count = 1;
        }

        return count + countChar(text.substring(1), letter);
    }

    public static void main(String[] args) {

        IO.println("=== Count a Character in a String ===");

        String text = IO.readln("Enter a word: ");

        if (text == null || text.isEmpty()) {
            IO.println("You must enter a word!");
            return;
        }

        String inputLetter = IO.readln("Enter a letter: ");

        if (inputLetter == null || inputLetter.isEmpty()) {
            IO.println("You must enter a letter!");
            return;
        }

        char letter = inputLetter.charAt(0);

        IO.println("Count = " + countChar(text, letter));
    }
}