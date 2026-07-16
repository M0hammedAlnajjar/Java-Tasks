public class StudentListManager {
    public static void main(String[] args) {

        String[] students = new String[3];

        students[0] = IO.readln("Enter student name: ");
        students[1] = IO.readln("Enter student name: ");
        students[2] = IO.readln("Enter student name: ");

        System.out.println("Student List:");

        for (String student : students) {
            System.out.println(student);
        }
    }
}