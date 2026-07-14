public class NumberReversal {

    public static void main(String[] args) {

        int number=12345;
        int OriginalNumber=number;
        int reversedNumber=0;
        int digit ;


        while (number!=0){
            digit = number % 10;

            reversedNumber =reversedNumber * 10+digit;
            number = number / 10;


            IO.println("Original Number:" + OriginalNumber);
            IO.println("Reversed Number:" + reversedNumber);





        }


    }


}
