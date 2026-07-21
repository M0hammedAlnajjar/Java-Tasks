import java.util.ArrayList;

public class ProductInventoryManagementSystem {

    public static void main(String[] args) {


        // 1. Create Product Lists

        ArrayList<String> productNames = new ArrayList<>();
        ArrayList<Integer> productQuantities = new ArrayList<>();
        ArrayList<Double> productPrices = new ArrayList<>();


        // Add 10 Products

        productNames.add("Laptop");
        productQuantities.add(5);
        productPrices.add(750.50);

        productNames.add("Phone");
        productQuantities.add(10);
        productPrices.add(500.00);

        productNames.add("Tablet");
        productQuantities.add(7);
        productPrices.add(300.75);

        productNames.add("Keyboard");
        productQuantities.add(15);
        productPrices.add(45.99);

        productNames.add("Mouse");
        productQuantities.add(20);
        productPrices.add(25.50);

        productNames.add("Monitor");
        productQuantities.add(8);
        productPrices.add(220.00);

        productNames.add("Printer");
        productQuantities.add(4);
        productPrices.add(150.25);

        productNames.add("Headphones");
        productQuantities.add(12);
        productPrices.add(80.00);

        productNames.add("Camera");
        productQuantities.add(6);
        productPrices.add(650.99);

        productNames.add("Speaker");
        productQuantities.add(9);
        productPrices.add(120.50);



        // 2. Display Inventory

        System.out.println("Product Inventory:");

        for (int i = 0; i < productNames.size(); i++) {

            System.out.println("\nProduct " + i);
            System.out.println("Name: " + productNames.get(i));
            System.out.println("Quantity: " + productQuantities.get(i));
            System.out.printf("Price: %.2f%n", productPrices.get(i));
        }



        // 3. Add New Product

        String name = IO.readln("\nEnter Product Name: ");

        int quantity = Integer.parseInt(
                IO.readln("Enter Quantity: ")
        );

        double price = Double.parseDouble(
                IO.readln("Enter Price: ")
        );


        productNames.add(name);
        productQuantities.add(quantity);
        productPrices.add(price);


        System.out.println("Product added successfully.");



        // 4. Update Product Information

        int index = Integer.parseInt(
                IO.readln("\nEnter product index to update: ")
        );


        if (index >= 0 && index < productNames.size()) {


            String newName = IO.readln("New Product Name: ");

            int newQuantity = Integer.parseInt(
                    IO.readln("New Quantity: ")
            );


            double newPrice = Double.parseDouble(
                    IO.readln("New Price: ")
            );


            productNames.set(index, newName);
            productQuantities.set(index, newQuantity);
            productPrices.set(index, newPrice);


            System.out.println("Product updated successfully.");

        } else {

            System.out.println("Invalid index.");

        }




        // 5. Stock Analysis


        int totalProducts = productNames.size();
        int totalQuantity = 0;
        double inventoryValue = 0;


        for (int i = 0; i < productNames.size(); i++) {


            totalQuantity += productQuantities.get(i);


            inventoryValue +=
                    productQuantities.get(i) *
                            productPrices.get(i);

        }


        System.out.println("\nStock Analysis:");

        System.out.println("Total Products: " + totalProducts);

        System.out.println("Total Quantity: " + totalQuantity);

        System.out.printf("Inventory Value: %.2f%n",
                inventoryValue);





        // 6. Stock Status Checking


        System.out.println("\nLow Stock:");

        for (int i = 0; i < productNames.size(); i++) {

            if (productQuantities.get(i) < 5 &&
                    productQuantities.get(i) > 0) {

                System.out.println(productNames.get(i));

            }
        }



        System.out.println("\nOut of Stock:");

        for (int i = 0; i < productNames.size(); i++) {

            if (productQuantities.get(i) == 0) {

                System.out.println(productNames.get(i));

            }
        }



        System.out.println("\nAvailable Stock:");

        for (int i = 0; i < productNames.size(); i++) {

            if (productQuantities.get(i) >= 5) {

                System.out.println(productNames.get(i));

            }
        }




        // 7. Remove Product


        int removeIndex = Integer.parseInt(
                IO.readln("\nRemove Product Index: ")
        );


        if (removeIndex >= 0 &&
                removeIndex < productNames.size()) {


            productNames.remove(removeIndex);
            productQuantities.remove(removeIndex);
            productPrices.remove(removeIndex);


            System.out.println(
                    "Product removed successfully."
            );


        } else {

            System.out.println("Invalid index.");

        }




        // 8. Sorting Products By Name


        for (int i = 0; i < productNames.size() - 1; i++) {


            for (int j = i + 1; j < productNames.size(); j++) {


                if (productNames.get(i)
                        .compareTo(productNames.get(j)) > 0) {



                    String tempName = productNames.get(i);
                    productNames.set(i, productNames.get(j));
                    productNames.set(j, tempName);



                    int tempQuantity =
                            productQuantities.get(i);

                    productQuantities.set(i,
                            productQuantities.get(j));

                    productQuantities.set(j,
                            tempQuantity);



                    double tempPrice =
                            productPrices.get(i);

                    productPrices.set(i,
                            productPrices.get(j));

                    productPrices.set(j,
                            tempPrice);

                }
            }
        }



        System.out.println("\nSorted By Name:");

        for (int i = 0; i < productNames.size(); i++) {

            System.out.println(
                    productNames.get(i)
                            + " - "
                            + productPrices.get(i)
            );
        }




        // Sort By Price


        for (int i = 0; i < productPrices.size() - 1; i++) {


            for (int j = i + 1; j < productPrices.size(); j++) {


                if (productPrices.get(i)
                        > productPrices.get(j)) {



                    double tempPrice =
                            productPrices.get(i);

                    productPrices.set(i,
                            productPrices.get(j));

                    productPrices.set(j,
                            tempPrice);



                    String tempName =
                            productNames.get(i);

                    productNames.set(i,
                            productNames.get(j));

                    productNames.set(j,
                            tempName);



                    int tempQuantity =
                            productQuantities.get(i);

                    productQuantities.set(i,
                            productQuantities.get(j));

                    productQuantities.set(j,
                            tempQuantity);

                }
            }
        }



        System.out.println("\nSorted By Price:");

        for (int i = 0; i < productNames.size(); i++) {

            System.out.println(
                    productNames.get(i)
                            + " - "
                            + productPrices.get(i)
            );
        }



        // Display Final Inventory

        System.out.println("\nFinal Inventory:");

        for (int i = 0; i < productNames.size(); i++) {


            System.out.println(
                    productNames.get(i)
                            + " | Quantity: "
                            + productQuantities.get(i)
                            + " | Price: "
                            + productPrices.get(i)
            );

        }

    }
}