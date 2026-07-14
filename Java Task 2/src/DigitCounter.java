public class DigitCounter {
    public static void main(String[] args) {

        var number=12345678;
        var count=0;

        var originalNumber = number;



        while ( number != 0){
            number = number / 10;
            count++;
        }

        IO.println("Number:"+originalNumber);
        IO.println("Number of digits:"+ count);
    }

}
