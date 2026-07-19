public class StudentListManager {
    public static void main(String[] args) {

        String[] students = new String[10];

        for (int i = 0; i < students.length; i++) {
            students[i] = IO.readln("Enter student name " + (i + 1) + ": ");
        }

        System.out.println("Student List:");

        for (String student : students) {
            System.out.println(student);
        }

        IO.println("Total number of students: " + students.length);


        IO.println("First student: " + students[0]);


        IO.println("Last student: " + students[students.length - 1]);



        String searchStudent = IO.readln("Enter a student name to search: ");

        boolean found = false;

        for (String student : students) {
            if (student.equalsIgnoreCase(searchStudent)) {
                found = true;
                break;
            }
        }

        if (found) {
            IO.println(searchStudent + " is in the list.");
        } else {
            IO.println(searchStudent + " is not in the list.");
        }


        String studentToRemove = IO.readln("Enter the student name to remove: ");

        boolean removed = false;

        for (int i = 0; i < students.length; i++) {
            if (students[i].equalsIgnoreCase(studentToRemove)) {
                students[i] = "";
                removed = true;
                break;
            }
        }

        if (removed) {
            IO.println(studentToRemove + " has been removed.");
        } else {
            IO.println(studentToRemove + " was not found.");
        }


    }
}