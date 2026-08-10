package CornerShopInventory;

public class Product  implements Sellable{
    private String name;
    private double price;
    private int quantity;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
