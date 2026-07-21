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

// Ask user for index
String indexInput = IO.readln("Enter index: ");
int index = Integer.parseInt(indexInput);


// Ask user for new score
String scoreInput = IO.readln("Enter new score: ");
int newScore = Integer.parseInt(scoreInput);


// Update score
if (index >= 0 && index < scores.size()) {

        scores.set(index, newScore);

    System.out.println("Updated Scores:");

    System.out.println(scores);

} else {

        System.out.println("Invalid index.");
}


// Display before removal
        System.out.println("Before:");
System.out.println(scores);


// Remove score by value
String valueInput = IO.readln("Enter score to remove: ");
int removeValue = Integer.parseInt(valueInput);

if (scores.remove(Integer.valueOf(removeValue))) {
        System.out.println("Score removed.");
} else {
        System.out.println("Score not found.");
}


// Display after removing by value
        System.out.println("After removing value:");
System.out.println(scores);



// Remove score by index
String indexInput = IO.readln("Enter index to remove: ");
int removeIndex = Integer.parseInt(indexInput);


if (removeIndex >= 0 && removeIndex < scores.size()) {

        scores.remove(removeIndex);

    System.out.println("Index removed.");

} else {

        System.out.println("Invalid index.");
}


// Display final list
        System.out.println("Final Scores:");
System.out.println(scores);

// Create a copy of the score list
ArrayList<Integer> sortedScores = new ArrayList<>(scores);


// Sort from smallest to largest
sortedScores.sort(null);


// Display ascending order
System.out.println("Ascending:");
System.out.println(sortedScores);


// Reverse the sorted list
ArrayList<Integer> descendingScores = new ArrayList<>(sortedScores);
java.util.Collections.reverse(descendingScores);


// Display descending order
System.out.println("Descending:");
System.out.println(descendingScores);