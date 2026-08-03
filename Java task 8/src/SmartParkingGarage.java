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
                    if (!waitingVehicles.isEmpty()) {
                        System.out.println("Next waiting vehicle: "
                                + waitingVehicles.peek());
                    }
                    else {
                        System.out.println("Waiting queue is empty.");
                    }
                    break;


                case 5:
                    if (!parkedVehicles.isEmpty()) {
                        System.out.println("Last parked vehicle: "
                                + parkedVehicles.peek());
                    }
                    else {
                        System.out.println("No parked vehicles.");
                    }
                    break;


                case 6:
                    System.out.println("Waiting Queue: " + waitingVehicles);
                    break;


                case 7:
                    System.out.println("Parked Vehicles: " + parkedVehicles);
                    break;


                case 8:
                    String search = IO.readln("Enter license plate to search: ");

                    if (licensePlates.contains(search)) {
                        System.out.println("Vehicle found: " + search);
                    }
                    else {
                        System.out.println("Vehicle not found.");
                    }
                    break;


                case 9:
                    System.out.println("Garage Statistics:");
                    System.out.println("Parked vehicles: "
                            + parkedVehicles.size());
                    System.out.println("Waiting vehicles: "
                            + waitingVehicles.size());
                    System.out.println("Total vehicles: "
                            + licensePlates.size());
                    System.out.println("Available spaces: "
                            + (maximum - parkedVehicles.size()));
                    break;


                case 10:
                    waitingVehicles.clear();
                    System.out.println("Waiting queue cleared.");
                    break;


                case 11:
                    parkedVehicles.clear();
                    System.out.println("Parking garage cleared.");
                    break;


                case 12:
                    waitingVehicles.clear();
                    parkedVehicles.clear();
                    licensePlates.clear();
                    System.out.println("Entire system reset.");
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