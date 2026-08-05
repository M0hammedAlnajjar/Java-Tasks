public class MaximumArray {

    static int findMax(int[] numbers, int index){
        // Base case: last element is the maximum for now
        if (index == numbers.length - 1) {
            return numbers[index];
        }

        // Base case: last element is the maximum for now
        int maxRest = findMax(numbers, index + 1);

        return Math.max(numbers[index], maxRest);
    }
    static void main(String[] args) {


        IO.println("=== Find Maximum in an Array ===");
        String input = IO.readln("Enter numbers separated by spaces: ");

        if (input == null || input.isEmpty()) {
            IO.println("Array is empty!");
            return;
        }
        String[] parts = input.split(" ");

    }
}
