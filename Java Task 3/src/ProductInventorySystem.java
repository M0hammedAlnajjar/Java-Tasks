import java.util.ArrayList;
import java.util.List;

public class ProductInventorySystem {

    public static void main(String[] args) {

        // Store product information
        String productName;
        double productPrice;
        int productQuantity;

        // Store calculated results
        double totalInventoryValue;
        String mostExpensiveProduct;

        int availableProducts;
        int outOfStockProducts;

        // Number of products
        int numberOfProducts = 10;

        // Create lists to store product information
        List<String> productNames = new ArrayList<>();
        List<Double> productPrices = new ArrayList<>();
        List<Integer> productQuantities = new ArrayList<>();


        // Enter information for 10 products
        for (int i = 0; i < numberOfProducts; i++) {

            productName = IO.readln("Enter product name " + (i + 1) + ": ");

            productPrice = Double.parseDouble(
                    IO.readln("Enter product price " + (i + 1) + ": ")
            );

            productQuantity = Integer.parseInt(
                    IO.readln("Enter product quantity " + (i + 1) + ": ")
            );

            productNames.add(productName);
            productPrices.add(productPrice);
            productQuantities.add(productQuantity);
        }

        // Calculate total inventory value
        totalInventoryValue = calculateTotalValue(productPrices, productQuantities);

        // Count stock status
        availableProducts = countStockStatus(productQuantities, "Available");
        outOfStockProducts = countStockStatus(productQuantities, "Out of Stock");

        // Find most expensive product
        mostExpensiveProduct = findMostExpensiveProduct(productNames, productPrices);

        // Display inventory report
        displayReport(productNames, productPrices, productQuantities,
                totalInventoryValue, availableProducts,
                outOfStockProducts, mostExpensiveProduct);

    }


    // Method to calculate total inventory value
    public static double calculateTotalValue(List<Double> productPrices,
                                             List<Integer> productQuantities) {

        double totalValue = 0;

        for (int i = 0; i < productPrices.size(); i++) {

            totalValue += productPrices.get(i) * productQuantities.get(i);

        }

        return totalValue;
    }


    // Method to check stock status
    public static String checkStockStatus(int quantity) {

        if (quantity > 10) {
            return "High Stock";
        } else if (quantity >= 1) {
            return "Available";
        } else {
            return "Out of Stock";
        }
    }


    // Method to count products by stock status
    public static int countStockStatus(List<Integer> productQuantities,
                                       String status) {

        int count = 0;

        for (int quantity : productQuantities) {

            if (checkStockStatus(quantity).equals(status)) {
                count++;
            }

        }

        return count;
    }


    // Method to find the most expensive product
    public static String findMostExpensiveProduct(List<String> productNames,
                                                  List<Double> productPrices) {

        int index = 0;

        for (int i = 1; i < productPrices.size(); i++) {

            if (productPrices.get(i) > productPrices.get(index)) {

                index = i;

            }

        }

        return productNames.get(index);
    }


    // Method to display inventory report
    public static void displayReport(List<String> productNames,
                                     List<Double> productPrices,
                                     List<Integer> productQuantities,
                                     double totalInventoryValue,
                                     int availableProducts,
                                     int outOfStockProducts,
                                     String mostExpensiveProduct) {

        IO.println("\n========== Inventory Report ==========");

        for (int i = 0; i < productNames.size(); i++) {

            IO.println("--------------------------------------");
            IO.println("Product Name : " + productNames.get(i));
            IO.println("Price        : " + productPrices.get(i));
            IO.println("Quantity     : " + productQuantities.get(i));
            IO.println("Stock Status : " + checkStockStatus(productQuantities.get(i)));
        }

        IO.println("\n========== Summary ==========");
        IO.println("Total Inventory Value : " + totalInventoryValue);
        IO.println("Available Products    : " + availableProducts);
        IO.println("Out of Stock Products : " + outOfStockProducts);
        IO.println("Most Expensive Product: " + mostExpensiveProduct);

    }

}