package ClinicWaitingList;

import java.util.ArrayList;
import java.util.List;

public class ClinicWaitingList {

    /*
     * Abstraction is provided by the Attendable interface.
     * Encapsulation is provided by private fields and validated setters.
     */

    public static void main(String[] args) {
        new ClinicWaitingList().run();
    }

    private void run() {

        List<Attendable> queue = new ArrayList<>();

        System.out.println("--- Single item created at startup ---");

        BookedPatient firstPatient =
                new BookedPatient("09:30");

        firstPatient.setName("Sarah Bennett");
        firstPatient.setAge(150);

        firstPatient.printAllInfo();

        queue.add(firstPatient);

        boolean exit = false;

        while (!exit) {

            System.out.println("\n--- CLINIC MENU ---");
            System.out.println("1. Add booked");
            System.out.println("2. Add walk-in");
            System.out.println("3. Print queue");
            System.out.println("4. Longest wait");
            System.out.println("5. Exit");

            int choice = Integer.parseInt(
                    IO.readln("Choose: ")
            );

            switch (choice) {

                case 1:
                    queue.add(addBooked());
                    System.out.println("Added.");
                    break;

                case 2:
                    queue.add(addWalkIn());
                    System.out.println("Added.");
                    break;

                case 3:
                    printQueue(queue);
                    break;

                case 4:
                    showLongestWait(queue);
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

    private BookedPatient addBooked() {

        String name =
                IO.readln("Enter name: ");

        int age =
                Integer.parseInt(
                        IO.readln("Enter age: ")
                );

        String slotTime =
                IO.readln("Enter slot time: ");

        BookedPatient patient =
                new BookedPatient(slotTime);

        patient.setName(name);
        patient.setAge(age);

        return patient;
    }

    private WalkInVisitor addWalkIn() {

        WalkInVisitor visitor =
                new WalkInVisitor();

        visitor.setName(
                IO.readln("Enter name: ")
        );

        visitor.setAge(
                Integer.parseInt(
                        IO.readln("Enter age: ")
                )
        );

        visitor.setArrivalOrder(
                Integer.parseInt(
                        IO.readln("Enter arrival order: ")
                )
        );

        return visitor;
    }

    private void printQueue(List<Attendable> queue) {

        int number = 1;

        for (Attendable person : queue) {

            System.out.print(number + ". ");
            person.printAllInfo();

            number++;
        }
    }

    private void showLongestWait(List<Attendable> queue) {

        if (queue.isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        Attendable longest = queue.get(0);

        for (Attendable person : queue) {

            if (person.getWaitMinutes()
                    > longest.getWaitMinutes()) {

                longest = person;
            }
        }

        String name;

        if (longest instanceof BookedPatient) {
            name = ((BookedPatient) longest).getName();
        } else {
            name = ((WalkInVisitor) longest).getName();
        }

        System.out.println(
                "Longest wait: " + name +
                        " (" + longest.getWaitMinutes() + " min)"
        );
    }
}