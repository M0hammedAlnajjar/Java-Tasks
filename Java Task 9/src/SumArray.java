public class SumArray {

    static int sumArray(int[] numbers, int index){
        // Base case
        if (index == numbers.length) {
            return 0;
        }

        // Recursive case
        return numbers[index] + sumArray(numbers, index + 1);
    }

    static void main(String[] args) {
        IO.println("=== Sum of an Array ===");


    }
}
