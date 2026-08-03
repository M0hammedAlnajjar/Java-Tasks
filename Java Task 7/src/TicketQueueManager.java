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
                            IO.println("Add Customer selected.");
                            break;

                        case 2:
                            IO.println("Serve Customer selected.");
                            break;

                        case 3:
                            IO.println("View Next Customer selected.");
                            break;

                        case 4:
                            IO.println("Search Customer selected.");
                            break;

                        case 5:
                            IO.println("Display All Customers selected.");
                            break;

                        case 6:
                            IO.println("Display Queue Statistics selected.");
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
