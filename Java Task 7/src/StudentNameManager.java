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
                        IO.println("Analyze Names");
                        break;

                    case 6:
                        IO.println("Compare Two Names");
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