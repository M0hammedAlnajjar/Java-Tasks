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


// 2. Display Account Information


        System.out.println("\n===== Account Information =====");



        for (int i = 0; i < accountNumbers.size(); i++) {


            System.out.println("\nAccount Index: " + i);

            System.out.println("Account Number: " + accountNumbers.get(i));

            System.out.println("Customer: " + customerNames.get(i));

            System.out.println("Type: " + accountTypes.get(i));

            System.out.println("Balance: " + balances.get(i));

            System.out.println("Status: " + accountStatus.get(i));

            System.out.println("-----------------------------");


        }


// 3. Create New Account


        System.out.println("\n===== Create New Account =====");



// Ask Customer Name

        String customerName = IO.readln("Enter customer name: ");



// Ask Initial Balance

        String balanceInput = IO.readln("Enter initial balance: ");

        double initialBalance = Double.parseDouble(balanceInput);



// Ask Account Type

        String type = IO.readln("Enter account type (Savings / Current): ");




// Validation

        boolean validType =
                type.equalsIgnoreCase("Savings") ||
                        type.equalsIgnoreCase("Current");



        if (initialBalance < 0) {


            System.out.println("Error: Initial balance cannot be negative.");


        }
        else if (!validType) {


            System.out.println("Error: Account type must be Savings or Current.");


        }
        else {



            // Generate unique account number

            int newAccountNumber = 10000 + accountNumbers.size() + 1;



            // Add new account data

            accountNumbers.add(newAccountNumber);

            customerNames.add(customerName);

            balances.add(initialBalance);

            accountTypes.add(type);

            accountStatus.add("Active");



            System.out.println("\nAccount created successfully!");

            System.out.println("Generated Account Number: " + newAccountNumber);


        }

// 3. Create New Account


        System.out.println("\n===== Create New Account =====");



// Ask Customer Name

        String customerName = IO.readln("Enter customer name: ");



// Ask Initial Balance

        String balanceInput = IO.readln("Enter initial balance: ");

        double initialBalance = Double.parseDouble(balanceInput);



// Ask Account Type

        String type = IO.readln("Enter account type (Savings / Current): ");




// Validation

        boolean validType =
                type.equalsIgnoreCase("Savings") ||
                        type.equalsIgnoreCase("Current");



        if (initialBalance < 0) {


            System.out.println("Error: Initial balance cannot be negative.");


        }
        else if (!validType) {


            System.out.println("Error: Account type must be Savings or Current.");


        }
        else {



            // Generate unique account number

            int newAccountNumber = 10000 + accountNumbers.size() + 1;



            // Add new account data

            accountNumbers.add(newAccountNumber);

            customerNames.add(customerName);

            balances.add(initialBalance);

            accountTypes.add(type);

            accountStatus.add("Active");



            System.out.println("\nAccount created successfully!");

            System.out.println("Generated Account Number: " + newAccountNumber);


        }


// 4. Deposit Money System


        System.out.println("\n===== Deposit Money =====");


// Ask Account Number

        String accountInput = IO.readln("Enter Account Number: ");

        int accountNumber = Integer.parseInt(accountInput);



        boolean foundAccount = false;



// Search Account

        for (int i = 0; i < accountNumbers.size(); i++) {



            if (accountNumbers.get(i) == accountNumber) {


                foundAccount = true;



                // Ask Deposit Amount

                String depositInput = IO.readln("Deposit Amount: ");

                double depositAmount = Double.parseDouble(depositInput);




                // Validation

                if (depositAmount <= 0) {


                    System.out.println("Error: Deposit amount must be greater than zero.");


                }
                else {



                    // Update Balance

                    double newBalance = balances.get(i) + depositAmount;


                    balances.set(i, newBalance);



                    System.out.println("Deposit completed.");

                    System.out.println("New Balance: " + newBalance);


                }


                break;

            }

        }




        if (!foundAccount) {


            System.out.println("Account not found.");


        }

// 5. Withdraw Money System


        System.out.println("\n===== Withdraw Money =====");


// Ask Account Number

        String accountInput = IO.readln("Enter Account Number: ");

        int accountNumber = Integer.parseInt(accountInput);


        boolean foundAccount = false;


// Search Account

        for (int i = 0; i < accountNumbers.size(); i++) {


            if (accountNumbers.get(i) == accountNumber) {


                foundAccount = true;


                // Ask Withdrawal Amount

                String withdrawInput = IO.readln("Withdrawal Amount: ");

                double withdrawAmount = Double.parseDouble(withdrawInput);



                // Validation

                if (withdrawAmount <= 0) {


                    System.out.println("Error: Withdrawal amount must be greater than zero.");


                }
                else if (withdrawAmount > balances.get(i)) {


                    System.out.println("Error: Insufficient balance.");


                }
                else {


                    // Update Balance

                    double remainingBalance = balances.get(i) - withdrawAmount;

                    balances.set(i, remainingBalance);


                    System.out.println("Withdrawal successful.");

                    System.out.println("Remaining Balance: " + remainingBalance);

                }


                break;

            }

        }


// Account Not Found

        if (!foundAccount) {


            System.out.println("Account not found.");

        }










    }

}