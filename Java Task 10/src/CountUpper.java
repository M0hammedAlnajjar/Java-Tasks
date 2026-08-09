public class CountUpper {
    static int countUpper(String text) {
        if (text.length() == 0) {

            return 0;
        }
        int count = 0;
        if (Character.isUpperCase(text.charAt(0))) {
            count = 1;
        }
        return count + countUpper(text.substring(1));
    }

    static void main(String[] args) {

    }
}
