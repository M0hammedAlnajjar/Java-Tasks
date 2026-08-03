import java.util.Queue;
import java.util.LinkedList;
public class TicketQueueManager {

    static void main(String[] args) {

        Queue<String> CustomerNames = new LinkedList<>();

        String  customers =IO.readln("Enter the number of customers : ");
        int number =Integer.parseInt(customers);


        if (number<=0){
            IO.println("Invalid number of customers");
        }else {
            for (int i=0 ; i<number ; i++ ){
            String jobName = IO.readln("Enter customer name  : ");
            CustomerNames.offer(jobName);
                int option;

                do {
                    // Display customer queue menu
                    IO.println("\n----- Customer Queue Menu -----");
                    IO.println("1. Add Customer");
                    IO.println("2. Serve Customer");
                    IO.println("3. View Next Customer");
                    IO.println("4. Search Customer");
                    IO.println("5. Display All Customers");
                    IO.println("6. Display Queue Statistics");
                    IO.println("7. Exit");


                    // Read user's menu choice
                    String choice = IO.readln("Enter your choice: ");
                    option = Integer.parseInt(choice);


                    // Process menu options using switch-case
                    switch (option) {


                        case 1:
                            // Read and add a new customer
                            String newCustomer = IO.readln("Enter customer name: ");

                            // Add customer using add()
                            CustomerNames.add(newCustomer);

                            IO.println("Customer added successfully.");
                            break;

                        case 2:
                            // Check if the queue is empty
                            if (CustomerNames.isEmpty()) {
                                IO.println("Queue is empty.");
                            } else {
                                // Remove the first customer using remove()
                                String servedCustomer = CustomerNames.remove();

                                // Display the served customer
                                IO.println("Served customer: " + servedCustomer);
                            }
                            break;

                        case 3:
                            // Check if the queue is empty
                            if (CustomerNames.isEmpty()) {
                                IO.println("Queue is empty.");
                            } else {
                                // Display the next customer using element()
                                String nextCustomer = CustomerNames.element();

                                IO.println("Next customer: " + nextCustomer);
                            }
                            break;

                        case 4:
                            // Read customer name to search
                            String searchCustomer = IO.readln("Enter customer name to search: ");

                            // Check if customer exists using contains()
                            if (CustomerNames.contains(searchCustomer)) {
                                IO.println("Customer found in queue.");
                            } else {
                                IO.println("Customer not found.");
                            }
                            break;

                        case 5:
                            // Check if the queue is empty
                            if (CustomerNames.isEmpty()) {
                                IO.println("Queue is empty.");
                            } else {
                                // Display all customers using a for-each loop
                                IO.println("All Customers in Queue:");

                                for (String customer : CustomerNames) {
                                    IO.println(customer);
                                }
                            }
                            break;
                        case 6:
                            // Display queue statistics
                            IO.println("\n----- Queue Statistics -----");

                            // Display total number of customers using size()
                            IO.println("Total number of customers: " + CustomerNames.size());

                            // Check if queue is empty
                            if (CustomerNames.isEmpty()) {
                                IO.println("First customer in queue: None");
                                IO.println("Last customer in queue: None");
                            } else {
                                // Display first customer using element()
                                IO.println("First customer in queue: " + CustomerNames.element());

                                // Find and display the last customer
                                String lastCustomer = "";
                                for (String customer : CustomerNames) {
                                    lastCustomer = customer;
                                }

                                IO.println("Last customer in queue: " + lastCustomer);
                            }

                            // Display whether the queue is empty
                            IO.println("Queue is empty: " + CustomerNames.isEmpty());

                            break;

                        case 7:
                            IO.println("Exiting Customer Queue System.");
                            break;

                        default:
                            IO.println("Invalid option. Please try again.");
                    }

                } while (option != 7);
        }
    }
}}
