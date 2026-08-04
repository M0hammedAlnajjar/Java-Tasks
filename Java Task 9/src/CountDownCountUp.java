public class CountDownCountUp {

    static void count(int n) {
        if (n == 0) {
            IO.println(n);
            return;
        }
        IO.println(n);

        if (n>1) {
            count(n - 1);
            IO.println(n);

        }
    }
        public static void main(String[] args) {

            String countdown=IO.readln("Enter your number : ");
            int number=Integer.parseInt(countdown);

            count(number);

        }
    }

