public class FactorialCalculator {

    public static void main(String[] args) {


        int number = 7;
        long factorial = 1;


        int i = 1;


        while (i <= number) {


            factorial = factorial * i;


            i++;
        }


        System.out.println("Number: " + number);

        System.out.println("Factorial: " + factorial);
    }
}