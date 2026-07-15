public class TriangleCalculator {
    static void main() {

        double area ;
        double  perimeter;
        String triangleType="";

        String baseInput = IO.readln("Enter the triangle's base: ");
        double base = Double.parseDouble(baseInput);

        String  heightInput= IO.readln("Enter the heightI: ");
        double height = Double.parseDouble(heightInput);

        String   lengths1= IO.readln("Enter the lengths1: ");
        double  side1 = Double.parseDouble(lengths1);

        String   lengths2= IO.readln("Enter the lengths2 : ");
        double  side2 = Double.parseDouble(lengths2);

        String   lengths3= IO.readln("Enter the lengths3: ");
        double  side3 = Double.parseDouble(lengths3);

        area = 0.5 * base * height;
        perimeter = side1 + side2 + side3;

        if ( perimeter<=0){
            IO.println("display Invalid input. All values must be greater than zero");


        }
        else {
            IO.println("Area using the formula");area = (base * height) / 2;
            IO.println(perimeter);
        }

        if (side1==side2 && side2==side3 && side1==side3){
            triangleType = "Equilateral Triangle";
        }
        else if  (side1 == side2 || side1 == side3 || side2 == side3){
            triangleType = " Isosceles Triangle";

        }

        else {
            triangleType = "Scalene Triangle";
        }

        IO.println(" the base" +base);
        IO.println("the height " +height);
        IO.println(" side lengths" + perimeter);
        IO.println("The area " + area);
        IO.println("Triangle Type: " + triangleType);


    }
}
