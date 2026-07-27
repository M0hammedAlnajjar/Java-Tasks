import java.util.HashSet;

public class CourseEnrollmentSet {
    static void main() {

        HashSet<Integer>  CourseNames = new HashSet<>();

        String courses =IO.readln("Enter the number of courses  : ");
        Integer b1 =Integer.parseInt(courses);

        if (b1<=0){
            IO.println("Invalid number of courses ");
        }

    }
}
