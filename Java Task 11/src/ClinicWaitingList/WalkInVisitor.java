package ClinicWaitingList;


import CornerShopInventory.Sellable;

public class WalkInVisitor  implements Attendable{


    private String name ;
    private  int age ;
    private double arrivalOrder;




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Name is required");
        }

    }

    public double getArrivalOder() {
        return arrivalOrder;
    }

    public void setArrivalOrder(double arrivalOder) {
        if (arrivalOder > 0){
            this.arrivalOrder = arrivalOder;
        }
        else
                this.arrivalOrder=1;

    }

    @Override
    public void printAllInfo() {

    }

    @Override
    public String getPriority() {
        return "";
    }

    @Override
    public int getWaitMinutes() {
        return 0;
    }
}
