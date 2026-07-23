import java.util.Arrays;

public class ArrayData {

    public static void main(String[] args) {

        // Create and initialize array
        int[] numbers = {45, 12, -5, 90, 33, 12, 0, 67, -20, 88, 45, 100, 7, -3, 55};

        // Copy original array
        int[] originalArray = Arrays.copyOf(numbers, numbers.length);


        // Variables
        int sum = 0;
        int max = numbers[0];
        int min = numbers[0];

        int positive = 0;
        int negative = 0;
        int zero = 0;
        int even = 0;
        int odd = 0;


        // 1. Display Array
        IO.println("Array Elements:");

        for (int i = 0; i < numbers.length; i++) IO.println(numbers[i] + " ");


        // 2. Display Array Information
        IO.println("\n\nTotal number of elements: " + numbers.length);
        IO.println("First element: " + numbers[0]);
        IO.println("Last element: " + numbers[numbers.length - 1]);


        System.out.println("\nElements with indexes:");

        for (int i = 0; i < numbers.length; i++) {
            IO.println("Index " + i + " = " + numbers[i]);
        }



        // 3. Array Statistics
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


        IO.println("\nStatistics:");
        IO.println("Sum = " + sum);
        IO.println("Average = %.2f%n", average);
        IO.println("Maximum = " + max);
        IO.println("Minimum = " + min);



        // 4. Number Classification
        for (int number : numbers) {

            if (number > 0) {
                positive++;
            } else if (number < 0) {
                negative++;
            } else {
                zero++;
            }


            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }


        System.out.println("\nClassification:");
        System.out.println("Positive Numbers: " + positive);
        System.out.println("Negative Numbers: " + negative);
        System.out.println("Zeros: " + zero);
        System.out.println("Even Numbers: " + even);
        System.out.println("Odd Numbers: " + odd);



        // 5. Search System
        String searchInput = IO.readln("\nEnter number to search: ");
        int search = Integer.parseInt(searchInput);

        int firstIndex = -1;
        int count = 0;


        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == search) {

                if (firstIndex == -1) {
                    firstIndex = i;
                }

                count++;
            }
        }


        if (count > 0) {

            System.out.println("Number found.");
            System.out.println("First index: " + firstIndex);
            System.out.println("Occurrences: " + count);

        } else {

            IO.println("Number not found.");
        }



        // 6. Update Array
        String indexInput = IO.readln("\nEnter index: ");
        int index = Integer.parseInt(indexInput);

        String valueInput = IO.readln("Enter new value: ");
        int newValue = Integer.parseInt(valueInput);


        if (index >= 0 && index < numbers.length) {

            numbers[index] = newValue;

            System.out.println("Updated Array:");

            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i] + " ");
            }

        } else {

            System.out.println("Invalid index.");
        }



        // 7. Reverse Array

        IO.println("\n\nOriginal Array:");

        for (int i = 0; i < originalArray.length; i++) {
            IO.println(originalArray[i] + " ");
        }

        IO.println("\nReverse Array:");

        for (int i = originalArray.length - 1; i >= 0; i--) {
            IO.println(originalArray[i] + " ");
        }



        // 8. Sorting and Comparison

        int[] sortedArray = Arrays.copyOf(originalArray, originalArray.length);

        Arrays.sort(sortedArray);


        IO.println("\n\nSorted Array:");

        for (int i = 0; i < sortedArray.length; i++) {
            IO.println(sortedArray[i] + " ");
        }


        IO.println("\nSmallest value: " + sortedArray[0]);
        IO.println("Largest value: " + sortedArray[sortedArray.length - 1]);



        // Original array remains unchanged

        IO.println("\nOriginal Array (unchanged):");

        for (int i = 0; i < originalArray.length; i++) {
            IO.println(originalArray[i] + " ");
        }

    }
}