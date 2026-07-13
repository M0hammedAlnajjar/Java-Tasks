public class RectangleCalculator {

    public static void main(String[] args) {

        // Declare and assign rectangle dimensions
        double length = 12.5;
        double width = 8.0;

        // Declare variables for calculations
        double area;
        double perimeter;

        // Calculate rectangle area
        area = length * width;



        // Calculate rectangle perimeter
        perimeter = 2 * (length + width);

        // Display rectangle information
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}