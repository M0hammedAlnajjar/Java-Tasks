import java.util.HashSet;
import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

public class SmartParkingGarage {
    public static void main(String[] args) {

        Queue<String> waitingVehicles = new LinkedList<>();

        Stack<String> parkedVehicles = new Stack<>();

        HashSet<String> licensePlates = new HashSet<>();

        int maximum = 10;

        String license = IO.readln("Enter plate number: ");

        if (licensePlates.contains(license)) {
            System.out.println("Vehicle already exists. License plate must be unique.");
        }
        else {
            // Add new license plate
            licensePlates.add(license);

            // Check parking capacity
            if (parkedVehicles.size() < maximum) {
                parkedVehicles.push(license);
                System.out.println("Vehicle parked successfully.");
            }


        }
}