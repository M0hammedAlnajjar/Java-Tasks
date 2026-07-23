import java.util.ArrayList;

public class BookManagementSystem {

    public static void main(String[] args) {

        ArrayList<Integer> orderIds = new ArrayList<>();
        ArrayList<String> customers = new ArrayList<>();
        ArrayList<String> products = new ArrayList<>();
        ArrayList<Integer> quantities = new ArrayList<>();
        ArrayList<Double> prices = new ArrayList<>();
        ArrayList<String> status = new ArrayList<>();


        // Initial Orders

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



        // 1. Display Orders

        System.out.println("===== Order Information =====");


        for (int i = 0; i < orderIds.size(); i++) {

            double total = quantities.get(i) * prices.get(i);

            System.out.println("\nOrder Index: " + i);
            System.out.println("Order ID: " + orderIds.get(i));
            System.out.println("Customer: " + customers.get(i));
            System.out.println("Product: " + products.get(i));
            System.out.println("Quantity: " + quantities.get(i));
            System.out.println("Price: " + prices.get(i));
            System.out.println("Total Price: " + total);
            System.out.println("Status: " + status.get(i));
        }



        // 2. Add New Order

        System.out.println("\n===== Add New Order =====");


        String customerName = IO.readln("Customer name: ");
        String productName = IO.readln("Product name: ");
        int quantity = Integer.parseInt(IO.readln("Quantity: "));
        double price = Double.parseDouble(IO.readln("Price: "));
        String orderStatus = IO.readln(
                "Status (Pending/Completed/Cancelled): "
        );


        boolean validStatus =
                orderStatus.equalsIgnoreCase("Pending") ||
                        orderStatus.equalsIgnoreCase("Completed") ||
                        orderStatus.equalsIgnoreCase("Cancelled");


        if (quantity <= 0) {

            System.out.println("Error: Quantity must be greater than zero.");

        } else if (price < 0) {

            System.out.println("Error: Price cannot be negative.");

        } else if (!validStatus) {

            System.out.println("Error: Invalid status.");

        } else {

            int newOrderId = 1000 + orderIds.size() + 1;

            orderIds.add(newOrderId);
            customers.add(customerName);
            products.add(productName);
            quantities.add(quantity);
            prices.add(price);
            status.add(orderStatus);

            System.out.println("Order added successfully!");
            System.out.println("Order ID: " + newOrderId);
        }



        // 3. Statistics

        System.out.println("\n===== Order Statistics =====");


        double totalSales = 0;

        double highest = quantities.get(0) * prices.get(0);
        double lowest = quantities.get(0) * prices.get(0);


        for (int i = 0; i < orderIds.size(); i++) {

            double total = quantities.get(i) * prices.get(i);

            totalSales += total;


            if (total > highest)
                highest = total;


            if (total < lowest)
                lowest = total;
        }


        double average = totalSales / orderIds.size();


        System.out.println("Total Orders: " + orderIds.size());
        System.out.println("Total Sales: " + totalSales);
        System.out.println("Average Order: " + average);
        System.out.println("Highest Order: " + highest);
        System.out.println("Lowest Order: " + lowest);



        // 4. Status Analysis

        int pending = 0;
        int completed = 0;
        int cancelled = 0;


        for (String s : status) {

            if (s.equalsIgnoreCase("Pending"))
                pending++;

            else if (s.equalsIgnoreCase("Completed"))
                completed++;

            else if (s.equalsIgnoreCase("Cancelled"))
                cancelled++;
        }


        System.out.println("\n===== Status Analysis =====");

        System.out.println("Pending Orders: " + pending);
        System.out.println("Completed Orders: " + completed);
        System.out.println("Cancelled Orders: " + cancelled);
        // 5. Search Order System

        System.out.println("\n===== Search Order =====");

        System.out.println("1. Search by Order ID");
        System.out.println("2. Search by Customer Name");


        int option = Integer.parseInt(
                IO.readln("Choose option: ")
        );


        boolean found = false;


        if (option == 1) {

            int searchId = Integer.parseInt(
                    IO.readln("Enter Order ID: ")
            );


            for (int i = 0; i < orderIds.size(); i++) {

                if (orderIds.get(i) == searchId) {

                    displayOrder(
                            i,
                            orderIds,
                            customers,
                            products,
                            quantities,
                            prices,
                            status
                    );

                    found = true;
                    break;
                }
            }


        } else if (option == 2) {


            String searchName =
                    IO.readln("Enter Customer Name: ");


            for (int i = 0; i < customers.size(); i++) {

                if (customers.get(i)
                        .equalsIgnoreCase(searchName)) {


                    displayOrder(
                            i,
                            orderIds,
                            customers,
                            products,
                            quantities,
                            prices,
                            status
                    );

                    found = true;
                    break;
                }
            }
        }


        if (!found) {

            System.out.println("Order not found.");

        }



        // 6. Update Order


        System.out.println("\n===== Update Order =====");


        int updateIndex = Integer.parseInt(
                IO.readln("Enter order index: ")
        );


        if (updateIndex >= 0 &&
                updateIndex < orderIds.size()) {


            customers.set(
                    updateIndex,
                    IO.readln("New customer name: ")
            );


            products.set(
                    updateIndex,
                    IO.readln("New product name: ")
            );


            quantities.set(
                    updateIndex,
                    Integer.parseInt(
                            IO.readln("New quantity: ")
                    )
            );


            prices.set(
                    updateIndex,
                    Double.parseDouble(
                            IO.readln("New price: ")
                    )
            );


            status.set(
                    updateIndex,
                    IO.readln("New status: ")
            );


            System.out.println(
                    "Order updated successfully!"
            );


            displayOrder(
                    updateIndex,
                    orderIds,
                    customers,
                    products,
                    quantities,
                    prices,
                    status
            );


        } else {

            System.out.println("Invalid index.");

        }




        // 7. Discount Calculation


        System.out.println("\n===== Discount =====");


        int discountIndex = Integer.parseInt(
                IO.readln("Enter order index: ")
        );


        if (discountIndex >= 0 &&
                discountIndex < orderIds.size()) {


            double total =
                    quantities.get(discountIndex)
                            * prices.get(discountIndex);


            double discount = 0;


            if (total >= 5000) {

                discount = 0.15;

            } else if (total >= 2000) {

                discount = 0.10;

            } else if (total >= 1000) {

                discount = 0.05;

            }


            double discountAmount =
                    total * discount;


            double finalPrice =
                    total - discountAmount;


            System.out.println(
                    "Original Price: " + total
            );

            System.out.println(
                    "Discount Amount: " + discountAmount
            );

            System.out.println(
                    "Final Price: " + finalPrice
            );

        }




        // 8. Remove Order


        System.out.println("\n===== Remove Order =====");


        int removeIndex = Integer.parseInt(
                IO.readln("Enter order index: ")
        );


        if (removeIndex >= 0 &&
                removeIndex < orderIds.size()) {


            orderIds.remove(removeIndex);
            customers.remove(removeIndex);
            products.remove(removeIndex);
            quantities.remove(removeIndex);
            prices.remove(removeIndex);
            status.remove(removeIndex);


            System.out.println(
                    "Order removed successfully!"
            );


        } else {

            System.out.println("Invalid index.");

        }



        // 9. Sort Orders By Total Price


        System.out.println("\n===== Sorting Orders =====");


        for (int i = 0;
             i < orderIds.size() - 1;
             i++) {


            for (int j = i + 1;
                 j < orderIds.size();
                 j++) {


                double total1 =
                        quantities.get(i)
                                * prices.get(i);


                double total2 =
                        quantities.get(j)
                                * prices.get(j);


                if (total1 > total2) {


                    swap(
                            i,
                            j,
                            orderIds,
                            customers,
                            products,
                            quantities,
                            prices,
                            status
                    );

                }
            }
        }


        System.out.println("Lowest To Highest:");

        for (int i = 0;
             i < orderIds.size();
             i++) {


            System.out.println(
                    customers.get(i)
                            + " - "
                            + (quantities.get(i)
                            * prices.get(i))
            );

        }

        // 10. Sort Customer Name


        for (int i = 0;
             i < customers.size() - 1;
             i++) {


            for (int j = i + 1;
                 j < customers.size();
                 j++) {


                if (customers.get(i)
                        .compareToIgnoreCase(customers.get(j)) > 0) {


                    swap(
                            i,
                            j,
                            orderIds,
                            customers,
                            products,
                            quantities,
                            prices,
                            status
                    );

                }
            }
        }


        System.out.println("\nCustomer Name Sorted:");


        for (String c : customers) {

            System.out.println(c);

        }


    }



