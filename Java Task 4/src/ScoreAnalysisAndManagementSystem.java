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


// Counters
int passed = 0;
int failed = 0;
int excellent = 0;
int lowGrades = 0;


// Analyze scores
for (int i = 0; i < scores.size(); i++) {

int score = scores.get(i);

    if (score >= 60) {
passed++;
        }
        else {
failed++;
        }


        if (score >= 90) {
excellent++;
        }


        if (score < 50) {
lowGrades++;
        }
        }


// Display results
        System.out.println("Passed: " + passed);
System.out.println("Failed: " + failed);
System.out.println("Excellent: " + excellent);
System.out.println("Low Grades: " + lowGrades);

}
}

// Ask user for score to search
String searchInput = IO.readln("Enter score: ");
int searchScore = Integer.parseInt(searchInput);


// Variables
int firstPosition = -1;
int occurrences = 0;


// Search in ArrayList
for (int i = 0; i < scores.size(); i++) {

        if (scores.get(i) == searchScore) {

        if (firstPosition == -1) {
firstPosition = i;
        }

occurrences++;
        }
        }


// Display result
        if (occurrences > 0) {

        System.out.println("Score found.");
    System.out.println("First Position: " + firstPosition);
    System.out.println("Occurrences: " + occurrences);

} else {

        System.out.println("Score not found.");
}