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

            switch (choice) {

                case 1:
                    password = IO.readln("Enter a new password: ");
                    IO.println("Password saved successfully.");
                    break;

                case 2:
                    IO.println("Total number of characters: " + password.length());

                    if (password.length() < 8) {
                        IO.println("Password is too short.");
                    } else {
                        IO.println("Password length is acceptable.");
                    }
                    break;

                case 3: {

                    int uppercase = 0;
                    int lowercase = 0;
                    int digits = 0;
                    int special = 0;

                    for (int i = 0; i < password.length(); i++) {
                        char ch = password.charAt(i);

                        if (ch >= 'A' && ch <= 'Z') {
                            uppercase++;
                        } else if (ch >= 'a' && ch <= 'z') {
                            lowercase++;
                        } else if (ch >= '0' && ch <= '9') {
                            digits++;
                        } else {
                            special++;
                        }
                    }

                    IO.println("Uppercase letters: " + uppercase);
                    IO.println("Lowercase letters: " + lowercase);
                    IO.println("Digits: " + digits);
                    IO.println("Special characters: " + special);

                    break;
                }

                case 4: {

                    boolean hasUppercase = false;
                    boolean hasLowercase = false;
                    boolean hasDigit = false;
                    boolean hasSpecial = false;

                    for (int i = 0; i < password.length(); i++) {
                        char ch = password.charAt(i);

                        if (ch >= 'A' && ch <= 'Z') {
                            hasUppercase = true;
                        } else if (ch >= 'a' && ch <= 'z') {
                            hasLowercase = true;
                        } else if (ch >= '0' && ch <= '9') {
                            hasDigit = true;
                        } else {
                            hasSpecial = true;
                        }
                    }

                    int score = 0;

                    if (hasUppercase) {
                        score++;
                    }

                    if (hasLowercase) {
                        score++;
                    }

                    if (hasDigit) {
                        score++;
                    }

                    if (hasSpecial) {
                        score++;
                    }

                    if (password.length() >= 8) {
                        score++;
                    }

                    if (score <= 2) {
                        IO.println("Weak Password");
                    } else if (score <= 4) {
                        IO.println("Medium Password");
                    } else {
                        IO.println("Strong Password");
                    }

                    break;
                }

                case 5:

                    IO.println("Uppercase Password: " + password.toUpperCase());
                    IO.println("Lowercase Password: " + password.toLowerCase());

                    break;


                case 6: {

                    int uppercase = 0;
                    int lowercase = 0;
                    int digits = 0;
                    int special = 0;

                    for (int i = 0; i < password.length(); i++) {

                        char ch = password.charAt(i);

                        if (ch >= 'A' && ch <= 'Z') {
                            uppercase++;
                        } else if (ch >= 'a' && ch <= 'z') {
                            lowercase++;
                        } else if (ch >= '0' && ch <= '9') {
                            digits++;
                        } else {
                            special++;
                        }
                    }

                    String strength;

                    int reportScore = 0;

                    if (uppercase > 0) {
                        reportScore++;
                    }

                    if (lowercase > 0) {
                        reportScore++;
                    }

                    if (digits > 0) {
                        reportScore++;
                    }

                    if (special > 0) {
                        reportScore++;
                    }

                    if (password.length() >= 8) {
                        reportScore++;
                    }

                    if (reportScore <= 2) {
                        strength = "Weak Password";
                    } else if (reportScore <= 4) {
                        strength = "Medium Password";
                    } else {
                        strength = "Strong Password";
                    }


                    IO.println("Password Report:");
                    IO.println("Password length: " + password.length());
                    IO.println("First character: " + password.charAt(0));
                    IO.println("Last character: " + password.charAt(password.length() - 1));
                    IO.println("Number of uppercase letters: " + uppercase);
                    IO.println("Number of lowercase letters: " + lowercase);
                    IO.println("Number of digits: " + digits);
                    IO.println("Number of special characters: " + special);
                    IO.println("Password strength level: " + strength);

                    break;
                }

                case 7:
                    IO.println("Exit Password Manager.");
                    break;

                default:
                    IO.println("Invalid choice.");
            }

        } while (choice != 7);

    }
}