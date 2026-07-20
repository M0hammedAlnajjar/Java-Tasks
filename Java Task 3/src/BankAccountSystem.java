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

}