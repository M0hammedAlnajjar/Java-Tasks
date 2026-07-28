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
 else {


                // Add initial employee records
                for (int i = 0; i < numberOfEmployees; i++) {


                    String id = IO.readln("Enter employee ID " + (i + 1) + ": ");
                    employeeId = Integer.parseInt(id);


                    String salaryInput = IO.readln("Enter employee salary: ");
                    salary = Double.parseDouble(salaryInput);


                }
    }

            // Check duplicate employee ID
            if (employeeSalaries.containsKey(employeeId)) {


                System.out.println(
                        "Employee ID already exists. Record not added.");


            } else {


                employeeSalaries.put(employeeId, salary);

            }


        }

    }
