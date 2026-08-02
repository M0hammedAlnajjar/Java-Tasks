public class PasswordStrengthChecker {

    static void main() {

        String password = IO.readln("Enter a password using :");

        if (password.length() <= 0) {
            IO.println("Invalid password");
        } else {
            for (int i = 0; i < password.length(); ++i) {
                IO.println("Character " + (i + 1) + ": " + password.charAt(i));
            }
        }
    }
}