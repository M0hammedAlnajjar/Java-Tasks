import java.util.Scanner;

public class CircleCalculator {
    static void main() {
        double area;
        double circumference;
        double radius=0 ;
        double Pi=1.14;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius: ");
        radius = input.nextDouble();

        if (radius<= 0){
            IO.println(" Invalid radius. Radius must be greater than zero ");
        }
        else {
            area =Pi* radius * radius;
            circumference = 2 * Pi * radius;
        }


    if (radius>5){
        
    }

    }
}
