public class ArrayData {

    static void main() {


        int[] numbers = {45, 12, -5, 90, 33, 12, 0, 67, -20, 88, 45, 100, 7, -3, 55};
        IO.println("Array Elements:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        IO.println("Enter Total number of elements :"+ numbers.length);
        IO.println("Enter First element :" + numbers[0] );
        IO.println("Enter Last element :" + numbers[numbers.length - 1]);


        System.out.println("\nArray Elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + " = " + numbers[i]);
        }

    }
}
