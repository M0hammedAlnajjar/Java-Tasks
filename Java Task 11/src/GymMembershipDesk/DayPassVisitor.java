package GymMembershipDesk;

public class DayPassVisitor implements Payable {

    private  String name;
    private  int age;

    public void setName(String name) {
        if (name != null
                && name.trim().length() >= 2) {

            this.name = name;

        } else {

            System.out.println(
                    "Member name must be at least 2 characters"
            );
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void printAllInfo() {

    }

    @Override
    public double monthlyTotal() {
        return 0;
    }

    @Override
    public String getName() {
        return "";
    }
}
