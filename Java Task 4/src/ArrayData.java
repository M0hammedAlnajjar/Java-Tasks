public class ArrayData {

    static void main() {


        int sum=1;
        int max = numbers[0];
        int min = numbers[0];


        int positive = 0;
        int negative = 0;
        int zero = 0;
        int even = 0;
        int odd = 0;



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
// Loop through the array
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > 0) {
                positive++;
            } else if (numbers[i] < 0) {
                negative++;
            } else {
                zero++;
            }

            if (numbers[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

// Display results
        System.out.println("Positive Numbers: " + positive);
        System.out.println("Negative Numbers: " + negative);
        System.out.println("Zeros: " + zero);
        System.out.println("Even Numbers: " + even);
        System.out.println("Odd Numbers: " + odd);




        String numberInput = IO.readln("Enter a number: ");
        int search = Integer.parseInt(numberInput);

        int firstIndex = -1;
        int count = 0;

// Search the array
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == search) {
                if (firstIndex == -1) {
                    firstIndex = i;
                }
                count++;
            }
        }

// Display the result
        if (count > 0) {
            System.out.println("Number found.");
            System.out.println("First index: " + firstIndex);
            System.out.println("Occurrences: " + count);
        } else {
            System.out.println("Number not found.");
        }


        // Ask for the index
        String indexInput = IO.readln("Enter index: ");
        int index = Integer.parseInt(indexInput);

// Ask for the new value
        String valueInput = IO.readln("Enter new value: ");
        int newValue = Integer.parseInt(valueInput);

// Update the array
        numbers[index] = newValue;

// Display the updated array
        System.out.println("Updated Array:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        // Display original array
        System.out.println("Original:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

// Display reverse array
        System.out.println("\nReverse:");

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
