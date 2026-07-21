public class ArrayData {

    static void main() {


        int sum=1;
        int max = numbers[0];
        int min = numbers[0];



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

// Loop through the array
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

            if (numbers[i] > max) {
                max = numbers[i];
            }

            if (numbers[i] < min) {
                min = numbers[i];
            }
        }


        double average = (double) sum / numbers.length;

// Display results
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);

    }
}
