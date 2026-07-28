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

        // Menu system
        int choice;


        do {

            System.out.println("\n===== University Course Registration System =====");
            System.out.println("1. Search Student");
            System.out.println("2. Add Course to Student");
            System.out.println("3. Remove Course from Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Display Registration Statistics");
            System.out.println("6. Exit");


            String menu = IO.readln("Enter your choice: ");
            choice = Integer.parseInt(menu);



            switch (choice) {

                case 1:

                    // Search student

                    String searchId = IO.readln("Enter student ID: ");
                    int searchStudentId = Integer.parseInt(searchId);


                    if (studentCourses.containsKey(searchStudentId)) {

                        System.out.println("Registered Courses: "
                                + studentCourses.get(searchStudentId));

                    } else {

                        System.out.println("Student not found.");

                    }

                    break;



                case 2:

                    // Add course

                    String addId = IO.readln("Enter student ID: ");
                    int addStudentId = Integer.parseInt(addId);


                    if (studentCourses.containsKey(addStudentId)) {


                        String newCourse = IO.readln("Enter course name: ");


                        HashSet<String> courses =
                                studentCourses.get(addStudentId);



                        if (courses.contains(newCourse)) {

                            System.out.println(
                                    "Course already registered.");

                        } else {

                            courses.add(newCourse);

                            System.out.println(
                                    "Course added successfully.");

                        }


                    } else {

                        System.out.println("Student not found.");

                    }


                    break;



                case 3:

                    // Remove course

                    String removeId = IO.readln("Enter student ID: ");
                    int removeStudentId = Integer.parseInt(removeId);


                    if (studentCourses.containsKey(removeStudentId)) {


                        String removeCourse =
                                IO.readln("Enter course name: ");


                        HashSet<String> courses =
                                studentCourses.get(removeStudentId);



                        if (courses.contains(removeCourse)) {


                            courses.remove(removeCourse);


                            System.out.println(
                                    "Course removed successfully.");


                        } else {


                            System.out.println(
                                    "Course not found.");

                        }


                    } else {

                        System.out.println("Student not found.");

                    }


                    break;




                case 4:

                    // Display all students


                    System.out.println("\n----- All Students -----");


                    for (Integer id : studentCourses.keySet()) {


                        System.out.println(
                                "Student ID: " + id);

                        System.out.println(
                                "Courses: "
                                        + studentCourses.get(id));


                    }


                    break;




                case 5:

                    // Registration statistics


                    int totalStudents = studentIds.size();

                    int totalCourses = 0;


                    int highestStudent = 0;
                    int lowestStudent = 0;


                    int highestCourses = -1;
                    int lowestCourses = Integer.MAX_VALUE;



                    for (Integer id : studentCourses.keySet()) {


                        int courseCount =
                                studentCourses.get(id).size();



                        totalCourses += courseCount;



                        if (courseCount > highestCourses) {

                            highestCourses = courseCount;
                            highestStudent = id;

                        }



                        if (courseCount < lowestCourses) {

                            lowestCourses = courseCount;
                            lowestStudent = id;

                        }


                    }



                    double averageCourses =
                            (double) totalCourses / totalStudents;



                    System.out.println("\n----- Statistics -----");

                    System.out.println(
                            "Total students: " + totalStudents);


                    System.out.println(
                            "Total course registrations: "
                                    + totalCourses);


                    System.out.println(
                            "Student with highest courses: "
                                    + highestStudent);



                    System.out.println(
                            "Student with lowest courses: "
                                    + lowestStudent);



                    System.out.println(
                            "Average courses per student: "
                                    + averageCourses);



                    break;




                case 6:

                    System.out.println(
                            "Program exited.");

                    break;



                default:

                    System.out.println(
                            "Invalid choice.");

            }



        } while (choice != 6);


    }

}

}

    }
