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

        } else {


            // Add initial employee records
            for (int i = 0; i < numberOfEmployees; i++) {


                String id = IO.readln("Enter employee ID " + (i + 1) + ": ");
                employeeId = Integer.parseInt(id);


                String salaryInput = IO.readln("Enter employee salary: ");
                salary = Double.parseDouble(salaryInput);



                // Check duplicate employee ID
                if (employeeSalaries.containsKey(employeeId)) {


                    System.out.println(
                            "Employee ID already exists. Record not added.");


                } else {


                    employeeSalaries.put(employeeId, salary);


                }


            }



            // Menu system
            do {


                System.out.println("\n===== Employee Salary Management =====");
                System.out.println("1. Add Employee");
                System.out.println("2. Search Employee");
                System.out.println("3. Update Salary");
                System.out.println("4. Remove Employee");
                System.out.println("5. Display All Employees");
                System.out.println("6. Display Salary Statistics");
                System.out.println("7. Exit");



                String menu = IO.readln("Enter your choice: ");
                choice = Integer.parseInt(menu);



                switch (choice) {



                    case 1:

                        // Add new employee


                        String newId = IO.readln("Enter employee ID: ");
                        int addEmployeeId = Integer.parseInt(newId);


                        if (employeeSalaries.containsKey(addEmployeeId)) {


                            System.out.println(
                                    "Employee ID already exists. Record not added.");


                        } else {


                            String newSalary =
                                    IO.readln("Enter employee salary: ");


                            double addSalary =
                                    Double.parseDouble(newSalary);



                            employeeSalaries.put(
                                    addEmployeeId,
                                    addSalary);



                            System.out.println(
                                    "Employee added successfully.");

                        }


                        break;



                    case 2:

                        // Search employee


                        String searchId =
                                IO.readln("Enter employee ID: ");


                        int searchEmployeeId =
                                Integer.parseInt(searchId);



                        if (employeeSalaries.containsKey(searchEmployeeId)) {


                            System.out.println(
                                    "Employee Salary: "
                                            + employeeSalaries.get(searchEmployeeId));


                        } else {


                            System.out.println(
                                    "Employee not found.");

                        }


                        break;




                    case 3:

                        // Update salary


                        String updateId =
                                IO.readln("Enter employee ID: ");


                        int updateEmployeeId =
                                Integer.parseInt(updateId);



                        if (employeeSalaries.containsKey(updateEmployeeId)) {


                            String updatedSalary =
                                    IO.readln("Enter new salary: ");



                            double newSalary =
                                    Double.parseDouble(updatedSalary);



                            employeeSalaries.replace(
                                    updateEmployeeId,
                                    newSalary);



                            System.out.println(
                                    "Salary updated successfully.");


                        } else {


                            System.out.println(
                                    "Employee not found.");

                        }


                        break;




                    case 4:

                        // Remove employee


                        String removeId =
                                IO.readln("Enter employee ID: ");


                        int removeEmployeeId =
                                Integer.parseInt(removeId);



                        if (employeeSalaries.containsKey(removeEmployeeId)) {


                            employeeSalaries.remove(removeEmployeeId);


                            System.out.println(
                                    "Employee removed successfully.");


                        } else {


                            System.out.println(
                                    "Employee not found.");

                        }


                        break;




                    case 5:

                        // Display all employees


                        System.out.println(
                                "\n----- All Employees -----");


                        for (Integer id : employeeSalaries.keySet()) {


                            System.out.println(
                                    "Employee ID: "
                                            + id
                                            + " Salary: "
                                            + employeeSalaries.get(id));


                        }


                        break;




                    case 6:

                        // Display salary statistics


                        double highestSalary = Double.MIN_VALUE;
                        double lowestSalary = Double.MAX_VALUE;
                        double totalPayroll = 0;



                        for (double employeeSalary :
                                employeeSalaries.values()) {


                            if (employeeSalary > highestSalary) {

                                highestSalary = employeeSalary;

                            }


                            if (employeeSalary < lowestSalary) {

                                lowestSalary = employeeSalary;

                            }


                            totalPayroll += employeeSalary;


                        }



                        double averageSalary =
                                totalPayroll / employeeSalaries.size();



                        System.out.println(
                                "\n----- Salary Statistics -----");


                        System.out.println(
                                "Highest salary: "
                                        + highestSalary);


                        System.out.println(
                                "Lowest salary: "
                                        + lowestSalary);


                        System.out.println(
                                "Average salary: "
                                        + averageSalary);


                        System.out.println(
                                "Total payroll: "
                                        + totalPayroll);



                        break;




                    case 7:

                        System.out.println(
                                "Program exited.");

                        break;




                    default:

                        System.out.println(
                                "Invalid choice.");

                }



            } while (choice != 7);


        }


    }

}