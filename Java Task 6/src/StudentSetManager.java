import java.util.HashSet;

public class StudentSetManager {

    public static void main(String[] args) {

        HashSet<Integer> studentIDs = new HashSet<>();

        // Read number of students
        String n = IO.readln("Enter number of students: ");
        int numberOfStudents = Integer.parseInt(n);

        // Validate
        if (numberOfStudents <= 0) {

            IO.println("Invalid number of students.");

        } else {

            // Read student IDs
            for (int i = 1; i <= numberOfStudents; i++) {

                String s = IO.readln("Enter Student ID " + i + ": ");
                int id = Integer.parseInt(s);

                if (studentIDs.add(id)) {

                    IO.println("ID added successfully.");

                } else {

                    IO.println("Duplicate ID detected. ID was not added.");

                }
            }


            // Count unique IDs
            int uniqueIDs = studentIDs.size();


            // Classification
            String classification;

            if (uniqueIDs < 5) {

                classification = "Small Registration";

            } else if (uniqueIDs <= 10) {

                classification = "Medium Registration";

            } else {

                classification = "Large Registration";

            }


            // Display Report
            System.out.println("Total IDs entered: " + numberOfStudents);

            System.out.println("Total unique student IDs: " + uniqueIDs);

            System.out.println("All unique student IDs: " + studentIDs);

            System.out.println("Registration classification: " + classification);

        }

    }
}