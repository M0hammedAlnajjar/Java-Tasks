import java.util.HashMap;

public class StudentAttendanceManager {


    public static void main() {

        // Create HashMap to store student IDs and attendance days
        HashMap<Integer, Integer> attendanceRecords = new HashMap<>();

        // Declare variables
        String n = IO.readln("Enter number of student records: ");
        int numberOfStudents = Integer.parseInt(n);

        int studentId;
        int attendanceDays;
        int choice;

        // Check if number of students is valid
        if (numberOfStudents <= 0) {


            System.out.println("Invalid number of students.");


        } else {



            // Add initial attendance records
            for (int i = 0; i < numberOfStudents; i++) {


                String id = IO.readln("Enter student ID " + (i + 1) + ": ");
                studentId = Integer.parseInt(id);


                String days =
                        IO.readln("Enter attendance days: ");


                attendanceDays =
                        Integer.parseInt(days);



            }
}
