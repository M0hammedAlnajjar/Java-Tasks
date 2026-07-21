import java.util.ArrayList;

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
    }
}