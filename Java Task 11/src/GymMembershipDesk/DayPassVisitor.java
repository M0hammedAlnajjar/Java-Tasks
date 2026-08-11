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
