package GymMembershipDesk;

public class DayPassVisitor implements Payable {

    private String name;
    private  int age;
    private double monthlyFee;
    private final int membershipId;

    public double getMonthlyFee() {
        return monthlyFee;
    }

    public void setMonthlyFee(double monthlyFee) {

        if (monthlyFee > 0
                && monthlyFee <= 500) {

            this.monthlyFee = monthlyFee;

        } else {

            System.out.println(
                    "Monthly fee must be above 0 and not more than 500"
            );
    }
    }

    public int getMembershipId() {
        return membershipId;
    }

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
        if (age < 14) {

            System.out.println(
                    "Too young to register"
            );

        } else if (age <= 90) {

            this.age = age;

        } else {

            System.out.println(
                    "Age must be between 14 and 90"
            );
        }


}

    @Override
    public void printAllInfo() {
        IO.print("Name: " + name);
        IO.print("Age: " + age);
        IO.print("Monthly fee: " + monthlyFee);
        IO.print("Membership Id: " + membershipId);

    }

    @Override
    public double monthlyTotal() {
        return MonthlyMember;
    }

    @Override
    public String getName() {
        return "";
    }
}
