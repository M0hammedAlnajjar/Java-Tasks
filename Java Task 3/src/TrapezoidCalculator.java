public class TrapezoidCalculator {

    static void main() {

        double area;
        double perimeter;


        String lengthsInput = IO.readln("enter the lengths  : ");
        double bases1= Double.parseDouble(lengthsInput);


        String lengthsInput2 = IO.readln("enter the lengths  : ");
        double bases2 = Double.parseDouble(lengthsInput2);


        String  heightInput = IO.readln("enter the height  : ");
        double  height = Double.parseDouble( heightInput);


        String  legsInput = IO.readln("enter the legs 1  : ");
        double  legs = Double.parseDouble( legsInput);


        String  legsInput2 = IO.readln("enter the legs 2  : ");
        double  legs2 = Double.parseDouble( legsInput2);



        if (bases1 > 0 && bases2 > 0 && height > 0 && legs > 0 && legs2 > 0) {
            System.out.println("Valid input.");
        } else {
            System.out.println("Invalid input.");
            return;
        }


        if (bases1 <= 0 || bases2 <= 0 || height <= 0 || legs <= 0 || legs2 <= 0) {
            IO.println("Invalid input. All measurements must be greater than zero.");
        } else {
            area = ((bases1 + bases2) * height) / 2;
             perimeter = bases1 + bases2 + legs + legs2;

            IO.println("Area = " +area);
            IO.println("Perimeter = "+perimeter);
        }

    }
}
