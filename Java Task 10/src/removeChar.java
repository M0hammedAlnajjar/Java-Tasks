public class removeChar {
    static String removeChar(String str, char ch) {

        // Base case: if the string is empty, return an empty string
        if (str.isEmpty()) {
            return "";
        }

        // Check if the first character is the character to remove
        if (str.charAt(0) == ch) {

            // Skip the first character and continue recursively
            return removeChar(str.substring(1), ch);
        }

        // Keep the first character and process the rest recursively
        return str.charAt(0) + removeChar(str.substring(1), ch);
    }
    static void main(String[] args) {
        IO.println("=== Remove a Character from a String ===");

        String str = IO.readln("Enter a string: ");

        if (!str.isEmpty()) {
            char ch = IO.readln("Enter the character to remove: ").charAt(0);

            String result = removeChar(str, ch);
            IO.println("Result: " + result);

        }
        else {

            // Display a message if the string is empty
            IO.println("String cannot be empty.");
        }
    }


