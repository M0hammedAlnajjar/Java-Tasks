package VehicleRentalDesk;

import java.util.ArrayList;
import java.util.List;

public class VehicleRentalDesk {

    /*
     * Abstraction is provided by the Rentable interface.
     * Encapsulation is provided by private fields and validated setters.
     */

    public static void main(String[] args) {
        new VehicleRentalDesk().run();
    }

    private void run() {

        List<Rentable> vehicles = new ArrayList<>();

        System.out.println(
                "--- Single item created at startup ---"
        );

        Car firstCar = new Car();

        firstCar.setPlateNumber("OM-1234");
        firstCar.setDailyRate(25);
        firstCar.setRentalDays(3);
        firstCar.setSeats(5);

        firstCar.printAllInfo();

        vehicles.add(firstCar);

        boolean exit = false;

        while (!exit) {

            System.out.println("\n--- VEHICLE RENTAL MENU ---");
            System.out.println("1. Add a car");
            System.out.println("2. Add a motorbike");
            System.out.println("3. Print everything on hire");
            System.out.println("4. Show total income");
            System.out.println("5. Exit");

            int choice = Integer.parseInt(
                    IO.readln("Choose: ")
            );

            switch (choice) {

                case 1:
                    vehicles.add(addCar());
                    System.out.println("Added.");
                    break;

                case 2:
                    vehicles.add(addMotorbike());
                    System.out.println("Added.");
                    break;

                case 3:
                    printVehicles(vehicles);
                    break;

                case 4:
                    showTotalIncome(vehicles);
                    break;

                case 5:
                    exit = true;
                    System.out.println("Goodbye.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private Car addCar() {

        Car car = new Car();

        car.setPlateNumber(
                IO.readln("Enter plate number: ")
        );

        car.setDailyRate(
                Double.parseDouble(
                        IO.readln("Enter daily rate: ")
                )
        );

        car.setRentalDays(
                Integer.parseInt(
                        IO.readln("Enter rental days: ")
                )
        );

        car.setSeats(
                Integer.parseInt(
                        IO.readln("Enter seats: ")
                )
        );

        return car;
    }

    private Motorbike addMotorbike() {

        Motorbike motorbike = new Motorbike();

        motorbike.setPlateNumber(
                IO.readln("Enter plate number: ")
        );

        motorbike.setDailyRate(
                Double.parseDouble(
                        IO.readln("Enter daily rate: ")
                )
        );

        motorbike.setRentalDays(
                Integer.parseInt(
                        IO.readln("Enter rental days: ")
                )
        );

        motorbike.setEngineSize(
                Integer.parseInt(
                        IO.readln("Enter engine size: ")
                )
        );

        return motorbike;
    }

    private void printVehicles(
            List<Rentable> vehicles) {

        for (Rentable vehicle : vehicles) {
            vehicle.printAllInfo();
        }
    }

    private void showTotalIncome(
            List<Rentable> vehicles) {

        double total = 0;

        for (Rentable vehicle : vehicles) {

            total += vehicle.costFor(
                    getRentalDays(vehicle)
            );
        }

        System.out.printf(
                "Total income: %.2f OMR%n",
                total
        );
    }

    private int getRentalDays(Rentable vehicle) {

        if (vehicle instanceof Car) {
            return ((Car) vehicle).getRentalDays();
        }

        return ((Motorbike) vehicle).getRentalDays();
    }
}