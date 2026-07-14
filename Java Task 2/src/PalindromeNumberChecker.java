public class PalindromeNumberChecker {

    public static void main(String[] args) {
        int number;
        int originalNumber;
        int reversedNumber = 0;
        int digit = 0;

        number = 1221;
        IO.println("Number: " + number);

        originalNumber = number;

        for (number = 1221; number != 0; number = number / 10) {
            digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
        }


        if (reversedNumber == originalNumber) {
            IO.println("The number is a palindrome.");
        } else {
            IO.println("The number is not a palindrome.");
        }
    }
}