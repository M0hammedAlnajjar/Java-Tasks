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
    }
}