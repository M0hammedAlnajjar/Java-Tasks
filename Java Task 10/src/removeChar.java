public class removeChar {
    static String removeChar(String str, char ch) {

        if (str.isEmpty()) {
            return "";
        }
        if (str.charAt(0) == ch) {

        }
        return removeChar(str.substring(1), ch);

    }

    static void main(String[] args) {

    }
}
