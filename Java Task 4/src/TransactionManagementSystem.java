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


        String newCustomerName = IO.readln("Enter customer name: ");

        String newBalanceInput = IO.readln("Enter initial balance: ");

        double newBalance = Double.parseDouble(newBalanceInput);


        String newAccountType =
                IO.readln("Enter account type (Savings / Current): ");



        boolean validType =
                newAccountType.equalsIgnoreCase("Savings") ||
                        newAccountType.equalsIgnoreCase("Current");



        if(newBalance < 0){

            System.out.println("Error: Balance cannot be negative.");

        }

        else if(!validType){

            System.out.println("Error: Invalid account type.");

        }

        else{


            int newAccountNumber = 10000 + accountNumbers.size() + 1;


            accountNumbers.add(newAccountNumber);
            customerNames.add(newCustomerName);
            balances.add(newBalance);
            accountTypes.add(newAccountType);
            accountStatus.add("Active");


            System.out.println("\nAccount created successfully!");
            System.out.println("Account Number: " + newAccountNumber);

        }

        // 3. Deposit Money System

        System.out.println("\n===== Deposit Money =====");


        String depositInput =
                IO.readln("Enter Account Number: ");

        int depositAccountNumber =
                Integer.parseInt(depositInput);


        boolean depositFound = false;



        for(int i = 0; i < accountNumbers.size(); i++){


            if(accountNumbers.get(i).equals(depositAccountNumber)){


                depositFound = true;


                String amountInput =
                        IO.readln("Enter Deposit Amount: ");

                double depositAmount =
                        Double.parseDouble(amountInput);



                if(depositAmount <= 0){

                    System.out.println("Error: Amount must be greater than zero.");

                }

                else{


                    double updatedBalance =
                            balances.get(i) + depositAmount;


                    balances.set(i, updatedBalance);


                    System.out.println("Deposit successful.");

                    System.out.println("New Balance: "
                            + updatedBalance);

                }


                break;

            }

        }



        if(!depositFound){

            System.out.println("Account not found.");

        }



// 4. Withdraw Money System


        System.out.println("\n===== Withdraw Money =====");


        String withdrawInput =
                IO.readln("Enter Account Number: ");

        int withdrawAccountNumber =
                Integer.parseInt(withdrawInput);



        boolean withdrawFound = false;



        for(int i = 0; i < accountNumbers.size(); i++){


            if(accountNumbers.get(i).equals(withdrawAccountNumber)){


                withdrawFound = true;



                String amountInput =
                        IO.readln("Enter Withdrawal Amount: ");


                double withdrawAmount =
                        Double.parseDouble(amountInput);



                if(withdrawAmount <= 0){

                    System.out.println("Error: Amount must be greater than zero.");

                }

                else if(withdrawAmount > balances.get(i)){


                    System.out.println("Error: Insufficient balance.");

                }

                else{


                    double newBalance =
                            balances.get(i) - withdrawAmount;


                    balances.set(i,newBalance);


                    System.out.println("Withdrawal successful.");

                    System.out.println("Remaining Balance: "
                            + newBalance);

                }


                break;

            }

        }



        if(!withdrawFound){

            System.out.println("Account not found.");

        }



// 5. Transfer Money System


        System.out.println("\n===== Transfer Money =====");


        int senderIndex = -1;
        int receiverIndex = -1;



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




        for(int i = 0; i < accountNumbers.size(); i++){


            if(accountNumbers.get(i).equals(senderAccount)){

                senderIndex = i;

            }


            if(accountNumbers.get(i).equals(receiverAccount)){

                receiverIndex = i;

            }

        }



        if(senderIndex == -1 || receiverIndex == -1){


            System.out.println("Error: Account not found.");

        }


        else if(transferAmount <= 0){


            System.out.println("Error: Invalid amount.");

        }


        else if(balances.get(senderIndex) < transferAmount){


            System.out.println("Error: Insufficient balance.");

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



            System.out.println("Transfer completed successfully.");

            System.out.println(
                    "Sender Balance: "
                            + balances.get(senderIndex)
            );


            System.out.println(
                    "Receiver Balance: "
                            + balances.get(receiverIndex)
            );

        }

