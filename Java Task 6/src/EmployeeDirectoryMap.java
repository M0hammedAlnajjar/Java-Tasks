import java.util.HashMap;
public class EmployeeDirectoryMap {

    public static void main() {

        // Create HashMap to store employee IDs and names
        HashMap<Integer, String> employeeDirectory = new HashMap<>();


        String n = IO.readln("Enter number of employees: ");
        int numberOfEmployees = Integer.parseInt(n);

        int employeeId;
        String employeeName;
        int searchEmployeeId;
        String searchResult;
        String companyClassification;

        // Check if number of employees is valid
        if (numberOfEmployees <= 0) {

            System.out.println("Invalid number of employees.");

        } else {

            // Read employee records
            for (int i = 0; i < numberOfEmployees; i++) {

                String id = IO.readln("Enter employee ID " + (i + 1) + ": ");
                employeeId = Integer.parseInt(id);

                employeeName = IO.readln("Enter employee name: ");


            }


            // Check if employee ID already exists
            if (employeeDirectory.containsKey(employeeId)) {

                System.out.println("Employee ID already exists. Please enter a unique ID.");

            } else {

                employeeDirectory.put(employeeId, employeeName);

            }


            // Search for an employee
            String searchId = IO.readln("Enter employee ID to search: ");
            searchEmployeeId = Integer.parseInt(searchId);

        }

        // Check if employee exists
        if (employeeDirectory.containsKey(searchEmployeeId)) {

            searchResult = "Employee Found: " + employeeDirectory.get(searchEmployeeId);

        } else {

            searchResult = "Employee ID not found.";

        }
    }}