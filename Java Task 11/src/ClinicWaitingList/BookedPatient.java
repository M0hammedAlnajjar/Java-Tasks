package ClinicWaitingList;

import CornerShopInventory.Sellable;

public class BookedPatient implements Attendable{

    private String name ;
    private int age ;
    private double slotTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        }else
            IO.println("Name is required ");

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <=120 ) {
            this.age = age;
        }else
                IO.print("Invalid age");

    }

    public double getSlotTime() {
        return slotTime;
    }

    public void setSlotTime(double slotTime) {
        this.slotTime = slotTime;
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
