import java.util.ArrayList;
import java.util.List;

public class NumberListStatistics {
    public static void main(String[] args) {


        String valueInput;
        int value;


        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            valueInput = IO.readln("Enter number " + (i + 1) + ": ");
            value = Integer.parseInt(valueInput);
            numbers.add(value);
        }


        int totalSum = 0;
        int evenCount = 0;
        int oddCount = 0;
        int positiveCount = 0;
        int negativeCount = 0;


        int largestNumber = numbers.get(0);
        int smallestNumber = numbers.get(0);


        for (int number : numbers) {


            totalSum += number;


            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }


            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            }


            if (number > largestNumber) {
                largestNumber = number;
            }


            if (number < smallestNumber) {
                smallestNumber = number;
            }
        }


        double average = (double) totalSum / numbers.size();


        IO.println("\nNumbers in the list:");
        for (int number : numbers) {
            IO.println(number);
        }


        IO.println("Number Statistics");
        IO.println("Sum of numbers: " + totalSum);
        IO.println("Average value: " + average);
        IO.println("Largest number: " + largestNumber);
        IO.println("Smallest number: " + smallestNumber);
        IO.println("Count of even numbers: " + evenCount);
        IO.println("Count of odd numbers: " + oddCount);
        IO.println("Count of positive numbers: " + positiveCount);
        IO.println("Count of negative numbers: " + negativeCount);
    }
}