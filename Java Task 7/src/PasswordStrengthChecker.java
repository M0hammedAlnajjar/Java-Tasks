public class PasswordStrengthChecker {

    public static void main(String[] args) {

        String password = IO.readln("Enter a password using :");

        if (password.length() <= 0) {
            IO.println("Invalid password");
        } else {
            for (int i = 0; i < password.length(); ++i) {
                IO.println("Character " + (i + 1) + ": " + password.charAt(i));
            }
        }

        int choice = 0;
        do {

            IO.println("\n===== Password Manager =====");
            IO.println("1. Enter Password");
            IO.println("2. Check Password Length");
            IO.println("3. Analyze Password Characters");
            IO.println("4. Check Password Strength");
            IO.println("5. Convert Password Format");
            IO.println("6. Display Password Report");
            IO.println("7. Exit");

            choice = Integer.parseInt(IO.readln("Enter your choice: "));


            if (choice == 1) {
                password = IO.readln("Enter a new password: ");
                IO.println("Password saved successfully.");
            }


        } while (choice != 7);
    }
}