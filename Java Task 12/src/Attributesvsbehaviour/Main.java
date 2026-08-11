package src.Attributesvsbehaviour;
import java.util.Scanner;

public class Main {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Car car = new Car();
        car.colour = "Red";
        car.plate = "12345";

        car.drive();
        car.brake();

    }
}
