public class MaximumArray {

    static int findMax(int[] numbers, int index){
        // Base case: last element is the maximum for now
        if (index == numbers.length - 1) {
            return numbers[index];
        }

        // Recursive case: find max of the rest of the array
        int maxRest = findMax(numbers, index + 1);

        return Math.max(numbers[index], maxRest);
    }
    static void main(String[] args) {

    }
}
