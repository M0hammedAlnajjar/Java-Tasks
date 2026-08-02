public class PasswordStrengthChecker {

    public static void main(String[] args) {

        String password = IO.readln("Enter a password: ");

        int choice = 0;

        do {

            IO.println("\n===== Password Manager =====");
            IO.println("1. Enter Password");
            IO.println("2. Check Password Length");
            IO.println("3. Analyze Password Characters");
            IO.println("4. Check Password Strength");
            IO.println("5. Convert Password Format and Check String Methods");
            IO.println("6. Display Password Report");
            IO.println("7. Exit");

            choice = Integer.parseInt(IO.readln("Enter your choice: "));


            switch (choice) {


                case 1:

                    password = IO.readln("Enter a new password: ");
                    IO.println("Password saved successfully.");

                    break;



                case 2:

                    IO.println("\nPassword Length Check:");

                    IO.println("Total characters: " + password.length());

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


                    IO.println("\nCharacter Analysis:");
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



                    IO.println("\nPassword Strength:");

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


                    IO.println("\nPassword Format Conversion:");

                    IO.println("Uppercase: " + password.toUpperCase());

                    IO.println("Lowercase: " + password.toLowerCase());



                    IO.println("\nString Method Checks:");



                    if (password.contains("123")) {

                        IO.println("Password contains 123.");

                    } else {

                        IO.println("Password does not contain 123.");
                    }



                    if (password.equals("Password123")) {

                        IO.println("Password matches Password123.");

                    } else {

                        IO.println("Password does not match Password123.");
                    }




                    if (password.startsWith("A")) {

                        IO.println("Password starts with A.");

                    } else {

                        IO.println("Password does not start with A.");
                    }





                    if (password.endsWith("!")) {

                        IO.println("Password ends with !.");

                    } else {

                        IO.println("Password does not end with !.");
                    }



                    break;






                case 6: {


                    if (password.length() == 0) {

                        IO.println("No password entered.");

                        break;
                    }



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

                    int score = 0;



                    if (uppercase > 0) {

                        score++;

                    }

                    if (lowercase > 0) {

                        score++;

                    }

                    if (digits > 0) {

                        score++;

                    }

                    if (special > 0) {

                        score++;

                    }

                    if (password.length() >= 8) {

                        score++;

                    }




                    if (score <= 2) {

                        strength = "Weak Password";

                    } else if (score <= 4) {

                        strength = "Medium Password";

                    } else {

                        strength = "Strong Password";
                    }





                    IO.println("\n===== Password Report =====");

                    IO.println("Password: " + password);

                    IO.println("Length: " + password.length());

                    IO.println("First character: " + password.charAt(0));

                    IO.println("Last character: " + password.charAt(password.length() - 1));

                    IO.println("Uppercase letters: " + uppercase);

                    IO.println("Lowercase letters: " + lowercase);

                    IO.println("Digits: " + digits);

                    IO.println("Special characters: " + special);

                    IO.println("Strength: " + strength);



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