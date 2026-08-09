public class SumEvenIndex {
    static int sumEvenIndex(int[] numbers, int index) {

        if (index >= numbers.length) { return 0; }

        return numbers[index] + sumEvenIndex(numbers, index + 2);

    }

    static void main(String[] args) {


        IO.println("=== Sum of Array Elements at Even Indexes ===");

        String sizeInput = IO.readln("Enter the size of the array: ");
        int size = Integer.parseInt(sizeInput);


        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            String numberInput = IO.readln("Enter element " + i + ": ");
            numbers[i] = Integer.parseInt(numberInput);
        }

        int result = sumEvenIndex(numbers, 0);

        IO.println("Sum of elements at even indexes: " + result);


    }
}
