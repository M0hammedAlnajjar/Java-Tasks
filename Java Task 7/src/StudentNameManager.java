public class StudentNameManager {

    static void main() {

        String [] student ={"mohammed ", "Ali", "noor"};

        String Student=IO.readln("Enter the numbers of students ");
        int d1=Integer.parseInt(Student);

        if (d1 <=0){
            IO.println("Invalid number of students");
        }
    }
}
