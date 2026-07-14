public class ArmstrongNumberChecker {

    public static void main(String[] args) {

        int number = 153;
        int originalNumber = number;
        int digit;
        int sum = 0;
        int count = 0;


        int temp = number;
        while (temp > 0) {
            count++;
            temp = temp / 10;
        }


        number = originalNumber;

        while (number > 0) {


            digit = number % 10;

            int power = 1;


            for (int i = 1; i <= count; i++) {
                power = power * digit;
            }


            sum = sum + power;

            number = number / 10;
        }

        System.out.println("Number: " + originalNumber);

        if (sum == originalNumber) {
            System.out.println("The number is an Armstrong number.");
        } else {
            System.out.println("The number is not an Armstrong number.");
        }
    }
}