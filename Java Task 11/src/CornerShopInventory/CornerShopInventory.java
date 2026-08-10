package CornerShopInventory;

import java.util.ArrayList;
import java.util.List;

public class CornerShopInventory {

    /*
     * Abstraction is provided by the Sellable interface.
     * Encapsulation is provided by private fields and validated setters.
     */

    public static void main(String[] args) {
        new CornerShopInventory().run();
    }

    private void run() {

        List<Sellable> stock = new ArrayList<>();

        System.out.println("--- Single item created at startup ---");

        Product firstProduct =
                new Product("Rice 5kg", -5, 12);

        firstProduct.printAllInfo();

        stock.add(firstProduct);

        boolean exit = false;

        while (!exit) {

            System.out.println("\n--- SHOP MENU ---");
            System.out.println("1. Add product");
            System.out.println("2. Add service");
            System.out.println("3. Print stock");
            System.out.println("4. Total value");
            System.out.println("5. Exit");

            int choice = Integer.parseInt(
                    IO.readln("Choose: ")
            );

            switch (choice) {

                case 1:
                    stock.add(addProduct());
                    System.out.println("Added.");
                    break;

                case 2:
                    stock.add(addService());
                    System.out.println("Added.");
                    break;

                case 3:
                    printStock(stock);
                    break;

                case 4:
                    showTotalValue(stock);
                    break;

                case 5:
                    exit = true;
                    System.out.println("Goodbye.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private Product addProduct() {

        String name = IO.readln("Enter product name: ");

        double price = Double.parseDouble(
                IO.readln("Enter price: ")
        );

        int quantity = Integer.parseInt(
                IO.readln("Enter quantity: ")
        );

        Product product =
                new Product(name, price, quantity);

        return product;
    }

    private Service addService() {

        Service service = new Service();

        service.setName(
                IO.readln("Enter service name: ")
        );

        service.setPrice(
                Double.parseDouble(
                        IO.readln("Enter price: ")
                )
        );

        service.setMinutes(
                Integer.parseInt(
                        IO.readln("Enter minutes: ")
                )
        );

        return service;
    }

    private void printStock(List<Sellable> stock) {

        int number = 1;

        for (Sellable item : stock) {

            System.out.print(number + ". ");
            item.printAllInfo();

            number++;
        }
    }

    private void showTotalValue(List<Sellable> stock) {

        double total = 0;

        for (Sellable item : stock) {
            total += item.getPrice();
        }

        System.out.printf(
                "Total value of stock: %.2f OMR%n",
                total
        );
    }
}