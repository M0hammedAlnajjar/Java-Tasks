import java.util.HashMap;
import java.util.HashSet;

public class UniversityCourseRegistrationSystem {


    public static void main() {

        // Store unique student IDs
        HashSet<Integer> studentIds = new HashSet<>();

        // Store student IDs and their registered courses
        HashMap<Integer, HashSet<String>> studentCourses = new HashMap<>();

        // Declare variables
        String n = IO.readln("Enter number of students: ");
        int numberOfStudents = Integer.parseInt(n);

        int studentId;
        String courseName;


        // Check number of students
        if (numberOfStudents <= 0) {

            System.out.println("Invalid number of students.");

        } else {


            // Add students and courses
            for (int i = 0; i < numberOfStudents; i++) {


                String id = IO.readln("Enter student ID " + (i + 1) + ": ");
                studentId = Integer.parseInt(id);

            }


            // Check duplicate student ID
            if (studentIds.contains(studentId)) {

                System.out.println("Student ID already exists. Record skipped.");

            } else {

                studentIds.add(studentId);


                String courseNumber = IO.readln("Enter number of courses: ");
                int numberOfCourses = Integer.parseInt(courseNumber);


                HashSet<String> courses = new HashSet<>();

            }

            // Add courses
            for (int j = 0; j < numberOfCourses; j++) {

                courseName = IO.readln("Enter course name: ");

                courses.add(courseName);

            }


            studentCourses.put(studentId, courses);

        }

    }
