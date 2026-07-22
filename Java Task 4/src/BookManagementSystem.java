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

    }


}