import java.util.ArrayList;
import java.util.List;

public class BankAccountSystem {

    public static void main(String[] args) {

        // Declare variables
        int choice;
        int accountNumber;

        String customerName;

        double accountBalance;
        double amount;


        // Create lists to store account information
        List<Integer> accountNumbers = new ArrayList<>();
        List<String> customerNames = new ArrayList<>();
        List<Double> accountBalances = new ArrayList<>();


        // Add 10 customer accounts with predefined data

        accountNumbers.add(1001);
        customerNames.add("Mohammed");
        accountBalances.add(5000.0);


        accountNumbers.add(1002);
        customerNames.add("Ahmed");
        accountBalances.add(3500.0);


        accountNumbers.add(1003);
        customerNames.add("Ali");
        accountBalances.add(7000.0);


        accountNumbers.add(1004);
        customerNames.add("Sara");
        accountBalances.add(2500.0);


        accountNumbers.add(1005);
        customerNames.add("Fatima");
        accountBalances.add(9000.0);


        accountNumbers.add(1006);
        customerNames.add("Omar");
        accountBalances.add(1500.0);


        accountNumbers.add(1007);
        customerNames.add("Mona");
        accountBalances.add(4500.0);


        accountNumbers.add(1008);
        customerNames.add("Yousef");
        accountBalances.add(6000.0);


        accountNumbers.add(1009);
        customerNames.add("Laila");
        accountBalances.add(8000.0);


        accountNumbers.add(1010);
        customerNames.add("Khalid");
        accountBalances.add(3000.0);

    }

    // Loop to display menu until user exits
do {

        IO.println("\n===== Bank Account Management System =====");
        IO.println("1: Display all accounts");
        IO.println("2: Deposit money");
        IO.println("3: Withdraw money");
        IO.println("4: Check account balance");
        IO.println("5: Display account statistics");
        IO.println("6: Exit");


        choice = Integer.parseInt(IO.readln("Enter your choice: "));


        // Control menu using switch case
        switch (choice) {


            case 1:

                IO.println("Display accounts selected");

                break;



            case 2:

                IO.println("Deposit money selected");

                break;



            case 3:

                IO.println("Withdraw money selected");

                break;



            case 4:

                IO.println("Check balance selected");

                break;



            case 5:

                IO.println("Display statistics selected");

                break;



            case 6:

                IO.println("Exiting Bank System...");

                break;



            default:

                IO.println("Invalid choice. Please try again.");

        }


    } while (choice != 6);

}