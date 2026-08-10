package CornerShopInventory;

public class Product  implements Sellable{
    private String name;
    private double price;
    private int quantity;



    public Product(String name, double price, int quantity) {
        setName(name);
        setPrice(price);
        setQuantity(quantity);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Name cannot be empty");
        }
    }


    @Override
    public void printAllInfo() {

    }

    public double getPrice() {
        return price;
    }

    @Override
    public String getCategory() {
        return "";
    }

    public void setPrice(double price) {
        if (price >= 0 || price <= 1000) {
            IO.println("Invalid price");
        }else
            IO.println("Price out of range  ");
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {

        if (quantity >= 1 && quantity <= 100) {
            IO.println("Quantity must be 1 to 100");
        }
        this.quantity = quantity;
    }
}
