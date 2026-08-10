package CornerShopInventory;

public class Service {
    private String name;
    private double price;
    private double minutes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getMinutes() {
        return minutes;
    }

    public void setMinutes(double minutes) {
       if (minutes < 0) {
           this.minutes = minutes;

       } else
           this.minutes = 0;


    }
}

