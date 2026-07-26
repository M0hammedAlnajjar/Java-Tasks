import java.util.HashSet;

public class StudentSetManager {

    public static void main(String[] args) {

        HashSet<String> studentScores = new HashSet<>();

        studentScores.add("Mohammed");
        studentScores.add("Ali");
        studentScores.add("Reship");

        IO.println(studentScores);


        IO.println("Ali's score: " + studentScores.contains("Ali"));

        String a1  =IO.readln("Enter your stdent ID : ");
        double A1=Double.parseDouble(a1);

        IO.println(" Enter your stdent ID : "+ a1);





    }
}