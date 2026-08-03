import java.util.Queue;
import java.util.LinkedList;
public class CustomerQueueManager {

    static void main(String[] args) {

        Queue<String> customerQueue = new LinkedList<>();

        String customers =IO.readln("Enter the number of customers : ");
        int number =Integer.parseInt(customers);

    if (number<=0){
        IO.print(" Invalid number of customers ");

    }else {
        for (int i=0 ; i< number ; i ++ ){
            String name = IO.readln("Enter customer name");
            customerQueue.add(name);
        }
    }

        int option;
        do {
            System.out.println("1. Add Customer");
            System.out.println("2. Serve Customer");
            System.out.println("3. View Next Customer");
            System.out.println("4. Search Customer");
            System.out.println("5. Display All Customers");
            System.out.println("6. Display Queue Statistics");
            System.out.println("7. Exit");

            String choice = IO.readln("Enter your choice");
             option = Integer.parseInt(choice);

            switch (option) {
                case 1:
                    String name = IO.readln("Enter customer name");
                    customerQueue.offer(name);
                    System.out.println("Customer added successfully.");
                    break;


                case 2:
                    if (customerQueue.isEmpty()) {
                        System.out.println("No customers in the queue.");
                    } else {
                        String servedCustomer = customerQueue.poll();
                        System.out.println("Served Customer: " + servedCustomer);
                    }
                    break;
            }




        } while (option != 7);


    }
}
