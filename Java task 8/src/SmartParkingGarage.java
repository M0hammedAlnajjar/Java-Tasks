import java.util.HashSet;
import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

public class SmartParkingGarage {
    public static void main(String[] args) {

        // Queue to store waiting vehicles
        Queue<String> waitingVehicles = new LinkedList<>();

        // Stack to store parked vehicles
        Stack<String> parkedVehicles = new Stack<>();

        // HashSet to store unique license plates
        HashSet<String> licensePlates = new HashSet<>();

        // Maximum parking capacity
        int maximum = 10;

        while (true) {

            String license = IO.readln("Enter plate number (or type EXIT to stop): ");

            if (license.equalsIgnoreCase("EXIT")) {
                break;
            }

            // Check if vehicle already exists
            if (licensePlates.contains(license)) {
                System.out.println("Error: Vehicle already exists. License plate must be unique.");
            }
            else {
                // Add unique license plate
                licensePlates.add(license);

                // Check parking capacity
                if (parkedVehicles.size() < maximum) {
                    parkedVehicles.push(license);
                    System.out.println("Vehicle parked successfully.");
                }
                else {
                    waitingVehicles.add(license);
                    System.out.println("Parking full. Vehicle added to waiting queue.");
                }
            }

            System.out.println("Parked vehicles: " + parkedVehicles);
            System.out.println("Waiting vehicles: " + waitingVehicles);
            System.out.println();
        }

        System.out.println("Final parked vehicles: " + parkedVehicles);
        System.out.println("Final waiting vehicles: " + waitingVehicles);
    }
}