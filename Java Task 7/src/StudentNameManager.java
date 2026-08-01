public class StudentNameManager {

    public static void main(String[] args) {

        String Student = IO.readln("Enter the number of students: ");
        int d1 = Integer.parseInt(Student);

        if (d1 <= 0) {

            IO.println("Invalid number of students.");

        } else {

            String[] student = new String[d1];

            for (int i = 0; i < d1; i++) {

                student[i] = IO.readln("Enter student name " + (i + 1) + ": ");

            }
            int choice;

            do {

                IO.println("\n===== Student Name Manager =====");
                IO.println("1. Add Student Name");
                IO.println("2. Search Student Name");
                IO.println("3. Update Student Name");
                IO.println("4. Display All Student Names");
                IO.println("5. Analyze Names");
                IO.println("6. Compare Two Names");
                IO.println("7. Exit");

                choice = Integer.parseInt(IO.readln("Enter your choice: "));

                switch (choice) {

                    case 1:

                        String newName = IO.readln("Enter student name: ");

                        boolean exists = false;

                        for (int i = 0; i < student.length; i++) {

                            if (student[i] != null && student[i].equals(newName)) {

                                exists = true;
                                break;

                            }

                        }

                        if (exists) {

                            IO.println("Student name already exists.");

                        } else {

                            for (int i = 0; i < student.length; i++) {

                                if (student[i] == null) {

                                    student[i] = newName;
                                    IO.println("Student name added successfully.");
                                    break;

                                }

                            }

                        }

                        break;

                    case 2:

                        String searchName = IO.readln("Enter student name to search: ");

                        boolean found = false;

                        for (int i = 0; i < student.length; i++) {

                            if (student[i] != null && student[i].equals(searchName)) {

                                found = true;
                                break;

                            }

                        }

                        if (found) {

                            IO.println("Student found.");

                        } else {

                            IO.println("Student not found.");

                        }

                        break;

                    case 3:

                        String oldName = IO.readln("Enter existing student name: ");
                        String newName = IO.readln("Enter new student name: ");

                        boolean updated = false;

                        for (int i = 0; i < student.length; i++) {

                            if (student[i] != null && student[i].equals(oldName)) {

                                student[i] = newName;
                                updated = true;
                                break;

                            }

                        }

                        if (updated) {

                            IO.println("Student name updated successfully.");

                        } else {

                            IO.println("Student not found.");

                        }

                        break;

                    case 4:

                        int number = 1;

                        for (int i = 0; i < student.length; i++) {

                            if (student[i] != null) {

                                IO.println(number + ". " + student[i]);
                                number++;

                            }

                        }

                        break;
                    case 5:

                        int totalStudents = 0;
                        int totalCharacters = 0;

                        String longestName = "";
                        String shortestName = "";

                        int startWithA = 0;
                        int endWithA = 0;


                        for (int i = 0; i < student.length; i++) {

                            if (student[i] != null) {

                                totalStudents++;

                                int length = student[i].length();

                                totalCharacters += length;


                                // Find longest name
                                if (student[i].length() > longestName.length()) {

                                    longestName = student[i];

                                }


                                // Find shortest name
                                if (shortestName.equals("") || student[i].length() < shortestName.length()) {

                                    shortestName = student[i];

                                }


                                // Names starting with A
                                if (student[i].startsWith("A")) {

                                    startWithA++;

                                }


                                // Names ending with a
                                if (student[i].endsWith("a")) {

                                    endWithA++;

                                }

                            }

                        }


                        double averageLength = 0;

                        if (totalStudents > 0) {

                            averageLength = (double) totalCharacters / totalStudents;

                        }


                        IO.println("Total number of students: " + totalStudents);
                        IO.println("Longest student name: " + longestName);
                        IO.println("Shortest student name: " + shortestName);
                        IO.println("Total characters: " + totalCharacters);
                        IO.println("Average name length: " + averageLength);
                        IO.println("Names starting with A: " + startWithA);
                        IO.println("Names ending with a: " + endWithA);


                        break;

                    case 6:

                        String firstName = IO.readln("Enter first student name: ");
                        String secondName = IO.readln("Enter second student name: ");


                        // equals()
                        if (firstName.equals(secondName)) {

                            IO.println("equals(): Names are exactly the same.");

                        } else {

                            IO.println("equals(): Names are different.");

                        }


                        // equalsIgnoreCase()
                        if (firstName.equalsIgnoreCase(secondName)) {

                            IO.println("equalsIgnoreCase(): Names are the same ignoring case.");

                        } else {

                            IO.println("equalsIgnoreCase(): Names are different.");

                        }


                        // compareTo()
                        int result = firstName.compareTo(secondName);


                        if (result == 0) {

                            IO.println("compareTo(): Names are equal.");

                        } else if (result > 0) {

                            IO.println("compareTo(): First name comes after second name.");

                        } else {

                            IO.println("compareTo(): First name comes before second name.");

                        }


                        break;
                    case 7:
                        IO.println("Goodbye!");
                        break;

                    default:
                        IO.println("Invalid choice.");

                }

            } while (choice != 7);
        }
    }
}