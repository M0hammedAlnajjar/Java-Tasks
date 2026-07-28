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



                // Check duplicate student ID
                if (attendanceRecords.containsKey(studentId)) {


                    System.out.println(
                            "Student ID already exists. Record not added.");


                } else {


                    attendanceRecords.put(
                            studentId,
                            attendanceDays);


                }


            }




            // Menu system
            do {


                System.out.println("\n===== Student Attendance Management =====");
                System.out.println("1. Add Student Record");
                System.out.println("2. Search Student Attendance");
                System.out.println("3. Update Attendance");
                System.out.println("4. Remove Student Record");
                System.out.println("5. Display All Attendance Records");
                System.out.println("6. Display Attendance Statistics");
                System.out.println("7. Exit");



                String menu =
                        IO.readln("Enter your choice: ");


                choice =
                        Integer.parseInt(menu);




                switch (choice) {



                    case 1:

                        // Add student record


                        String newId =
                                IO.readln("Enter student ID: ");


                        int addStudentId =
                                Integer.parseInt(newId);



                        if (attendanceRecords.containsKey(addStudentId)) {


                            System.out.println(
                                    "Student ID already exists. Record not added.");


                        } else {


                            String newDays =
                                    IO.readln("Enter attendance days: ");


                            int addDays =
                                    Integer.parseInt(newDays);



                            attendanceRecords.put(
                                    addStudentId,
                                    addDays);



                            System.out.println(
                                    "Student record added successfully.");

                        }


                        break;




                    case 2:

                        // Search student attendance


                        String searchId =
                                IO.readln("Enter student ID: ");


                        int searchStudentId =
                                Integer.parseInt(searchId);



                        if (attendanceRecords.containsKey(searchStudentId)) {


                            System.out.println(
                                    "Attendance Days: "
                                            + attendanceRecords.get(searchStudentId));


                        } else {


                            System.out.println(
                                    "Student not found.");

                        }


                        break;





                    case 3:

                        // Update attendance


                        String updateId =
                                IO.readln("Enter student ID: ");


                        int updateStudentId =
                                Integer.parseInt(updateId);



                        if (attendanceRecords.containsKey(updateStudentId)) {



                            String updatedDays =
                                    IO.readln("Enter new attendance days: ");



                            int newAttendanceDays =
                                    Integer.parseInt(updatedDays);



                            attendanceRecords.replace(
                                    updateStudentId,
                                    newAttendanceDays);



                            System.out.println(
                                    "Attendance updated successfully.");



                        } else {


                            System.out.println(
                                    "Student not found.");

                        }


                        break;





                    case 4:

                        // Remove student record


                        String removeId =
                                IO.readln("Enter student ID: ");



                        int removeStudentId =
                                Integer.parseInt(removeId);



                        if (attendanceRecords.containsKey(removeStudentId)) {


                            attendanceRecords.remove(removeStudentId);


                            System.out.println(
                                    "Student record removed successfully.");



                        } else {


                            System.out.println(
                                    "Student not found.");

                        }


                        break;





                    case 5:

                        // Display all attendance records


                        System.out.println(
                                "\n----- Attendance Records -----");



                        for (Integer id :
                                attendanceRecords.keySet()) {


                            System.out.println(
                                    "Student ID: "
                                            + id
                                            + " Attendance Days: "
                                            + attendanceRecords.get(id));


                        }


                        break;





                    case 6:

                        // Display attendance statistics


                        int totalStudents =
                                attendanceRecords.size();


                        int totalAttendanceDays = 0;


                        int highestAttendance = Integer.MIN_VALUE;

                        int lowestAttendance = Integer.MAX_VALUE;


                        int highestStudentId = 0;

                        int lowestStudentId = 0;




                        // Use entrySet to process records
                        for (var entry :
                                attendanceRecords.entrySet()) {



                            int id =
                                    entry.getKey();


                            int days =
                                    entry.getValue();



                            totalAttendanceDays += days;



                            if (days > highestAttendance) {


                                highestAttendance = days;

                                highestStudentId = id;


                            }



                            if (days < lowestAttendance) {


                                lowestAttendance = days;

                                lowestStudentId = id;


                            }


                        }





                        double averageAttendance =
                                (double) totalAttendanceDays / totalStudents;




                        System.out.println(
                                "\n----- Attendance Statistics -----");


                        System.out.println(
                                "Total students: "
                                        + totalStudents);



                        System.out.println(
                                "Total attendance days: "
                                        + totalAttendanceDays);



                        System.out.println(
                                "Average attendance: "
                                        + averageAttendance);



                        System.out.println(
                                "Student with highest attendance: "
                                        + highestStudentId);



                        System.out.println(
                                "Student with lowest attendance: "
                                        + lowestStudentId);



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