package GymMembershipDesk;

public class MonthlyMember implements Payable {

    private String name;
    private int age;
    private double monthlyFee;
    private final int membershipId;

    public MonthlyMember(int membershipId) {
        this.membershipId = membershipId;
    }

    public String getName() {
        return name;
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

    @Override
    public void printAllInfo() {

        System.out.printf(
                "[Monthly] ID: %d | %s | Age: %d | " +
                        "Fee: %.2f OMR%n",
                membershipId,
                name,
                age,
                monthlyFee
        );
    }

    @Override
    public double monthlyTotal() {
        return monthlyFee;
    }
}