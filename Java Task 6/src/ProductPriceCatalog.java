import java.util.HashMap;

public class ProductPriceCatalog {

    public static void main() {

        // Create HashMap to store product names and prices
        HashMap<String, Double> productCatalog = new HashMap<>();

        // Declare variables
        String n = IO.readln("Enter number of products: ");
        int numberOfProducts = Integer.parseInt(n);

        String productName;
        double productPrice;
        String searchProduct;
        String updateChoice;
        double newPrice;
        String searchResult;
        String inventoryClassification;

        // Check if number of products is valid
        if (numberOfProducts <= 0) {

            System.out.println("Invalid number of products.");

        } else {

            // Read product names and prices
            for (int i = 0; i < numberOfProducts; i++) {

                productName = IO.readln("Enter product name " + (i + 1) + ": ");

                String price = IO.readln("Enter product price: ");
                productPrice = Double.parseDouble(price);

                // Check for duplicate product
                if (productCatalog.containsKey(productName)) {

                    System.out.println("Product already exists. Record not added.");

                } else {

                    productCatalog.put(productName, productPrice);

                }

            }

            // Search for a product
            searchProduct = IO.readln("Enter product name to search: ");

            if (productCatalog.containsKey(searchProduct)) {

                System.out.println("Current price: " + productCatalog.get(searchProduct));

                updateChoice = IO.readln("Do you want to update the price? (Y/N): ");

                if (updateChoice.equalsIgnoreCase("Y")) {

                    String price = IO.readln("Enter new price: ");
                    newPrice = Double.parseDouble(price);

                    // Update product price
                    productCatalog.replace(searchProduct, newPrice);

                    searchResult = "Price updated successfully.";

                } else {

                    searchResult = "Price was not updated.";

                }

            } else {

                searchResult = "Product not found.";

            }

            // Classify inventory
            if (productCatalog.size() < 5) {

                inventoryClassification = "Small Inventory";

            } else if (productCatalog.size() <= 10) {

                inventoryClassification = "Medium Inventory";

            } else {

                inventoryClassification = "Large Inventory";

            }

            // Display results
            System.out.println("\n----- Product Price Catalog Report -----");
            System.out.println("Total products entered: " + numberOfProducts);
            System.out.println("Total unique products: " + productCatalog.size());
            System.out.println("Product Catalog: " + productCatalog);
            System.out.println("Search/Update Result: " + searchResult);
            System.out.println("Inventory classification: " + inventoryClassification);

        }

    }

}