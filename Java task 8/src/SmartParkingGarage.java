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

            int choice;

            // Validate menu input
            while (true) {
                try {
                    choice = Integer.parseInt(IO.readln("Choose an option: "));
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Error: Please enter a valid number.");
                }
            }


            switch (choice) {

                case 1: {

                    String plate;

                    while (true) {

                        plate = IO.readln(
                                "Enter vehicle number: ").trim();

                        if (plate.isEmpty()) {
                            System.out.println(
                                    "Error: Vehicle number cannot be empty.");
                        }

                        else if (licensePlates.contains(plate)) {
                            System.out.println(
                                    "Error: Vehicle already exists.");
                        }

                        else {

                            waitingVehicles.add(plate);
                            licensePlates.add(plate);

                            System.out.println(
                                    "Vehicle " + plate +
                                            " added to waiting queue successfully.");

                            break;
                        }
                    }

                    break;
                }


                case 2:

                    if (waitingVehicles.isEmpty()) {

                        System.out.println(
                                "No vehicles in waiting queue.");

                    }

                    else if (parkedVehicles.size() >= maximum) {

                        System.out.println(
                                "Parking garage is full.");

                    }

                    else {

                        String vehicle =
                                waitingVehicles.remove();

                        parkedVehicles.push(vehicle);

                        totalParked++;

                        System.out.println(
                                "Vehicle parked successfully: "
                                        + vehicle);
                    }

                    break;



                case 3:

                    if (parkedVehicles.isEmpty()) {

                        System.out.println(
                                "No parked vehicles to remove.");

                    }

                    else {

                        String removedVehicle =
                                parkedVehicles.pop();

                        totalDeparted++;

                        licensePlates.remove(removedVehicle);


                        System.out.println(
                                "Vehicle removed from garage: "
                                        + removedVehicle);


                        if (!waitingVehicles.isEmpty()
                                && parkedVehicles.size() < maximum) {

                            String nextVehicle =
                                    waitingVehicles.remove();

                            parkedVehicles.push(nextVehicle);


                            System.out.println(
                                    "Next waiting vehicle parked automatically: "
                                            + nextVehicle);
                        }
                    }

                    break;



                case 4:

                    if (waitingVehicles.isEmpty()) {

                        System.out.println(
                                "No vehicles are waiting.");

                    }

                    else {

                        System.out.println(
                                "Next waiting vehicle: "
                                        + waitingVehicles.peek());
                    }

                    break;



                case 5:

                    if (parkedVehicles.isEmpty()) {

                        System.out.println(
                                "No parked vehicles.");

                    }

                    else {

                        System.out.println(
                                "Last parked vehicle: "
                                        + parkedVehicles.peek());
                    }

                    break;



                case 6:

                    if (waitingVehicles.isEmpty()) {

                        System.out.println(
                                "No vehicles are waiting.");

                    }

                    else {

                        System.out.println(
                                "Waiting vehicles: "
                                        + waitingVehicles);

                        System.out.println(
                                "Total waiting vehicles: "
                                        + waitingVehicles.size());
                    }

                    break;



                case 7:

                    if (parkedVehicles.isEmpty()) {

                        System.out.println(
                                "No vehicles are parked.");

                    }

                    else {

                        System.out.println(
                                "Parked vehicles (Newest to Oldest): "
                                        + parkedVehicles);

                        System.out.println(
                                "Garage Capacity: "
                                        + maximum);

                        System.out.println(
                                "Occupied Spaces: "
                                        + parkedVehicles.size());

                        System.out.println(
                                "Available Spaces: "
                                        + (maximum - parkedVehicles.size()));
                    }

                    break;



                case 8:

                    if (waitingVehicles.isEmpty()
                            && parkedVehicles.isEmpty()) {

                        System.out.println(
                                "System is empty. No vehicles to search.");

                    }

                    else {

                        String searchVehicle =
                                IO.readln(
                                                "Enter vehicle number to search: ")
                                        .trim();


                        if (searchVehicle.isEmpty()) {

                            System.out.println(
                                    "Error: Vehicle number cannot be empty.");

                        }

                        else if (waitingVehicles.contains(searchVehicle)) {

                            System.out.println(
                                    "Vehicle " + searchVehicle
                                            + " is waiting in queue.");

                        }

                        else if (parkedVehicles.contains(searchVehicle)) {

                            System.out.println(
                                    "Vehicle " + searchVehicle
                                            + " is parked.");

                        }

                        else {

                            System.out.println(
                                    "Vehicle not found.");
                        }
                    }

                    break;



                case 9:

                    int occupancy =
                            (parkedVehicles.size() * 100)
                                    / maximum;


                    System.out.println(
                            "\n========= Garage Statistics =========");

                    System.out.println(
                            "Maximum Capacity: "
                                    + maximum);

                    System.out.println(
                            "Currently Parked: "
                                    + parkedVehicles.size());

                    System.out.println(
                            "Waiting Vehicles: "
                                    + waitingVehicles.size());

                    System.out.println(
                            "Available Spaces: "
                                    + (maximum - parkedVehicles.size()));

                    System.out.println(
                            "Vehicles Parked Today: "
                                    + totalParked);

                    System.out.println(
                            "Vehicles Departed Today: "
                                    + totalDeparted);

                    System.out.println(
                            "Total Vehicles Processed: "
                                    + (totalParked + totalDeparted));

                    System.out.println(
                            "Occupancy: "
                                    + occupancy + "%");

                    break;



                case 10: {

                    String confirm;

                    while (true) {

                        confirm = IO.readln(
                                        "Clear waiting queue? (Y/N): ")
                                .trim();

                        if (confirm.equalsIgnoreCase("Y")
                                || confirm.equalsIgnoreCase("N")) {

                            break;

                        }

                        System.out.println(
                                "Please enter Y or N.");
                    }


                    if (confirm.equalsIgnoreCase("Y")) {

                        waitingVehicles.clear();

                        System.out.println(
                                "Waiting queue cleared successfully.");

                    }

                    else {

                        System.out.println(
                                "Operation cancelled.");
                    }

                    break;
                }



                case 11: {

                    String confirm;

                    while (true) {

                        confirm = IO.readln(
                                        "Clear parking garage? (Y/N): ")
                                .trim();

                        if (confirm.equalsIgnoreCase("Y")
                                || confirm.equalsIgnoreCase("N")) {

                            break;
                        }

                        System.out.println(
                                "Please enter Y or N.");
                    }


                    if (confirm.equalsIgnoreCase("Y")) {

                        parkedVehicles.clear();

                        System.out.println(
                                "Parking garage cleared successfully.");

                    }

                    else {

                        System.out.println(
                                "Operation cancelled.");
                    }

                    break;
                }



                case 12: {

                    String confirm;

                    while (true) {

                        confirm = IO.readln(
                                        "Reset entire system? (Y/N): ")
                                .trim();

                        if (confirm.equalsIgnoreCase("Y")
                                || confirm.equalsIgnoreCase("N")) {

                            break;
                        }

                        System.out.println(
                                "Please enter Y or N.");
                    }


                    if (confirm.equalsIgnoreCase("Y")) {

                        waitingVehicles.clear();
                        parkedVehicles.clear();
                        licensePlates.clear();

                        totalParked = 0;
                        totalDeparted = 0;


                        System.out.println(
                                "System successfully reset.");

                    }

                    else {

                        System.out.println(
                                "Operation cancelled.");
                    }

                    break;
                }



                case 13:

                    System.out.println(
                            "Thank you for using Smart Parking Garage.");

                    System.exit(0);

                    break;



                default:

                    System.out.println(
                            "Invalid option. Choose between 1-13.");
            }
        }
    }
}