public class CheckArraySorted {

    public static boolean isSorted(int[] arr, int index) {
        // Base case: last element reached
        if (index >= arr.length - 1) {
            return true;

            // If current element is greater than the next, array is not sorted
            if (arr[index] > arr[index + 1]) {
                return false;
            }
            // Check the rest of the array
            return isSorted(arr, index + 1);
    }
    static void main(String[] args) {

    }
}
