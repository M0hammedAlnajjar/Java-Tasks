import java.util.ArrayList;
import java.util.Scanner;

public class BookManagementSystem {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        // Create Order Lists

        ArrayList<Integer> orderIds = new ArrayList<>();

        ArrayList<String> customers = new ArrayList<>();

        ArrayList<String> products = new ArrayList<>();

        ArrayList<Integer> quantities = new ArrayList<>();

        ArrayList<Double> prices = new ArrayList<>();

        ArrayList<String> status = new ArrayList<>();



        // Add initial orders

        orderIds.add(1001);
        customers.add("Ali");
        products.add("Laptop");
        quantities.add(2);
        prices.add(750.0);
        status.add("Pending");


        orderIds.add(1002);
        customers.add("Ahmed");
        products.add("Phone");
        quantities.add(1);
        prices.add(500.0);
        status.add("Completed");



        orderIds.add(1003);
        customers.add("Sara");
        products.add("Tablet");
        quantities.add(3);
        prices.add(300.0);
        status.add("Pending");





        // 1. Display Order Information


        System.out.println("===== Order Information =====");


        for (int i = 0; i < orderIds.size(); i++) {


            double totalPrice = quantities.get(i) * prices.get(i);



            System.out.println("\nOrder Index: " + i);

            System.out.println("Order ID: " + orderIds.get(i));

            System.out.println("Customer: " + customers.get(i));

            System.out.println("Product: " + products.get(i));

            System.out.println("Quantity: " + quantities.get(i));

            System.out.println("Price: " + prices.get(i));

            System.out.println("Total: " + totalPrice);

            System.out.println("Status: " + status.get(i));

            System.out.println("--------------------------");


        }




        // 2. Add New Order


        System.out.println("\n===== Add New Order =====");



        int newOrderId = 1000 + orderIds.size() + 1;



        System.out.print("Enter customer name: ");

        String customerName = input.next();



        System.out.print("Enter product name: ");

        String productName = input.next();



        System.out.print("Enter quantity: ");

        int quantity = input.nextInt();



        System.out.print("Enter price: ");

        double price = input.nextDouble();



        System.out.print("Enter order status: ");

        String orderStatus = input.next();





        // Add new order to lists


        orderIds.add(newOrderId);

        customers.add(customerName);

        products.add(productName);

        quantities.add(quantity);

        prices.add(price);

        status.add(orderStatus);





        System.out.println("\nOrder added successfully!");

        System.out.println("New Order ID: " + newOrderId);

        System.out.println("Total Orders: " + orderIds.size());






        // 3. Display Updated Orders


        System.out.println("\n===== Updated Order List =====");


        for (int i = 0; i < orderIds.size(); i++) {


            double totalPrice = quantities.get(i) * prices.get(i);



            System.out.println("\nOrder Index: " + i);

            System.out.println("Order ID: " + orderIds.get(i));

            System.out.println("Customer: " + customers.get(i));

            System.out.println("Product: " + products.get(i));

            System.out.println("Quantity: " + quantities.get(i));

            System.out.println("Price: " + prices.get(i));

            System.out.println("Total: " + totalPrice);

            System.out.println("Status: " + status.get(i));

            System.out.println("--------------------------");


        }



        input.close();


        // 4. Calculate Order Statistics


        System.out.println("\n===== Order Statistics =====");


// Total number of orders

        int totalOrders = orderIds.size();



// Variables for calculations

        double totalSales = 0;

        double highestOrder = prices.get(0) * quantities.get(0);

        double lowestOrder = prices.get(0) * quantities.get(0);




// Calculate sales

        for (int i = 0; i < orderIds.size(); i++) {


            double orderValue = prices.get(i) * quantities.get(i);


            totalSales += orderValue;



            if (orderValue > highestOrder) {

                highestOrder = orderValue;

            }



            if (orderValue < lowestOrder) {

                lowestOrder = orderValue;

            }

        }



// Average using type casting

        double averageOrder = (double) totalSales / totalOrders;




// Display Report

        System.out.println("Total Orders: " + totalOrders);

        System.out.println("Total Sales: " + totalSales);

        System.out.println("Average Order: " + averageOrder);

        System.out.println("Highest Order: " + highestOrder);

        System.out.println("Lowest Order: " + lowestOrder);



        // 5. Order Status Analysis


        System.out.println("\n===== Order Status Analysis =====");


// Counters

        int pendingOrders = 0;

        int completedOrders = 0;

        int cancelledOrders = 0;




// Check order status

        for (int i = 0; i < status.size(); i++) {


            if (status.get(i).equalsIgnoreCase("Pending")) {


                pendingOrders++;


            } else if (status.get(i).equalsIgnoreCase("Completed")) {


                completedOrders++;


            } else if (status.get(i).equalsIgnoreCase("Cancelled")) {


                cancelledOrders++;

            }

        }




// Display Results

        System.out.println("Pending Orders: " + pendingOrders);

        System.out.println("Completed Orders: " + completedOrders);

        System.out.println("Cancelled Orders: " + cancelledOrders);

        // 6. Search Order System


        System.out.println("\n===== Search Order =====");


        System.out.println("1. Search by Order ID");

        System.out.println("2. Search by Customer Name");


        System.out.print("Choose option: ");

        int searchOption = input.nextInt();



        boolean found = false;




// Search by Order ID

