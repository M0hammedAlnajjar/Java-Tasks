import java.util.ArrayList;

public class TransactionManagementSystem {

    public static void main(String[] args) {


        ArrayList<Integer> accountNumbers = new ArrayList<>();
        ArrayList<String> customerNames = new ArrayList<>();
        ArrayList<Double> balances = new ArrayList<>();
        ArrayList<String> accountTypes = new ArrayList<>();
        ArrayList<String> accountStatus = new ArrayList<>();


        // Initial Accounts

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



        // 1. Display Accounts

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



        // 2. Create New Account

        System.out.println("\n===== Create New Account =====");


        String newCustomerName =
                IO.readln("Enter customer name: ");


        double newBalance =
                Double.parseDouble(
                        IO.readln("Enter initial balance: ")
                );


        String newAccountType =
                IO.readln("Enter account type (Savings / Current): ");



        boolean validType =
                newAccountType.equalsIgnoreCase("Savings") ||
                        newAccountType.equalsIgnoreCase("Current");



        if(newBalance < 0){

            System.out.println(
                    "Error: Balance cannot be negative."
            );

        }

        else if(!validType){

            System.out.println(
                    "Error: Invalid account type."
            );

        }

        else{


            int newAccountNumber =
                    accountNumbers.get(accountNumbers.size()-1) + 1;


            accountNumbers.add(newAccountNumber);
            customerNames.add(newCustomerName);
            balances.add(newBalance);
            accountTypes.add(newAccountType);
            accountStatus.add("Active");


            System.out.println(
                    "Account created successfully!"
            );

            System.out.println(
                    "Account Number: " + newAccountNumber
            );

        }



        // 3. Deposit Money

        System.out.println("\n===== Deposit Money =====");


        int depositAccountNumber =
                Integer.parseInt(
                        IO.readln("Enter Account Number: ")
                );


        boolean depositFound = false;



        for(int i = 0; i < accountNumbers.size(); i++){


            if(accountNumbers.get(i).equals(depositAccountNumber)){


                depositFound = true;


                double depositAmount =
                        Double.parseDouble(
                                IO.readln("Enter Deposit Amount: ")
                        );



                if(depositAmount <= 0){

                    System.out.println(
                            "Error: Amount must be greater than zero."
                    );

                }

                else{


                    balances.set(
                            i,
                            balances.get(i) + depositAmount
                    );


                    System.out.println(
                            "Deposit successful."
                    );

                    System.out.println(
                            "New Balance: " + balances.get(i)
                    );

                }


                break;

            }

        }



        if(!depositFound){

            System.out.println("Account not found.");

        }

        // 4. Withdraw Money

        System.out.println("\n===== Withdraw Money =====");


        int withdrawAccountNumber =
                Integer.parseInt(
                        IO.readln("Enter Account Number: ")
                );


        boolean withdrawFound = false;



        for(int i = 0; i < accountNumbers.size(); i++){


            if(accountNumbers.get(i).equals(withdrawAccountNumber)){


                withdrawFound = true;


                double withdrawAmount =
                        Double.parseDouble(
                                IO.readln("Enter Withdrawal Amount: ")
                        );



                if(withdrawAmount <= 0){

                    System.out.println(
                            "Error: Amount must be greater than zero."
                    );

                }

                else if(withdrawAmount > balances.get(i)){

                    System.out.println(
                            "Error: Insufficient balance."
                    );

                }

                else{


                    balances.set(
                            i,
                            balances.get(i) - withdrawAmount
                    );


                    System.out.println(
                            "Withdrawal successful."
                    );

                    System.out.println(
                            "Remaining Balance: "
                                    + balances.get(i)
                    );

                }


                break;

            }

        }



        if(!withdrawFound){

            System.out.println("Account not found.");

        }




        // 5. Transfer Money

        System.out.println("\n===== Transfer Money =====");


        int senderAccount =
                Integer.parseInt(
                        IO.readln("Enter Sender Account Number: ")
                );


        int receiverAccount =
                Integer.parseInt(
                        IO.readln("Enter Receiver Account Number: ")
                );


        double transferAmount =
                Double.parseDouble(
                        IO.readln("Enter Transfer Amount: ")
                );



        int senderIndex = -1;
        int receiverIndex = -1;



        for(int i = 0; i < accountNumbers.size(); i++){


            if(accountNumbers.get(i).equals(senderAccount)){

                senderIndex = i;

            }


            if(accountNumbers.get(i).equals(receiverAccount)){

                receiverIndex = i;

            }

        }



        if(senderIndex == -1 || receiverIndex == -1){

            System.out.println(
                    "Error: Account not found."
            );

        }

        else if(transferAmount <= 0){

            System.out.println(
                    "Error: Invalid amount."
            );

        }

        else if(balances.get(senderIndex) < transferAmount){

            System.out.println(
                    "Error: Insufficient balance."
            );

        }

        else{


            balances.set(
                    senderIndex,
                    balances.get(senderIndex) - transferAmount
            );


            balances.set(
                    receiverIndex,
                    balances.get(receiverIndex) + transferAmount
            );


            System.out.println(
                    "Transfer completed successfully."
            );


            System.out.println(
                    "Sender Balance: "
                            + balances.get(senderIndex)
            );


            System.out.println(
                    "Receiver Balance: "
                            + balances.get(receiverIndex)
            );

        }




        // 6. Account Search

        System.out.println("\n===== Account Search =====");


        System.out.println("1. Search by Account Number");
        System.out.println("2. Search by Customer Name");


        int searchOption =
                Integer.parseInt(
                        IO.readln("Choose option: ")
                );


        boolean searchFound = false;



        if(searchOption == 1){


            int searchAccountNumber =
                    Integer.parseInt(
                            IO.readln("Enter Account Number: ")
                    );



            for(int i = 0; i < accountNumbers.size(); i++){


                if(accountNumbers.get(i)
                        .equals(searchAccountNumber)){


                    displayAccount(
                            i,
                            accountNumbers,
                            customerNames,
                            balances,
                            accountTypes,
                            accountStatus
                    );


                    searchFound = true;
                    break;

                }

            }


        }


        else if(searchOption == 2){


            String searchName =
                    IO.readln("Enter Customer Name: ");



            for(int i = 0; i < customerNames.size(); i++){


                if(customerNames.get(i)
                        .equalsIgnoreCase(searchName)){


                    displayAccount(
                            i,
                            accountNumbers,
                            customerNames,
                            balances,
                            accountTypes,
                            accountStatus
                    );


                    searchFound = true;
                    break;

                }

            }


        }


        else{

            System.out.println("Invalid option.");

        }



        if(!searchFound){

            System.out.println(
                    "Account not found."
            );

        }




        // 7. Banking Statistics Report


        System.out.println(
                "\n===== Banking Statistics Report ====="
        );


        double totalBalance = 0;


        double highestBalance = balances.get(0);

        double lowestBalance = balances.get(0);



        for(double b : balances){


            totalBalance += b;


            if(b > highestBalance){

                highestBalance = b;

            }


            if(b < lowestBalance){

                lowestBalance = b;

            }

        }



        System.out.println(
                "Total Accounts: " + accountNumbers.size()
        );


        System.out.println(
                "Total Balance: " + totalBalance
        );


        System.out.println(
                "Average Balance: "
                        + totalBalance / accountNumbers.size()
        );


        System.out.println(
                "Highest Balance: " + highestBalance
        );


        System.out.println(
                "Lowest Balance: " + lowestBalance
        );

        // 8. Account Status Analysis


        System.out.println("\n===== Account Status Analysis =====");


        int activeAccounts = 0;
        int inactiveAccounts = 0;
        int suspendedAccounts = 0;
        int closedAccounts = 0;



        for(String s : accountStatus){


            if(s.equalsIgnoreCase("Active")){

                activeAccounts++;

            }

            else if(s.equalsIgnoreCase("Inactive")){

                inactiveAccounts++;

            }

            else if(s.equalsIgnoreCase("Suspended")){

                suspendedAccounts++;

            }

            else if(s.equalsIgnoreCase("Closed")){

                closedAccounts++;

            }

        }



        System.out.println("Active Accounts: " + activeAccounts);
        System.out.println("Inactive Accounts: " + inactiveAccounts);
        System.out.println("Suspended Accounts: " + suspendedAccounts);
        System.out.println("Closed Accounts: " + closedAccounts);




        // 9. Update Account Information


        System.out.println("\n===== Update Account Information =====");


        int updateIndex =
                Integer.parseInt(
                        IO.readln("Enter Account Index: ")
                );



        if(updateIndex >= 0 &&
                updateIndex < accountNumbers.size()){


            String newName =
                    IO.readln("Enter new customer name: ");


            String newType =
                    IO.readln(
                            "Enter new account type (Savings / Current): "
                    );


            String newStatus =
                    IO.readln(
                            "Enter new status (Active / Suspended / Closed): "
                    );



            boolean validNewType =
                    newType.equalsIgnoreCase("Savings") ||
                            newType.equalsIgnoreCase("Current");



            boolean validStatus =
                    newStatus.equalsIgnoreCase("Active") ||
                            newStatus.equalsIgnoreCase("Suspended") ||
                            newStatus.equalsIgnoreCase("Closed");



            if(!validNewType){

                System.out.println("Invalid account type.");

            }

            else if(!validStatus){

                System.out.println("Invalid account status.");

            }

            else{


                customerNames.set(updateIndex,newName);

                accountTypes.set(updateIndex,newType);

                accountStatus.set(updateIndex,newStatus);


                System.out.println(
                        "Account updated successfully."
                );

            }


        }

        else{

            System.out.println("Invalid account index.");

        }





        // 10. Remove Account


        System.out.println("\n===== Remove Account =====");


        int removeIndex =
                Integer.parseInt(
                        IO.readln("Enter Account Index: ")
                );



        if(removeIndex >= 0 &&
                removeIndex < accountNumbers.size()){


            accountNumbers.remove(removeIndex);

            customerNames.remove(removeIndex);

            balances.remove(removeIndex);

            accountTypes.remove(removeIndex);

            accountStatus.remove(removeIndex);



            System.out.println(
                    "Account removed successfully."
            );


        }

        else{

            System.out.println(
                    "Invalid account index."
            );

        }




        // 11. Sorting Accounts


        System.out.println("\n===== Sorting Accounts =====");


        System.out.println("1. Balance Low to High");

        System.out.println("2. Balance High to Low");

        System.out.println("3. Customer Name Alphabetically");



        int sortOption =
                Integer.parseInt(
                        IO.readln("Choose option: ")
                );



        for(int i = 0; i < balances.size()-1; i++){


            for(int j = i+1; j < balances.size(); j++){


                boolean swap = false;



                if(sortOption == 1 &&
                        balances.get(i) > balances.get(j)){


                    swap = true;

                }


                else if(sortOption == 2 &&
                        balances.get(i) < balances.get(j)){


                    swap = true;

                }


                else if(sortOption == 3 &&
                        customerNames.get(i)
                                .compareToIgnoreCase(
                                        customerNames.get(j)
                                ) > 0){


                    swap = true;

                }



                if(swap){


                    int tempNumber =
                            accountNumbers.get(i);

                    accountNumbers.set(
                            i,
                            accountNumbers.get(j)
                    );

                    accountNumbers.set(
                            j,
                            tempNumber
                    );



                    String tempName =
                            customerNames.get(i);

                    customerNames.set(
                            i,
                            customerNames.get(j)
                    );

                    customerNames.set(
                            j,
                            tempName
                    );



                    double tempBalance =
                            balances.get(i);

                    balances.set(
                            i,
                            balances.get(j)
                    );

                    balances.set(
                            j,
                            tempBalance
                    );



                    String tempType =
                            accountTypes.get(i);

                    accountTypes.set(
                            i,
                            accountTypes.get(j)
                    );

                    accountTypes.set(
                            j,
                            tempType
                    );



                    String tempStatus =
                            accountStatus.get(i);

                    accountStatus.set(
                            i,
                            accountStatus.get(j)
                    );

                    accountStatus.set(
                            j,
                            tempStatus
                    );

                }

            }

        }



        System.out.println("\n===== Sorted Accounts =====");


        for(int i = 0; i < accountNumbers.size(); i++){


            displayAccount(
                    i,
                    accountNumbers,
                    customerNames,
                    balances,
                    accountTypes,
                    accountStatus
            );

        }


    }




    // Display Account Method


    public static void displayAccount(
            int i,
            ArrayList<Integer> accountNumbers,
            ArrayList<String> customerNames,
            ArrayList<Double> balances,
            ArrayList<String> accountTypes,
            ArrayList<String> accountStatus){


        System.out.println("\nAccount Index: " + i);

        System.out.println(
                "Account Number: "
                        + accountNumbers.get(i)
        );

        System.out.println(
                "Customer Name: "
                        + customerNames.get(i)
        );

        System.out.println(
                "Balance: "
                        + balances.get(i)
        );

        System.out.println(
                "Account Type: "
                        + accountTypes.get(i)
        );

        System.out.println(
                "Status: "
                        + accountStatus.get(i)
        );

        System.out.println("----------------------");

    }

}