    // Display Order Method

    public static void displayOrder(
            int i,
            ArrayList<Integer> orderIds,
            ArrayList<String> customers,
            ArrayList<String> products,
            ArrayList<Integer> quantities,
            ArrayList<Double> prices,
            ArrayList<String> status) {


        double total =
                quantities.get(i) *
                        prices.get(i);


        System.out.println("\nOrder Index: " + i);
        System.out.println("Order ID: " + orderIds.get(i));
        System.out.println("Customer: " + customers.get(i));
        System.out.println("Product: " + products.get(i));
        System.out.println("Quantity: " + quantities.get(i));
        System.out.println("Price: " + prices.get(i));
        System.out.println("Total Price: " + total);
        System.out.println("Status: " + status.get(i));

    }



    // Swap Method For Sorting

    public static void swap(
            int i,
            int j,
            ArrayList<Integer> orderIds,
            ArrayList<String> customers,
            ArrayList<String> products,
            ArrayList<Integer> quantities,
            ArrayList<Double> prices,
            ArrayList<String> status) {


        int id = orderIds.get(i);
        orderIds.set(i, orderIds.get(j));
        orderIds.set(j, id);



        String c = customers.get(i);
        customers.set(i, customers.get(j));
        customers.set(j, c);



        String p = products.get(i);
        products.set(i, products.get(j));
        products.set(j, p);



        int q = quantities.get(i);
        quantities.set(i, quantities.get(j));
        quantities.set(j, q);



        double price = prices.get(i);
        prices.set(i, prices.get(j));
        prices.set(j, price);



        String s = status.get(i);
        status.set(i, status.get(j));
        status.set(j, s);

    }

}