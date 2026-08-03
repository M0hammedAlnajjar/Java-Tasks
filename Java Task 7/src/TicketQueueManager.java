import java.util.Queue;
import java.util.LinkedList;

public class TicketQueueManager {

    static void main(String[] args) {

        // Create customer queue
        Queue<String> CustomerNames = new LinkedList<>();

        String customers = IO.readln("Enter the number of customers: ");
        int number = Integer.parseInt(customers);

        // Check if number of customers is valid
        if (number <= 0) {
            IO.println("Invalid number of customers");

        } else {

            // Add initial customers
            for (int i = 0; i < number; i++) {
                String customerName = IO.readln("Enter customer name: ");
                CustomerNames.add(customerName);
            }

            int option;

            // Display menu until user exits
            do {

                IO.println("\n----- Customer Queue Menu -----");
                IO.println("1. Add Customer");
                IO.println("2. Serve Customer");
                IO.println("3. View Next Customer");
                IO.println("4. Search Customer");
                IO.println("5. Display All Customers");
                IO.println("6. Display Queue Statistics");
                IO.println("7. Exit");

                String choice = IO.readln("Enter your choice: ");
                option = Integer.parseInt(choice);

                // Process menu selection
                switch (option) {

                    case 1:
                        // Add Customer
                        String newCustomer = IO.readln("Enter customer name: ");
                        CustomerNames.add(newCustomer);
                        IO.println("Customer added successfully.");
                        break;

                    case 2:
                        // Serve Customer
                        if (CustomerNames.isEmpty()) {
                            IO.println("Queue is empty.");
                        } else {
                            String servedCustomer = CustomerNames.remove();
                            IO.println("Served customer: " + servedCustomer);
                        }
                        break;

                    case 3:
                        // View Next Customer
                        if (CustomerNames.isEmpty()) {
                            IO.println("Queue is empty.");
                        } else {
                            IO.println("Next customer: " + CustomerNames.element());
                        }
                        break;

                    case 4:
                        // Search Customer
                        String searchCustomer = IO.readln("Enter customer name to search: ");

                        if (CustomerNames.contains(searchCustomer)) {
                            IO.println("Customer found in queue.");
                        } else {
                            IO.println("Customer not found.");
                        }
                        break;

                    case 5:
                        // Display All Customers
                        if (CustomerNames.isEmpty()) {
                            IO.println("Queue is empty.");
                        } else {
                            IO.println("All Customers in Queue:");

                            for (String customer : CustomerNames) {
                                IO.println(customer);
                            }
                        }
                        break;

                    case 6:
                        // Display Queue Statistics
                        IO.println("\n----- Queue Statistics -----");

                        IO.println("Total number of customers: " + CustomerNames.size());

                        if (CustomerNames.isEmpty()) {
                            IO.println("First customer in queue: None");
                            IO.println("Last customer in queue: None");
                        } else {
                            IO.println("First customer in queue: " + CustomerNames.element());

                            String lastCustomer = "";
                            for (String customer : CustomerNames) {
                                lastCustomer = customer;
                            }

                            IO.println("Last customer in queue: " + lastCustomer);
                        }

                        IO.println("Queue is empty: " + CustomerNames.isEmpty());
                        break;

                    case 7:
                        // Exit program
                        IO.println("Exiting Customer Queue System.");
                        break;

                    default:
                        IO.println("Invalid option. Please try again.");
                }

            } while (option != 7);
        }
    }
}