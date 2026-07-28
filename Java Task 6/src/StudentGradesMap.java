import java.util.HashMap;

public class StudentGradesMap {

    public static void main() {

        // Create HashMap to store student IDs and grades
        HashMap<Integer, Double> studentGrades = new HashMap<>();

        // Declare variables
        String n = IO.readln("Enter number of students: ");
        int numberOfStudents = Integer.parseInt(n);

        int studentId;
        double grade;
        int updateStudentId;
        double newGrade;
        double totalGrades = 0;
        double averageGrade;
        String classPerformance;

        // Check if number of students is valid
        if (numberOfStudents <= 0) {

            System.out.println("Invalid number of students.");

        } else {

            // Read student records
            for (int i = 0; i < numberOfStudents; i++) {

                String id = IO.readln("Enter student ID " + (i + 1) + ": ");
                studentId = Integer.parseInt(id);

                String g = IO.readln("Enter student grade: ");
                grade = Double.parseDouble(g);

                // Check for duplicate ID
                if (studentGrades.containsKey(studentId)) {

                    System.out.println("Student ID already exists. Record not added.");

                } else {

                    studentGrades.put(studentId, grade);

                }

            }

            // Update student grade
            String updateId = IO.readln("Enter student ID to update: ");
            updateStudentId = Integer.parseInt(updateId);

            if (studentGrades.containsKey(updateStudentId)) {

                String newG = IO.readln("Enter new grade: ");
                newGrade = Double.parseDouble(newG);

                // Replace old grade
                studentGrades.replace(updateStudentId, newGrade);

                System.out.println("Grade updated successfully.");

            } else {

                System.out.println("Student ID not found.");

            }

            // Calculate average grade
            for (double studentGrade : studentGrades.values()) {

                totalGrades += studentGrade;

            }

            averageGrade = totalGrades / studentGrades.size();

            // Classify class performance
            if (averageGrade < 60) {

                classPerformance = "Needs Improvement";

            } else if (averageGrade <= 84) {

                classPerformance = "Good Performance";

            } else {

                classPerformance = "Excellent Performance";

            }

            // Display results
            System.out.println("\n----- Student Grades Report -----");
            System.out.println("Total student records: " + studentGrades.size());
            System.out.println("Student Grades: " + studentGrades);
            System.out.println("Average grade: " + averageGrade);
            System.out.println("Class performance: " + classPerformance);

        }

    }

}