        if (searchOption == 1) {


            System.out.print("Enter Order ID: ");

            int searchId = input.nextInt();



            for (int i = 0; i < orderIds.size(); i++) {


                if (orderIds.get(i) == searchId) {


                    double totalPrice = quantities.get(i) * prices.get(i);



                    System.out.println("\nOrder Found:");

                    System.out.println("Order Index: " + i);

                    System.out.println("Order ID: " + orderIds.get(i));

                    System.out.println("Customer: " + customers.get(i));

                    System.out.println("Product: " + products.get(i));

                    System.out.println("Quantity: " + quantities.get(i));

                    System.out.println("Price: " + prices.get(i));

                    System.out.println("Total Price: " + totalPrice);

                    System.out.println("Status: " + status.get(i));



                    found = true;

                    break;

                }

            }



        }




// Search by Customer Name

        else if (searchOption == 2) {


            System.out.print("Enter Customer Name: ");

            String searchCustomer = input.next();



            for (int i = 0; i < customers.size(); i++) {


                if (customers.get(i).equalsIgnoreCase(searchCustomer)) {


                    double totalPrice = quantities.get(i) * prices.get(i);



                    System.out.println("\nOrder Found:");

                    System.out.println("Order Index: " + i);

                    System.out.println("Order ID: " + orderIds.get(i));

                    System.out.println("Customer: " + customers.get(i));

                    System.out.println("Product: " + products.get(i));

                    System.out.println("Quantity: " + quantities.get(i));

                    System.out.println("Price: " + prices.get(i));

                    System.out.println("Total Price: " + totalPrice);

                    System.out.println("Status: " + status.get(i));



                    found = true;

                    break;

                }

            }



        }




        else {

            System.out.println("Invalid option.");

        }




        if (!found) {

            System.out.println("Order not found.");

        }

        // 7. Update Order System


        System.out.println("\n===== Update Order =====");


// Ask for order index

        System.out.print("Enter order index to update: ");

        int updateIndex = input.nextInt();



// Validate index

        if (updateIndex >= 0 && updateIndex < orderIds.size()) {



            System.out.print("Enter new customer name: ");

            String newCustomer = input.next();



            System.out.print("Enter new product name: ");

            String newProduct = input.next();



            System.out.print("Enter new quantity: ");

            int newQuantity = input.nextInt();



            System.out.print("Enter new price: ");

            double newPrice = input.nextDouble();



            System.out.print("Enter new status: ");

            String newStatus = input.next();




            // Update information


            customers.set(updateIndex, newCustomer);

            products.set(updateIndex, newProduct);

            quantities.set(updateIndex, newQuantity);

            prices.set(updateIndex, newPrice);

            status.set(updateIndex, newStatus);




            // Display Updated Order


            double totalPrice = quantities.get(updateIndex) * prices.get(updateIndex);



            System.out.println("\nOrder Updated Successfully!");



            System.out.println("\n===== Updated Order Details =====");


            System.out.println("Order Index: " + updateIndex);

            System.out.println("Order ID: " + orderIds.get(updateIndex));

            System.out.println("Customer: " + customers.get(updateIndex));

            System.out.println("Product: " + products.get(updateIndex));

            System.out.println("Quantity: " + quantities.get(updateIndex));

            System.out.println("Price: " + prices.get(updateIndex));

            System.out.println("Total Price: " + totalPrice);

            System.out.println("Status: " + status.get(updateIndex));



        } else {


            System.out.println("Invalid order index.");

        }

        // 8. Discount Calculation System


        System.out.println("\n===== Discount Calculation =====");


// Ask for order index

        System.out.print("Enter order index: ");

        int discountIndex = input.nextInt();



// Validate index

        if (discountIndex >= 0 && discountIndex < orderIds.size()) {



            // Calculate original total price

            double originalPrice = quantities.get(discountIndex)
                    * prices.get(discountIndex);



            double discountPercentage = 0;



            // Apply discount rules


            if (originalPrice >= 5000) {


                discountPercentage = 0.15;


            } else if (originalPrice >= 2000) {


                discountPercentage = 0.10;


            } else if (originalPrice >= 1000) {


                discountPercentage = 0.05;


            } else {


                discountPercentage = 0;

            }




            // Calculate discount amount

            double discountAmount = originalPrice * discountPercentage;



            // Calculate final price

            double finalPrice = originalPrice - discountAmount;





            // Display Result


            System.out.println("\n===== Discount Report =====");


            System.out.println("Original Price: " + originalPrice);


            System.out.println("Discount Percentage: "
                    + (discountPercentage * 100) + "%");


            System.out.println("Discount Amount: " + discountAmount);


            System.out.println("Final Price: " + finalPrice);




        } else {


            System.out.println("Invalid order index.");

        }

        // 9. Remove Order System


        System.out.println("\n===== Remove Order =====");


// Ask for order index

        System.out.print("Enter order index to remove: ");

        int removeIndex = input.nextInt();



// Validate index

        if (removeIndex >= 0 && removeIndex < orderIds.size()) {



            // Remove related data from all ArrayLists


            orderIds.remove(removeIndex);

            customers.remove(removeIndex);

            products.remove(removeIndex);

            quantities.remove(removeIndex);

            prices.remove(removeIndex);

            status.remove(removeIndex);




            System.out.println("Order removed successfully!");



        } else {


            System.out.println("Invalid order index.");

        }





// Display Updated Order List


        System.out.println("\n===== Updated Order List =====");



        if (orderIds.size() == 0) {


            System.out.println("No orders available.");


        } else {



            for (int i = 0; i < orderIds.size(); i++) {



                double totalPrice = quantities.get(i) * prices.get(i);



                System.out.println("\nOrder Index: " + i);

                System.out.println("Order ID: " + orderIds.get(i));

                System.out.println("Customer: " + customers.get(i));

                System.out.println("Product: " + products.get(i));

                System.out.println("Quantity: " + quantities.get(i));

                System.out.println("Price: " + prices.get(i));

                System.out.println("Total Price: " + totalPrice);

                System.out.println("Status: " + status.get(i));

                System.out.println("--------------------------");


            }

        }

    }


}