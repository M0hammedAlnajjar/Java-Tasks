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

    }

    static void main(String[] args) {

    }
}
