package GymMembershipDesk;

public class DayPassVisitor implements Payable {

    private String name;
    private int age;
    private double pricePerVisit;
    private int visits;
    private final int membershipId;

    public DayPassVisitor(int membershipId) {
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

    public double getPricePerVisit() {
        return pricePerVisit;
    }

    public void setPricePerVisit(double pricePerVisit) {

        if (pricePerVisit > 0) {
            this.pricePerVisit = pricePerVisit;
        } else {
            System.out.println(
                    "Price per visit must be above 0"
            );
        }
    }

    public int getVisits() {
        return visits;
    }

    public void setVisits(int visits) {

        if (visits >= 1 && visits <= 31) {

            this.visits = visits;

        } else {

            System.out.println(
                    "Visits must be from 1 to 31"
            );
        }
    }

    public int getMembershipId() {
        return membershipId;
    }

    @Override
    public void printAllInfo() {

        System.out.printf(
                "[Day Pass] ID: %d | %s | Age: %d | " +
                        "Price/visit: %.2f OMR | Visits: %d%n",
                membershipId,
                name,
                age,
                pricePerVisit,
                visits
        );
    }

    @Override
    public double monthlyTotal() {

        return pricePerVisit * visits;
    }
}