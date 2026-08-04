public class CountDownCountUp {

    static void count(int n) {
        if (n == 1) {
            return;
        }
        IO.println(n);


        count(n - 1);
        IO.println(n);


    }
        public static void main(String[] args) {
            count(3);
        }
    }

