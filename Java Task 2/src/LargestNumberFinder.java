import java.util.Scanner;


public class LargestNumberFinder {
    public static void main(String[] args) {

//       int number1=12;
//       int  number2=45;
//       int number3=89;
      int largest=0;

        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter numbers");
        int number1 = myObj.nextInt();

        System.out.println("Enter numbers");
        int number2 = myObj.nextInt();

        System.out.println("Enter numbers");
        int number3 = myObj.nextInt();


        if (number1>number2){
           largest=number1;
           IO.println("this largest"+largest);
       }
       else if (number2>number3){
           largest=number2;
           IO.println("this largest"+largest);
       }

//       else if (number1>number3){
//           largest=number1;
//           IO.println("this largest"+largest);
//       }
//       else if (number2>number1){
//           largest=number2;
//           IO.println("this largest"+largest);
//       }


//       else if (number3>number1){
//           largest=number3;
//           IO.println("this largest"+largest);
//       }

       else{
           largest=number3;
           IO.println("this largest"+largest);
       }


    }
}
