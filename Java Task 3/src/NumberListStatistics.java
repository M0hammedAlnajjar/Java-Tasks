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

        IO.println("Numbers in the list: " + numbers);
    }
}