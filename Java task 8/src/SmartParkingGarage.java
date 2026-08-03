import java.util.HashSet;
import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

public class SmartParkingGarage {

    public static void main(String[] args) {
        int totalParked = 0;
        int totalDeparted = 0;

        Queue<String> waitingVehicles = new LinkedList<>();
        Stack<String> parkedVehicles = new Stack<>();
        HashSet<String> licensePlates = new HashSet<>();

        int maximum = 10;

        while (true) {

            System.out.println("\n========= Smart Parking Garage =========");
            System.out.println("1. Add Vehicle to Waiting Queue");
            System.out.println("2. Park Next Vehicle");
            System.out.println("3. Remove Parked Vehicle");
            System.out.println("4. View Next Waiting Vehicle");
            System.out.println("5. View Last Parked Vehicle");
            System.out.println("6. Display Waiting Queue");
            System.out.println("7. Display Parked Vehicles");
            System.out.println("8. Search Vehicle");
            System.out.println("9. Display Garage Statistics");
            System.out.println("10. Clear Waiting Queue");
            System.out.println("11. Clear Parking Garage");
            System.out.println("12. Reset Entire System");
            System.out.println("13. Exit");

            int choice = Integer.parseInt(IO.readln("Choose an option: "));

            switch (choice) {
                case 1:
                    String plate;

                    while (true) {
                        plate = IO.readln("Enter vehicle number: ");

                        // Validate empty input
                        if (plate.isEmpty()) {
                            System.out.println("Error: Vehicle number cannot be empty.");
                        }

                        // Validate duplicate vehicle
                        else if (licensePlates.contains(plate)) {
                            System.out.println("Error: Vehicle already exists.");
                        }

                        else {
                            // Add vehicle to waiting queue
                            waitingVehicles.add(plate);
                            licensePlates.add(plate);

                            System.out.println("Vehicle " + plate
                                    + " added to waiting queue successfully.");
                            break;
                        }
                    }
                    break;

                case 2:
                    // Check if waiting queue is empty
                    if (waitingVehicles.isEmpty()) {
                        System.out.println("No vehicles in waiting queue.");
                    }

                    // Check if garage is full
                    else if (parkedVehicles.size() >= maximum) {
                        System.out.println("Parking garage is full.");
                    }

                    else {
                        // Remove first vehicle from waiting queue
                        String vehicle = waitingVehicles.remove();

                        // Push vehicle onto parking stack
                        parkedVehicles.push(vehicle);

                        // Increase total parked counter
                        totalParked++;

                        // Display parked vehicle
                        System.out.println("Vehicle parked successfully: " + vehicle);
                    }
                    break;
                case 3:
                    // Check if parking garage is empty
                    if (parkedVehicles.isEmpty()) {
                        System.out.println("No parked vehicles to remove.");
                    }

                    else {
                        // Remove top vehicle from parking stack
                        String removedVehicle = parkedVehicles.pop();

                        // Increase total departed counter
                        totalDeparted++;

                        // Remove from license plate set
                        licensePlates.remove(removedVehicle);

                        // Display removed vehicle
                        System.out.println("Vehicle removed from garage: "
                                + removedVehicle);

                        // Automatically park next waiting vehicle
                        if (!waitingVehicles.isEmpty()) {

                            String nextVehicle = waitingVehicles.remove();

                            parkedVehicles.push(nextVehicle);

                            System.out.println("Next waiting vehicle parked automatically: "
                                    + nextVehicle);
                        }
                    }
                    break;

                case 4:
                    // Check if waiting queue is empty
                    if (waitingVehicles.isEmpty()) {
                        System.out.println("No vehicles are waiting.");
                    }

                    else {
                        // Display next waiting vehicle without removing it
                        System.out.println("Next waiting vehicle: "
                                + waitingVehicles.peek());
                    }
                    break;
                case 5:
                    // Check if parking stack is empty
                    if (parkedVehicles.isEmpty()) {
                        System.out.println("No parked vehicles.");
                    }

                    else {
                        // Display top vehicle without removing it
                        System.out.println("Last parked vehicle: "
                                + parkedVehicles.peek());
                    }
                    break;
                case 6:
                    // Check if waiting queue is empty
                    if (waitingVehicles.isEmpty()) {
                        System.out.println("No vehicles are waiting.");
                    }

                    else {
                        // Display waiting vehicles
                        System.out.println("Waiting vehicles: " + waitingVehicles);

                        // Display total waiting vehicles
                        System.out.println("Total waiting vehicles: "
                                + waitingVehicles.size());
                    }
                    break;

                case 7:
                    // Check if parking garage is empty
                    if (parkedVehicles.isEmpty()) {
                        System.out.println("No vehicles are parked.");
                    }

                    else {
                        // Display parked vehicles from newest to oldest
                        System.out.println("Parked vehicles (Newest to Oldest): "
                                + parkedVehicles);

                        // Display garage information
                        System.out.println("Garage Capacity : " + maximum);
                        System.out.println("Occupied Spaces : "
                                + parkedVehicles.size());
                        System.out.println("Available Spaces : "
                                + (maximum - parkedVehicles.size()));
                    }
                    break;
                case 8:
                    String searchVehicle = IO.readln("Enter vehicle number to search: ");

                    // Check if vehicle is waiting
                    if (waitingVehicles.contains(searchVehicle)) {
                        System.out.println("Vehicle " + searchVehicle
                                + " is waiting in queue.");
                    }
                    // Check if vehicle is parked
                    else if (parkedVehicles.contains(searchVehicle)) {
                        System.out.println("Vehicle " + searchVehicle
                                + " is parked.");
                    }

                    // Vehicle not found
                    else {
                        System.out.println("Vehicle not found.");
                    }

                    break;

                case 9:
                    int occupancyPercentage =
                            (parkedVehicles.size() * 100) / maximum;

                    System.out.println("\n========= Garage Statistics =========");
                    System.out.println("Maximum Capacity : " + maximum);
                    System.out.println("Currently Parked : "
                            + parkedVehicles.size());
                    System.out.println("Waiting Vehicles : "
                            + waitingVehicles.size());
                    System.out.println("Available Spaces : "
                            + (maximum - parkedVehicles.size()));
                    System.out.println("Vehicles Parked Today : "
                            + totalParked);
                    System.out.println("Vehicles Departed Today : "
                            + totalDeparted);
                    System.out.println("Total Vehicles Processed : "
                            + (totalParked + totalDeparted));
                    System.out.println("Occupancy : "
                            + occupancyPercentage + "%");
                    break;


                case 10:
                    String confirm = IO.readln(
                            "Are you sure you want to clear the waiting queue? (Y/N): "
                    );

                    if (confirm.equalsIgnoreCase("Y")) {

                        waitingVehicles.clear();

                        System.out.println("Waiting queue cleared successfully.");
                    }

                    else {
                        System.out.println("Clear waiting queue cancelled.");
                    }

                    break;


                case 11:
                    String confirm = IO.readln(
                            "Are you sure you want to clear the parking garage? (Y/N): "
                    );

                    if (confirm.equalsIgnoreCase("Y")) {

                        // Remove all parked vehicles
                        parkedVehicles.clear();

                        System.out.println("Parking garage cleared successfully.");
                        System.out.println("Occupied spaces reset to 0.");
                    }

                    else {
                        System.out.println("Clear parking garage cancelled.");
                    }

                    break;
                case 12:
                    String confirm = IO.readln(
                            "Are you sure you want to reset the entire system? (Y/N): "
                    );

                    if (confirm.equalsIgnoreCase("Y")) {

                        // Clear waiting queue
                        waitingVehicles.clear();

                        // Clear parking stack
                        parkedVehicles.clear();

                        // Clear stored vehicle records
                        licensePlates.clear();

                        // Reset statistics
                        totalParked = 0;
                        totalDeparted = 0;

                        System.out.println("System successfully reset.");
                    }

                    else {
                        System.out.println("System reset cancelled.");
                    }

                    break;


                case 13:
                    System.out.println("Exiting Smart Parking Garage...");
                    return;


                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}