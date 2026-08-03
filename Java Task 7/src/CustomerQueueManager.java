import java.util.Queue;
import java.util.LinkedList;

public class CustomerQueueManager {

    public static void main(String[] args) {

        // Create a queue to store customer names
        Queue<String> customerQueue = new LinkedList<>();

        // Get the number of initial customers
        String customers = IO.readln("Enter the number of customers: ");
        int number = Integer.parseInt(customers);

        // Check if the number of customers is valid
        if (number <= 0) {

            IO.println("Invalid number of customers.");

        } else {

            // Add initial customers into the queue
            for (int i = 0; i < number; i++) {

                String name = IO.readln("Enter customer name: ");
                customerQueue.offer(name);
            }
        }


        int option;

        // Repeat menu until the user chooses exit
        do {

            // Display menu options
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


            // Use switch-case to process user's choice
            switch (option) {


                // Add a new customer to the queue
                case 1:

                    String name = IO.readln("Enter customer name: ");
                    customerQueue.offer(name);

                    IO.println("Customer added successfully.");

                    break;



                // Serve and remove the first customer
                case 2:

                    if (customerQueue.isEmpty()) {

                        IO.println("No customers in the queue.");

                    } else {

                        String servedCustomer = customerQueue.poll();

                        IO.println("Served Customer: " + servedCustomer);
                    }

                    break;



                // View the next customer without removing
                case 3:

                    if (customerQueue.isEmpty()) {

                        IO.println("No customers in the queue.");

                    } else {

                        IO.println("Next Customer: " + customerQueue.peek());
                    }

                    break;



                // Search for a customer in the queue
                case 4:

                    String search = IO.readln("Enter customer name to search: ");

                    if (customerQueue.contains(search)) {

                        IO.println("Customer found.");

                    } else {

                        IO.println("Customer not found.");
                    }

                    break;



                // Display all customers in the queue
                case 5:

                    if (customerQueue.isEmpty()) {

                        IO.println("No customers in the queue.");

                    } else {

                        IO.println("\nCustomers in Queue:");

                        for (String customer : customerQueue) {

                            IO.println(customer);
                        }
                    }

                    break;



                // Display queue statistics
                case 6:

                    IO.println("\n----- Queue Statistics -----");

                    IO.println("Total number of customers: "
                            + customerQueue.size());


                    if (customerQueue.isEmpty()) {

                        IO.println("First customer in the queue: None");
                        IO.println("Last customer in the queue: None");

                    } else {

                        IO.println("First customer in the queue: "
                                + customerQueue.peek());


                        String lastCustomer = "";

                        // Find the last customer in the queue
                        for (String customer : customerQueue) {

                            lastCustomer = customer;
                        }


                        IO.println("Last customer in the queue: "
                                + lastCustomer);
                    }


                    IO.println("Queue is empty: "
                            + customerQueue.isEmpty());

                    break;



                // Exit the program
                case 7:

                    IO.println("Exiting program...");

                    break;



                // Handle invalid choices
                default:

                    IO.println("Invalid option. Please try again.");
            }


        } while (option != 7);

    }
}