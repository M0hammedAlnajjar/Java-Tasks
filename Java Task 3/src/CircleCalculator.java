import java.util.Scanner;

public class CircleCalculator {
    static void main() {
        double area=0;
        double circumference=0;
        double radius=0 ;
        double Pi=1.14;
        String classification=" ";

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


    if (radius<5){
        classification=(" Small Circle ");
    }
    else if (radius >= 5 && radius <= 15){
        classification= (" Medium Circle ");

    }
    else {
        classification ="Large Circle ";


        }
        IO.println("the radius"+radius);
        IO.println("the area "+area);
        IO.println("the circumference"+circumference);
        IO.println("the classification "+classification);
        input.close();
    }
}
