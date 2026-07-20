public class EmployeeSalaryCalculator {

    public static void main(String[] args) {


        String employeeName;
        double basicSalary;
        double bonusAmount;
        double deductionAmount;
        double netSalary;


        employeeName = IO.readln("Enter employee name: ");
        basicSalary = Double.parseDouble(IO.readln("Enter basic salary: "));
        bonusAmount = Double.parseDouble(IO.readln("Enter bonus amount: "));
        deductionAmount = Double.parseDouble(IO.readln("Enter deduction amount: "));


        netSalary = basicSalary + bonusAmount - deductionAmount;

        // Display employee salary details
        IO.println("\nEmployee Salary Details");
        IO.println("-----------------------");
        IO.println("Employee Name: " + employeeName);
        IO.println("Basic Salary: " + basicSalary);
        IO.println("Bonus Amount: " + bonusAmount);
        IO.println("Deduction Amount: " + deductionAmount);
        IO.println("Net Salary: " + netSalary);


        checkSalaryStatus(netSalary);
    }


    public static void checkSalaryStatus(double netSalary) {

        if (netSalary < 500) {
            IO.println("Salary Status: Low Salary");
        }
        else if (netSalary >= 500 && netSalary <= 1500) {
            IO.println("Salary Status: Medium Salary");
        }
        else {
            IO.println("Salary Status: High Salary");
        }
    }

    public static void displaySalaryDetails(String employeeName, double basicSalary,
                                            double bonusAmount, double deductionAmount,
                                            double netSalary, String salaryStatus) {
        IO.println("\nEmployee Salary Details");
        IO.println("-----------------------");
        IO.println("Employee Name: " + employeeName);
        IO.println("Basic Salary: " + basicSalary);
        IO.println("Bonus Amount: " + bonusAmount);
        IO.println("Deduction Amount: " + deductionAmount);
        IO.println("Net Salary: " + netSalary);
        IO.println("Salary Status: " + salaryStatus);
    }

}