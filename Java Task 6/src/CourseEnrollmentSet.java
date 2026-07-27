import java.util.HashSet;

public class CourseEnrollmentSet {
    static void main() {

        HashSet<Integer> courseNames = new HashSet<>();

        String courses = IO.readln("Enter the number of courses: ");
        int b1 = Integer.parseInt(courses);

        if (b1 <= 0) {
            IO.println("Invalid number of courses");
        } else {

            for (int i = 1; i <= b1; i++) {
                String a = IO.readln("Enter course ID " + i + ": ");
                int id = Integer.parseInt(a);

                if (courseNames.add(id)) {
                    IO.println("Course added successfully.");
                } else {
                    IO.println("Duplicate entries are not allowed.");
                }
            }

            // Remove a course
            String removeCourse = IO.readln("Enter course ID to remove: ");
            int removeId = Integer.parseInt(removeCourse);

            if (courseNames.remove(removeId)) {
                IO.println("Course removed successfully.");
            } else {
                IO.println("Course not found.");
            }
        }
        int uniqueIDs = courseNames.size();
        String  classification = uniqueIDs <4? "Small Course Catalog":uniqueIDs<=10?"Medium Registration":" Large Registration ";


        IO.println();

    }
}