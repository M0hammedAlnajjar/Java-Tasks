import java.util.ArrayList;

public class TransactionManagementSystem {

    public static void main(String[] args) {


        // Create Account Data Lists

        ArrayList<Integer> accountNumbers = new ArrayList<>();

        ArrayList<String> customerNames = new ArrayList<>();

        ArrayList<Double> balances = new ArrayList<>();

        ArrayList<String> accountTypes = new ArrayList<>();

        ArrayList<String> accountStatus = new ArrayList<>();



        // Add 10 Customer Accounts


        accountNumbers.add(10001);
        customerNames.add("Ali");
        balances.add(2500.0);
        accountTypes.add("Savings");
        accountStatus.add("Active");



        accountNumbers.add(10002);
        customerNames.add("Ahmed");
        balances.add(5000.0);
        accountTypes.add("Current");
        accountStatus.add("Active");



        accountNumbers.add(10003);
        customerNames.add("Sara");
        balances.add(1200.0);
        accountTypes.add("Savings");
        accountStatus.add("Active");



        accountNumbers.add(10004);
        customerNames.add("Mohammed");
        balances.add(8000.0);
        accountTypes.add("Current");
        accountStatus.add("Active");



        accountNumbers.add(10005);
        customerNames.add("Fatma");
        balances.add(3500.0);
        accountTypes.add("Savings");
        accountStatus.add("Inactive");



        accountNumbers.add(10006);
        customerNames.add("Omar");
        balances.add(1500.0);
        accountTypes.add("Savings");
        accountStatus.add("Active");



        accountNumbers.add(10007);
        customerNames.add("Khalid");
        balances.add(9500.0);
        accountTypes.add("Current");
        accountStatus.add("Active");



        accountNumbers.add(10008);
        customerNames.add("Mariam");
        balances.add(4000.0);
        accountTypes.add("Savings");
        accountStatus.add("Active");



        accountNumbers.add(10009);
        customerNames.add("Hassan");
        balances.add(700.0);
        accountTypes.add("Savings");
        accountStatus.add("Inactive");



        accountNumbers.add(10010);
        customerNames.add("Noor");
        balances.add(6200.0);
        accountTypes.add("Current");
        accountStatus.add("Active");





        // Display Accounts


        System.out.println("===== Bank Accounts =====");



        for(int i = 0; i < accountNumbers.size(); i++){


            System.out.println("\nAccount Index: " + i);

            System.out.println("Account Number: " + accountNumbers.get(i));

            System.out.println("Customer Name: " + customerNames.get(i));

            System.out.println("Balance: " + balances.get(i));

            System.out.println("Account Type: " + accountTypes.get(i));

            System.out.println("Status: " + accountStatus.get(i));

            System.out.println("------------------------");


        }


    }

}