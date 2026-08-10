package ClinicWaitingList;

public class BookedPatient {

    private String name ;
    private int age ;
    private double slotTime;

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

    public double getSlotTime() {
        return slotTime;
    }

    public void setSlotTime(double slotTime) {
        this.slotTime = slotTime;
    }
}
