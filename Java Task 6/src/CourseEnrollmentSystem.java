import java.util.HashMap;
import java.util.HashSet;

public class CourseEnrollmentSystem {
    public static void main() {


        // Create HashSet to store unique student IDs
        HashSet<Integer> studentIds = new HashSet<>();

        // Create HashMap to store student IDs and course names
        HashMap<Integer, String> studentCourses = new HashMap<>();

// Declare variables
        String n = IO.readln("Enter number of students: ");
        int numberOfStudents = Integer.parseInt(n);

        int studentId;
        String courseName;
        int updateStudentId;
        String newCourseName;
        String enrollmentClassification;
    }

    // Check if number of students is valid
        if (numberOfStudents <= 0) {

        System.out.println("Invalid number of students.");
    } else

    {

        // Read student records
        for (int i = 0; i < numberOfStudents; i++) {

            String id = IO.readln("Enter student ID " + (i + 1) + ": ");
            studentId = Integer.parseInt(id);

            courseName = IO.readln("Enter course name: ");

        }

        // Check if student ID already exists
        if (studentIds.contains(studentId)) {

            System.out.println("Student ID already exists. Record not added.");

        } else {

            // Add student ID to HashSet
            studentIds.add(studentId);

            // Add student ID and course to HashMap
            studentCourses.put(studentId, courseName);

        }


        // Update student course
        String updateId = IO.readln("Enter student ID to update course: ");
        updateStudentId = Integer.parseInt(updateId);

    }

    // Check if student exists
            if (studentCourses.containsKey(updateStudentId)) {

        newCourseName = IO.readln("Enter new course name: ");

}}