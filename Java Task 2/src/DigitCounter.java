public class DigitCounter {
    public static void main(String[] args) {

        var number=123456;
        var count=0;

        var originalNumber = number;



        for(number=123456; number != 0; number = number / 10){

            count++;
        }

        IO.println("Number:"+originalNumber);
        IO.println("Number of digits:"+ count);
    }

}
