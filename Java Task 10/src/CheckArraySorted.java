public class CheckArraySorted {

    public static boolean isSorted(int[] arr, int index) {
        // Base case
        if (index >= arr.length - 1) {
            return true;
        }

        // If current element is greater than the next, array is not sorted
        if (arr[index] > arr[index + 1]) {
            return false;
        }

        // Recursive call
        return isSorted(arr, index + 1);
    }

    public static void main(String[] args) {

        IO.println("=== Check if an Array is Sorted ===");

        int size = Integer.parseInt(IO.readln("Enter the number of elements: "));
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(IO.readln("Enter element " + (i + 1) + ": "));
        }

        boolean result = isSorted(arr, 0);

        IO.println("Is the array sorted? " + result);
    }
}