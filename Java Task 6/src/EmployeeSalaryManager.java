import java.util.HashMap;

public class EmployeeSalaryManager {


    public static void main() {
        // Create HashMap to store employee IDs and salaries
        HashMap<Integer, Double> employeeSalaries = new HashMap<>();
// Declare variables
        String n = IO.readln("Enter number of employees: ");
        int numberOfEmployees = Integer.parseInt(n);

        int employeeId;
        double salary;

        int choice;


        // Check if number of employees is valid
        if (numberOfEmployees <= 0) {

            System.out.println("Invalid number of employees.");

        }
    }
}
