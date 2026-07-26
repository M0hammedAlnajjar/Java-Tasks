import java.util.HashSet;

public class StudentSetManager {

    public static void main(String[] args) {

        // Create HashSet to store unique student IDs
        HashSet<Integer> studentIDs = new HashSet<>();


        // Read number of students
        String n = IO.readln("Enter number of students: ");
        int numberOfStudents = Integer.parseInt(n);


        // Validate number of students
        if (numberOfStudents <= 0) {

            IO.println("Invalid number of students.");

        } else {


            // Read student IDs
            for (int i = 1; i <= numberOfStudents; i++) {

                String s = IO.readln("Enter Student ID " + i + ": ");
                int id = Integer.parseInt(s);


                // Add ID and check duplicate
                if (studentIDs.add(id)) {

                    IO.println("ID added successfully.");

                } else {

                    IO.println("Duplicate ID detected. ID was not added.");

                }
            }


            // Count unique student IDs
            int uniqueIDs = studentIDs.size();


            // Registration classification using ternary operator
            String classification = uniqueIDs < 5 ? "Small Registration"
                    : uniqueIDs <= 10 ? "Medium Registration"
                    : "Large Registration";


            // Display final report
            System.out.println("Total IDs entered: " + numberOfStudents);

            System.out.println("Total unique student IDs: " + uniqueIDs);

            System.out.println("All unique student IDs: " + studentIDs);

            System.out.println("Registration classification: " + classification);

        }

    }
}