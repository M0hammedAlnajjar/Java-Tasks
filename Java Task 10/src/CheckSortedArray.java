public class CheckSortedArray {

    public static boolean isSorted(int[] arr, int index) {
        // Base case
        if (index == arr.length - 1) {
            return true;
        }

        // If current element is bigger than next element
        if (arr[index] > arr[index + 1]) {
            return false;
        }
        // Recursive call
        return isSorted(arr, index + 1);
    }




    static void main(String[] args) {

        IO.println("=== Check if an Array is Sorted ===");
        int size = Integer.parseInt(IO.readln("Enter the number of elements: "));
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(IO.readln("Enter element " + i + ": "));
        }

    }
}
