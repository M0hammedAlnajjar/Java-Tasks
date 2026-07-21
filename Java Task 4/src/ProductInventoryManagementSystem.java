import java.util.ArrayList;
public class ProductInventoryManagementSystem {

    static void main() {


        public class ProductInventory {

            public static void main(String[] args) {

                // Create ArrayLists
                ArrayList<String> productNames = new ArrayList<>();
                ArrayList<Integer> productQuantities = new ArrayList<>();
                ArrayList<Double> productPrices = new ArrayList<>();


                // Add product information

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



                // Display products

                System.out.println("Product Inventory:");

                for (int i = 0; i < productNames.size(); i++) {

                    System.out.println(
                            "Product: " + productNames.get(i) +
                                    ", Quantity: " + productQuantities.get(i) +
                                    ", Price: " + productPrices.get(i)
                    );
                }
            }

            // Display Inventory

System.out.println("Product Inventory:");

for (int i = 0; i < productNames.size(); i++) {

                System.out.println("\nProduct " + i + ":");
                System.out.println("Name: " + productNames.get(i));
                System.out.println("Quantity: " + productQuantities.get(i));
                System.out.printf("Price: %.2f%n", productPrices.get(i));
            }

        }
    }// Add New Product

    String name = IO.readln("Enter Product Name: ");

    String quantityInput = IO.readln("Enter Quantity: ");
    int quantity = Integer.parseInt(quantityInput);

    String priceInput = IO.readln("Enter Price: ");
    double price = Double.parseDouble(priceInput);


// Add product information to lists

productNames.add(name);
productQuantities.add(quantity);
productPrices.add(price);


System.out.println("Product added successfully.");


// Display updated inventory

System.out.println("\nUpdated Inventory:");

for (int i = 0; i < productNames.size(); i++) {

        System.out.println("\nProduct " + i + ":");
        System.out.println("Name: " + productNames.get(i));
        System.out.println("Quantity: " + productQuantities.get(i));
        System.out.printf("Price: %.2f%n", productPrices.get(i));
    }

// Update Product Information

    String indexInput = IO.readln("Enter product index: ");
    int index = Integer.parseInt(indexInput);


// Check index is valid
if (index >= 0 && index < productNames.size()) {


        // Get new product information

        String newName = IO.readln("New Product Name: ");

        String quantityInput = IO.readln("New Quantity: ");
        int newQuantity = Integer.parseInt(quantityInput);

        String priceInput = IO.readln("New Price: ");
        double newPrice = Double.parseDouble(priceInput);



        // Update lists

        productNames.set(index, newName);
        productQuantities.set(index, newQuantity);
        productPrices.set(index, newPrice);


        System.out.println("Product updated successfully.");

    } else {

        System.out.println("Invalid product index.");

    }


// Display updated inventory

System.out.println("\nUpdated Inventory:");

for (int i = 0; i < productNames.size(); i++) {

        System.out.println("\nProduct " + i + ":");
        System.out.println("Name: " + productNames.get(i));
        System.out.println("Quantity: " + productQuantities.get(i));
        System.out.printf("Price: %.2f%n", productPrices.get(i));
    }
// Stock Analysis

    int totalProducts = productNames.size();
    int totalQuantity = 0;
    double inventoryValue = 0;


// Calculate quantity and inventory value

for (int i = 0; i < productNames.size(); i++) {

        totalQuantity += productQuantities.get(i);

        inventoryValue += productQuantities.get(i) * productPrices.get(i);
    }


// Display statistics

System.out.println("Stock Analysis:");

System.out.println("Total Products: " + totalProducts);

System.out.println("Total Quantity: " + totalQuantity);

System.out.printf("Inventory Value: %.2f%n", inventoryValue);
}
// Stock Status Checking

System.out.println("Low Stock:");

for (int i = 0; i < productNames.size(); i++) {

        if (productQuantities.get(i) < 5 && productQuantities.get(i) > 0) {

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

// Remove Product

String indexInput = IO.readln("Remove Product Index: ");
int removeIndex = Integer.parseInt(indexInput);


// Check index

if (removeIndex >= 0 && removeIndex < productNames.size()) {


        // Remove product information from all lists

        productNames.remove(removeIndex);
    productQuantities.remove(removeIndex);
    productPrices.remove(removeIndex);


    System.out.println("Product removed successfully.");


} else {

        System.out.println("Invalid product index.");

}



// Display updated inventory

        System.out.println("\nUpdated Inventory:");

for (int i = 0; i < productNames.size(); i++) {

        System.out.println("\nProduct " + i + ":");
    System.out.println("Name: " + productNames.get(i));
        System.out.println("Quantity: " + productQuantities.get(i));
        System.out.printf("Price: %.2f%n", productPrices.get(i));

        }