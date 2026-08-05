public class WordPalindrome {

    static boolean isPalindrome(String text){
        // Base case
        if (text.length() <= 1) {
            return true;
        }
        // If first and last characters are different
        if (text.charAt(0) != text.charAt(text.length() - 1)) {
            return false;
        }

    }
    static void main(String[] args) {

    }
}
