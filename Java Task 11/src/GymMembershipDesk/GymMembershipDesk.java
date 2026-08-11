package GymMembershipDesk;

import java.util.ArrayList;
import java.util.List;

public class GymMembershipDesk {

    /*
     * Abstraction is provided by the Payable interface.
     * Encapsulation is provided by private fields and validated setters.
     *
     * If the fields were public, invalid ages or fees could be stored
     * without passing through the validation rules.
     */

    public static void main(String[] args) {
        new GymMembershipDesk().run();
    }

    private void run() {

        List<Payable> members = new ArrayList<>();

        System.out.println(
                "--- Single item created at startup ---"
        );

        MonthlyMember firstMember =
                new MonthlyMember(1001);

        firstMember.setName("Ahmed Ali");
        firstMember.setAge(25);
        firstMember.setMonthlyFee(30);

        firstMember.printAllInfo();

        members.add(firstMember);

        boolean exit = false;

        while (!exit) {

            System.out.println("\n--- GYM MEMBERSHIP MENU ---");
            System.out.println("1. Add monthly member");
            System.out.println("2. Add day-pass visitor");
            System.out.println("3. Print all members");
            System.out.println("4. Show total monthly income");
            System.out.println("5. Search member by name");
            System.out.println("6. Exit");

            int choice = Integer.parseInt(
                    IO.readln("Choose: ")
            );

            switch (choice) {

                case 1:
                    members.add(addMonthlyMember());
                    System.out.println("Added.");
                    break;

                case 2:
                    members.add(addDayPassVisitor());
                    System.out.println("Added.");
                    break;

                case 3:
                    printMembers(members);
                    break;

                case 4:
                    showTotalIncome(members);
                    break;

                case 5:
                    searchMember(members);
                    break;

                case 6:
                    exit = true;
                    System.out.println("Goodbye.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private MonthlyMember addMonthlyMember() {

        int id = Integer.parseInt(
                IO.readln("Enter membership ID: ")
        );

        MonthlyMember member =
                new MonthlyMember(id);

        member.setName(
                IO.readln("Enter member name: ")
        );

        member.setAge(
                Integer.parseInt(
                        IO.readln("Enter age: ")
                )
        );

        member.setMonthlyFee(
                Double.parseDouble(
                        IO.readln("Enter monthly fee: ")
                )
        );

        return member;
    }

    private DayPassVisitor addDayPassVisitor() {

        int id = Integer.parseInt(
                IO.readln("Enter membership ID: ")
        );

        DayPassVisitor visitor =
                new DayPassVisitor(id);

        visitor.setName(
                IO.readln("Enter member name: ")
        );

        visitor.setAge(
                Integer.parseInt(
                        IO.readln("Enter age: ")
                )
        );

        visitor.setPricePerVisit(
                Double.parseDouble(
                        IO.readln("Enter price per visit: ")
                )
        );

        visitor.setVisits(
                Integer.parseInt(
                        IO.readln("Enter number of visits: ")
                )
        );

        return visitor;
    }

    private void printMembers(
            List<Payable> members) {

        int number = 1;

        for (Payable member : members) {

            System.out.print(number + ". ");
            member.printAllInfo();

            number++;
        }
    }

    private void showTotalIncome(
            List<Payable> members) {

        double total = 0;

        for (Payable member : members) {

            total += member.monthlyTotal();
        }

        System.out.printf(
                "Total monthly income: %.2f OMR%n",
                total
        );
    }

    private void searchMember(
            List<Payable> members) {

        String searchName =
                IO.readln("Enter name to search: ");

        boolean found = false;

        for (Payable member : members) {

            if (member.getName().equals(searchName)) {

                member.printAllInfo();
                found = true;
            }
        }

        if (!found) {
            System.out.println(
                    "Member not found."
            );
        }
    }
}