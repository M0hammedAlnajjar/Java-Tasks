import java.util.ArrayList;
import java.util.Scanner;
public class EmployeeSalaryManagementSystem {

    public static void main(String[] args) {

        // Create ArrayLists
        ArrayList<String> employeeNames = new ArrayList<>();
        ArrayList<Integer> employeeIds = new ArrayList<>();
        ArrayList<Double> employeeSalaries = new ArrayList<>();

        // Add employee data
        employeeIds.add(1001);
        employeeNames.add("Ali");
        employeeSalaries.add(850.0);

        employeeIds.add(1002);
        employeeNames.add("Sara");
        employeeSalaries.add(920.0);

        employeeIds.add(1003);
        employeeNames.add("Ahmed");
        employeeSalaries.add(1100.0);

        employeeIds.add(1004);
        employeeNames.add("Fatima");
        employeeSalaries.add(980.0);

        employeeIds.add(1005);
        employeeNames.add("Omar");
        employeeSalaries.add(1250.0);

        employeeIds.add(1006);
        employeeNames.add("Noor");
        employeeSalaries.add(890.0);

        employeeIds.add(1007);
        employeeNames.add("Hassan");
        employeeSalaries.add(1350.0);

        employeeIds.add(1008);
        employeeNames.add("Aisha");
        employeeSalaries.add(1050.0);

        employeeIds.add(1009);
        employeeNames.add("Khalid");
        employeeSalaries.add(1500.0);

        employeeIds.add(1010);
        employeeNames.add("Mona");
        employeeSalaries.add(950.0);

        // Display employee information
        System.out.println("Employee List");
        System.out.println("-------------------------------");

        for (int i = 0; i < employeeIds.size(); i++) {
            System.out.println(
                    "ID: " + employeeIds.get(i) +
                            ", Name: " + employeeNames.get(i) +
                            ", Salary: $" + employeeSalaries.get(i)
            );

            System.out.println("Employee Information");
            System.out.println("----------------------");

            for (int i = 0; i < employeeIds.size(); i++) {
                System.out.println("Employee " + i + ":");
                System.out.println("ID: " + employeeIds.get(i));
                System.out.println("Name: " + employeeNames.get(i));
                System.out.println("Salary: " + employeeSalaries.get(i));
                System.out.println();
            }

            int highSalary = 0;
            int mediumSalary = 0;
            int lowSalary = 0;

            for (double salary : employeeSalaries) {

                if (salary > 1000) {
                    highSalary++;
                } else if (salary >= 500 && salary <= 1000) {
                    mediumSalary++;
                } else {
                    lowSalary++;
                }
            }

            System.out.println("Salary Category Analysis");
            System.out.println("------------------------");
            System.out.println("High Salary Employees: " + highSalary);
            System.out.println("Medium Salary Employees: " + mediumSalary);
            System.out.println("Low Salary Employees: " + lowSalary);
        }




        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee ID: ");
        int searchId = input.nextInt();

        boolean found = false;

        for (int i = 0; i < employeeIds.size(); i++) {

            if (employeeIds.get(i) == searchId) {
                System.out.println("Employee Found");
                System.out.println("Name: " + employeeNames.get(i));
                System.out.println("Salary: " + employeeSalaries.get(i));
                System.out.println("Position: " + i);

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee not found.");
        }

        // Hardcoded values
        int employeeIndex = 2;
        double newSalary = 1500.0;

// Check if the index is valid
        if (employeeIndex >= 0 && employeeIndex < employeeSalaries.size()) {

            employeeSalaries.set(employeeIndex, newSalary);

            System.out.println("Salary updated successfully.");
            System.out.println("Employee Information:");
            System.out.println("ID: " + employeeIds.get(employeeIndex));
            System.out.println("Name: " + employeeNames.get(employeeIndex));
            System.out.println("Salary: " + employeeSalaries.get(employeeIndex));

        } else {
            System.out.println("Invalid employee index.");
        }

        // Hardcoded employee index to remove
        int employeeIndex = 4;

// Check if the index is valid
        if (employeeIndex >= 0 && employeeIndex < employeeIds.size()) {

            employeeIds.remove(employeeIndex);
            employeeNames.remove(employeeIndex);
            employeeSalaries.remove(employeeIndex);

            System.out.println("Employee removed successfully.");

            // Display updated employee list
            System.out.println("\nUpdated Employee List:");
            for (int i = 0; i < employeeIds.size(); i++) {
                System.out.println("Employee " + i + ":");
                System.out.println("ID: " + employeeIds.get(i));
                System.out.println("Name: " + employeeNames.get(i));
                System.out.println("Salary: " + employeeSalaries.get(i));
                System.out.println();
            }

        } else {
            System.out.println("Invalid employee index.");
        }
        System.out.println("Employee Salary Bonus Report");
        System.out.println("----------------------------");

        for (int i = 0; i < employeeNames.size(); i++) {

            double salary = employeeSalaries.get(i);
            double bonus;

            if (salary >= 1000) {
                bonus = salary * 0.10;
            } else if (salary >= 500) {
                bonus = salary * 0.05;
            } else {
                bonus = salary * 0.02;
            }

            double finalSalary = salary + bonus;

            System.out.println("Employee: " + employeeNames.get(i));
            System.out.println("Current Salary: " + salary);
            System.out.println("Bonus: " + bonus);
            System.out.println("Final Salary: " + finalSalary);
            System.out.println();
        }
    }
}