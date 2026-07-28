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

    }
    // Check if number of products is valid
        if (numberOfProducts <= 0) {

        System.out.println("Invalid number of products.");

    } else

    {

        // Read product names and prices
        for (int i = 0; i < numberOfProducts; i++) {

            productName = IO.readln("Enter product name " + (i + 1) + ": ");

            String price = IO.readln("Enter product price: ");
            productPrice = Double.parseDouble(price);

        }

        // Check for duplicate product
        if (productCatalog.containsKey(productName)) {

            System.out.println("Product already exists. Record not added.");

        } else {

            productCatalog.put(productName, productPrice);

        }


        // Search for a product
        searchProduct = IO.readln("Enter product name to search: ");

        if (productCatalog.containsKey(searchProduct)) {

            System.out.println("Current price: " + productCatalog.get(searchProduct));

            updateChoice = IO.readln("Do you want to update the price? (Y/N): ");

            if (updateChoice.equalsIgnoreCase("Y")) {

                String price = IO.readln("Enter new price: ");
                newPrice = Double.parseDouble(price);

            }}