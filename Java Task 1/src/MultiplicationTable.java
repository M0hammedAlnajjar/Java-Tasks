public class MultiplicationTable {

    public static void main(String[] args) {

        int base = 9;

        // Loop from 1 to 10 and calculate the multiplication result
        for (int i = 1; i <= 10; i++) {

            int result = base * i;

            // Print the multiplication expression and result
            System.out.println(base + " x " + i + " = " + result);
        }
    }
}