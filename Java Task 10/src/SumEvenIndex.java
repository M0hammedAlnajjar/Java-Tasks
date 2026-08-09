public class SumEvenIndex {
    static int sumEvenIndex(int[] numbers, int index) {

        if (index >= numbers.length) { return 0; }

        return numbers[index] + sumEvenIndex(numbers, index + 2);

    }

    static void main(String[] args) {


        IO.println("=== Sum of Array Elements at Even Indexes ===");
    }
}
