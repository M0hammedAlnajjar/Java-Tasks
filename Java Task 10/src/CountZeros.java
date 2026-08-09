public class CountZeros {
    static int countZeros(int number) {

        if (number == 0) {
            return 1;
        }

        if (number < 10) { return 0; }

        int lastDigit = number % 10;

        int remainingNumber = number / 10;

        if (lastDigit == 0) { return 1 + countZeros(remainingNumber); }


        return lastDigit;
    }
}

    static void main(String[] args) {

        IO.println("=== Count Zeros in a Number ===");

        String numberInput = IO.readln("Enter a number: ");

    }
}
