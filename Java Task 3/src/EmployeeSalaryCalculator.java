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

        IO.println("\nEmployee Salary Details");
        IO.println("Employee Name: " + employeeName);
        IO.println("Basic Salary: " + basicSalary);
        IO.println("Bonus Amount: " + bonusAmount);
        IO.println("Deduction Amount: " + deductionAmount);
        IO.println("Net Salary: " + netSalary);
    }
}