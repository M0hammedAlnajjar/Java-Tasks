import java.util.HashMap;

public class StudentSetManager {

    public static void main(String[] args) {

        HashMap<String, Integer> studentScores = new HashMap<>();

        studentScores.put("Mohammed", 25);
        studentScores.put("Ali", 55);
        studentScores.put("Reship", 23);

        IO.println(studentScores);

        IO.println("Ali's score: " + studentScores.get("Ali"));



    }
}