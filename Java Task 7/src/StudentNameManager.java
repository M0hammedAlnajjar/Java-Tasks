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

        }
    }
}