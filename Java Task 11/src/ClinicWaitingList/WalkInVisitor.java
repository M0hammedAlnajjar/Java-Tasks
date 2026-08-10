package ClinicWaitingList;


import CornerShopInventory.Sellable;

public class WalkInVisitor  implements Attendable{


    private String name ;
    private  int age ;
    private double arrivalOder;




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
        this.age = age;


    }

    public double getArrivalOder() {
        return arrivalOder;
    }

    public void setArrivalOder(double arrivalOder) {
        this.arrivalOder = arrivalOder;
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
