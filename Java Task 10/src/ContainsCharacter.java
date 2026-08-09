public class ContainsCharacter {

    static boolean contains(String text, char character) {
        if (text.length() == 0) { return false; }

        if (text.charAt(0) == character) { return true; }

        return contains(text.substring(1), character);
    }
    static void main(String[] args) {

        IO.println("=== Check if a String Contains a Character ===");

        String text = IO.readln("Enter a string: ");

        String characterInput = IO.readln("Enter a character: ");


        char character = characterInput.charAt(0);

        boolean result = contains(text, character);






    }
}
