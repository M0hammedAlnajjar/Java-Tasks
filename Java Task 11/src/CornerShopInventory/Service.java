package CornerShopInventory;

public class Service implements Sellable {
    private String name;
    private double price;
    private double minutes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()){
            this.name = name;
        }else  {
            IO.println("Name cannot be empty");
        }

    }

    @Override
    public void printAllInfo() {
        IO.println("Name: " + name);
        IO.println("Price: " + price);
        IO.println("Minutes: " + minutes);

    }

    public double getPrice() {
        return price;
    }

    @Override
    public String getCategory() {
        return "service";
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

