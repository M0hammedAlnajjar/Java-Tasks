import java.util.ArrayList;

public class ScoreAnalysisAndManagementSystem {


    public class ScoreAnalysis {

        public static void main(String[] args) {

            // Create ArrayList
            ArrayList<Integer> scores = new ArrayList<>();

            // Ask user to enter 15 scores
            for (int i = 0; i < 15; i++) {

                String input = IO.readln("Enter score " + (i + 1) + ": ");
                int score = Integer.parseInt(input);

                scores.add(score);
            }

            // Display scores
            System.out.println("\nStudent Scores:");

            for (int i = 0; i < scores.size(); i++) {
                System.out.println("Score " + (i + 1) + ": " + scores.get(i));
            }

            // Display total number of scores
            System.out.println("Total number of scores: " + scores.size());


// Display scores with indexes
            System.out.println("\nScores with indexes:");

            for (int i = 0; i < scores.size(); i++) {
                System.out.println("Score " + i + ": " + scores.get(i));
            }
        }

        // Variables for statistics
        int totalScore = 0;
        int highestScore = scores.get(0);
        int lowestScore = scores.get(0);


// Calculate statistics
for (int i = 0; i < scores.size(); i++) {

            totalScore += scores.get(i);

            if (scores.get(i) > highestScore) {
                highestScore = scores.get(i);
            }

            if (scores.get(i) < lowestScore) {
                lowestScore = scores.get(i);
            }
        }


        // Calculate average using type casting
        double average = (double) totalScore / scores.size();


// Display results
System.out.println("Total Score: " + totalScore);
System.out.println("Average: " + average);
System.out.println("Highest Score: " + highestScore);
System.out.println("Lowest Score: " + lowestScore);
    }
}