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

            IO.println("\n========= Smart Parking Garage =========");
            IO.println("1. Add Vehicle to Waiting Queue");
            IO.println("2. Park Next Vehicle");
            IO.println("3. Remove Parked Vehicle");
            IO.println("4. View Next Waiting Vehicle");
            IO.println("5. View Last Parked Vehicle");
            IO.println("6. Display Waiting Queue");
            IO.println("7. Display Parked Vehicles");
            IO.println("8. Search Vehicle");
            IO.println("9. Display Garage Statistics");
            IO.println("10. Clear Waiting Queue");
            IO.println("11. Clear Parking Garage");
            IO.println("12. Reset Entire System");
            IO.println("13. Exit");

            int choice;

            while (true) {
                try {
                    choice = Integer.parseInt(IO.readln("Choose an option: "));
                    break;
                } catch (NumberFormatException e) {
                    IO.println("Error: Please enter a valid number.");
                }
            }


            switch (choice) {

                case 1: {

                    String plate;

                    while (true) {

                        plate = IO.readln("Enter vehicle number: ").trim().toUpperCase();

                        if (plate.isEmpty()) {
                            IO.println("Error: Vehicle number cannot be empty.");
                        }

                        else if (licensePlates.contains(plate)) {
                            IO.println("Error: Vehicle already exists.");
                        }

                        else {

                            waitingVehicles.add(plate);
                            licensePlates.add(plate);

                            IO.println("Vehicle " + plate + " added to waiting queue successfully.");

                            break;
                        }
                    }

                    break;
                }


                case 2:

                    if (waitingVehicles.isEmpty()) {

                        IO.println("No vehicles in waiting queue.");

                    }

                    else if (parkedVehicles.size() >= maximum) {

                        IO.println("Parking garage is full.");

                    }

                    else {

                        String vehicle = waitingVehicles.remove();

                        parkedVehicles.push(vehicle);

                        totalParked++;

                        IO.println("Vehicle parked successfully: " + vehicle);
                    }

                    break;



                case 3:

                    if (parkedVehicles.isEmpty()) {

                        IO.println("No parked vehicles to remove.");

                    }

                    else {

                        String removedVehicle = parkedVehicles.pop();

                        totalDeparted++;

                        licensePlates.remove(removedVehicle);


                        IO.println("Vehicle removed from garage: "
                                + removedVehicle);


                        if (!waitingVehicles.isEmpty()
                                && parkedVehicles.size() < maximum) {

                            String nextVehicle = waitingVehicles.remove();

                            parkedVehicles.push(nextVehicle);


                            IO.println("Next waiting vehicle parked automatically: " + nextVehicle);
                        }
                    }

                    break;



                case 4:

                    if (waitingVehicles.isEmpty()) {

                        IO.println("No vehicles are waiting.");

                    }

                    else {

                        IO.println("Next waiting vehicle: " + waitingVehicles.peek());
                    }

                    break;


                case 5:

                    if (parkedVehicles.isEmpty()) {

                        IO.println("No parked vehicles.");

                    }

                    else {

                        IO.println("Last parked vehicle: " + parkedVehicles.peek());
                    }

                    break;



                case 6:

                    if (waitingVehicles.isEmpty()) {

                        IO.println("No vehicles are waiting.");

                    }

                    else {

                        IO.println("Waiting vehicles: " + waitingVehicles);

                        IO.println("Total waiting vehicles: " + waitingVehicles.size());
                    }

                    break;



                case 7:

                    if (parkedVehicles.isEmpty()) {

                        IO.println("No vehicles are parked.");

                    }

                    else {

                        IO.println("Parked vehicles (Newest to Oldest): " + parkedVehicles);

                        IO.println("Garage Capacity: " + maximum);

                        IO.println("Occupied Spaces: " + parkedVehicles.size());

                        IO.println("Available Spaces: " + (maximum - parkedVehicles.size()));
                    }

                    break;





                case 8:

                    if (waitingVehicles.isEmpty() && parkedVehicles.isEmpty()) {

                        IO.println("System is empty. No vehicles to search.");

                    }

                    else {

                        String searchVehicle = IO.readln("Enter vehicle number to search: ").trim().toUpperCase();


                        if (searchVehicle.isEmpty()) {

                            IO.println("Error: Vehicle number cannot be empty.");

                        }

                        else if (waitingVehicles.contains(searchVehicle)) {

                            IO.println("Vehicle " + searchVehicle + " is waiting in queue.");

                        }

                        else if (parkedVehicles.contains(searchVehicle)) {

                            IO.println("Vehicle " + searchVehicle + " is parked.");

                        }

                        else {

                            IO.println("Vehicle not found.");
                        }
                    }

                    break;



                case 9:

                    int occupancy = (parkedVehicles.size() * 100) / maximum;


                    IO.println("\n========= Garage Statistics =========");

                    IO.println("Maximum Capacity: " + maximum);

                    IO.println("Currently Parked: " + parkedVehicles.size());

                    IO.println("Waiting Vehicles: " + waitingVehicles.size());

                    IO.println("Available Spaces: " + (maximum - parkedVehicles.size()));

                    IO.println("Vehicles Parked Today: " + totalParked);

                    IO.println("Vehicles Departed Today: " + totalDeparted);

                    IO.println("Total Vehicles Processed: " + (totalParked + totalDeparted));

                    IO.println("Occupancy: " + occupancy + "%");

                    break;



                case 10: {

                    String confirm;

                    while (true) {

                        confirm = IO.readln("Clear waiting queue? (Y/N): ").trim();

                        if (confirm.equalsIgnoreCase("Y")
                                || confirm.equalsIgnoreCase("N")) {

                            break;

                        }

                        IO.println("Please enter Y or N.");
                    }


                    if (confirm.equalsIgnoreCase("Y")) {

                        waitingVehicles.clear();

                        IO.println("Waiting queue cleared successfully.");

                    }

                    else {
                        IO.println("Operation cancelled.");
                    }

                    break;
                }



                case 11: {

                    String confirm;

                    while (true) {

                        confirm = IO.readln("Clear parking garage? (Y/N): ").trim();

                        if (confirm.equalsIgnoreCase("Y")
                                || confirm.equalsIgnoreCase("N")) {

                            break;
                        }

                        IO.println("Please enter Y or N.");
                    }


                    if (confirm.equalsIgnoreCase("Y")) {

                        parkedVehicles.clear();

                        IO.println("Parking garage cleared successfully.");

                    }

                    else {

                        IO.println("Operation cancelled.");
                    }

                    break;
                }



                case 12: {

                    String confirm;

                    while (true) {

                        confirm = IO.readln("Reset entire system? (Y/N): ").trim();

                        if (confirm.equalsIgnoreCase("Y")
                                || confirm.equalsIgnoreCase("N")) {

                            break;
                        }

                        IO.println("Please enter Y or N.");
                    }


                    if (confirm.equalsIgnoreCase("Y")) {

                        waitingVehicles.clear();
                        parkedVehicles.clear();
                        licensePlates.clear();

                        totalParked = 0;
                        totalDeparted = 0;


                        IO.println("System successfully reset.");

                    }

                    else {

                        IO.println("Operation cancelled.");
                    }

                    break;
                }



                case 13:

                    IO.println("Thank you for using Smart Parking Garage.");

                    System.exit(0);

                    break;



                default:

                    IO.println("Invalid option. Choose between 1-13.");
            }
        }
    }
}