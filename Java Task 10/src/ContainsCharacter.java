public class ContainsCharacter {

    // Recursive method to check if a string contains a character
    static boolean contains(String text, char character) {

        // Base case: an empty string contains no characters
        if (text.length() == 0) {
            return false;
        }

        // Check if the first character matches
        if (text.charAt(0) == character) {
            return true;
        }

        // Check the rest of the string recursively
        return contains(text.substring(1), character);
    }

    public static void main(String[] args) {

        // Display the program title
        IO.println("=== Check if a String Contains a Character ===");

        // Ask the user to enter a string
        String text = IO.readln("Enter a string: ");

        // Ask the user to enter a character
        String characterInput = IO.readln("Enter a character: ");

        // Get the first character from the input
        char character = characterInput.charAt(0);

        // Call the recursive method
        boolean result = contains(text, character);

        // Display the result
        IO.println("Contains character: " + result);
    }
}
