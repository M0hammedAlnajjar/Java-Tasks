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
}
