public class CheckSortedArray {

    // Recursive method to check if the array is sorted
    public static boolean isSorted(int[] arr, int index) {

        // Base case: if we reach the last element,
        // the array is sorted
        if (index >= arr.length - 1) {
            return true;
        }

        // If the current element is greater than the next,
        // the array is not sorted
        if (arr[index] > arr[index + 1]) {
            return false;
        }

        // Recursively check the rest of the array
        return isSorted(arr, index + 1);
    }

    public static void main(String[] args) {

        // Display the program title
        IO.println("=== Check if an Array is Sorted ===");

        // Ask the user for the number of elements
        int size = Integer.parseInt(IO.readln("Enter the number of elements: "));

        // Create the array
        int[] arr = new int[size];

        // Read the array elements
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(IO.readln("Enter element " + i + ": "));
        }

        // Display the result (true if sorted, false if not)
        IO.println("Result: " + isSorted(arr, 0));
    }
}