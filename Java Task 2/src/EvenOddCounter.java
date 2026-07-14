import java.util.Scanner;
public class EvenOddCounter {
    public static void main(String[] args) {

        int start=1;
        int end=10;
//        int evenCount=0;
//        int oddCount=0 ;

        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter numbers evenCount");
        int evenCount = myObj.nextInt();

        System.out.println("Enter numbers evenCount");
        int oddCount = myObj.nextInt();

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even Numbers Count: " + evenCount);
        System.out.println("Odd Numbers Count: " + oddCount);

    }



}
