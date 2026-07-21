import java.util.ArrayList;
import java.util.Collections;

public class ScoreAnalysisAndManagementSystem {

    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<Integer> scores = new ArrayList<>();


        // 1. Create Score List
        for (int i = 0; i < 15; i++) {

            String input = IO.readln("Enter score " + (i + 1) + ": ");
            int score = Integer.parseInt(input);

            scores.add(score);
        }


        // 2. Display Score Information
        System.out.println("\nStudent Scores:");

        for (int i = 0; i < scores.size(); i++) {
            System.out.println("Score " + i + ": " + scores.get(i));
        }

        System.out.println("Total number of scores: " + scores.size());



        // 3. Calculate Score Statistics

        int totalScore = 0;
        int highestScore = scores.get(0);
        int lowestScore = scores.get(0);


        for (int i = 0; i < scores.size(); i++) {

            totalScore += scores.get(i);

            if (scores.get(i) > highestScore) {
                highestScore = scores.get(i);
            }

            if (scores.get(i) < lowestScore) {
                lowestScore = scores.get(i);
            }
        }


        double average = (double) totalScore / scores.size();


        System.out.println("\nStatistics:");
        System.out.println("Total Score: " + totalScore);
        System.out.println("Average: " + average);
        System.out.println("Highest Score: " + highestScore);
        System.out.println("Lowest Score: " + lowestScore);



        // 4. Score Classification

        int passed = 0;
        int failed = 0;
        int excellent = 0;
        int lowGrades = 0;


        for (int i = 0; i < scores.size(); i++) {

            int score = scores.get(i);


            if (score >= 60) {
                passed++;
            } else {
                failed++;
            }


            if (score >= 90) {
                excellent++;
            }


            if (score < 50) {
                lowGrades++;
            }
        }


        System.out.println("\nClassification:");
        System.out.println("Passed: " + passed);
        System.out.println("Failed: " + failed);
        System.out.println("Excellent: " + excellent);
        System.out.println("Low Grades: " + lowGrades);



        // 5. Search Score System

        String searchInput = IO.readln("\nEnter score to search: ");
        int searchScore = Integer.parseInt(searchInput);


        int firstPosition = -1;
        int occurrences = 0;


        for (int i = 0; i < scores.size(); i++) {

            if (scores.get(i) == searchScore) {

                if (firstPosition == -1) {
                    firstPosition = i;
                }

                occurrences++;
            }
        }


        if (occurrences > 0) {

            System.out.println("Score found.");
            System.out.println("First Position: " + firstPosition);
            System.out.println("Occurrences: " + occurrences);

        } else {

            System.out.println("Score not found.");
        }



        // 6. Update Score System

        String indexInput = IO.readln("\nEnter index to update: ");
        int index = Integer.parseInt(indexInput);


        String newScoreInput = IO.readln("Enter new score: ");
        int newScore = Integer.parseInt(newScoreInput);


        if (index >= 0 && index < scores.size()) {

            scores.set(index, newScore);

            System.out.println("Updated Scores:");
            System.out.println(scores);

        } else {

            System.out.println("Invalid index.");
        }



        // 7. Remove Score System

        System.out.println("\nBefore Removal:");
        System.out.println(scores);


        String removeInput = IO.readln("Enter score to remove: ");
        int removeScore = Integer.parseInt(removeInput);


        if (scores.remove(Integer.valueOf(removeScore))) {

            System.out.println("Score removed.");

        } else {

            System.out.println("Score not found.");
        }


        System.out.println("After removing value:");
        System.out.println(scores);



        String removeIndexInput = IO.readln("Enter index to remove: ");
        int removeIndex = Integer.parseInt(removeIndexInput);


        if (removeIndex >= 0 && removeIndex < scores.size()) {

            scores.remove(removeIndex);

            System.out.println("Index removed.");

        } else {

            System.out.println("Invalid index.");
        }


        System.out.println("Final Scores:");
        System.out.println(scores);



        // 8. Sorting and Reversing Scores

        ArrayList<Integer> sortedScores = new ArrayList<>(scores);


        Collections.sort(sortedScores);


        System.out.println("\nAscending:");
        System.out.println(sortedScores);


        Collections.reverse(sortedScores);


        System.out.println("Descending:");
        System.out.println(sortedScores);



        // 9. Clear Score Data

        scores.clear();


        System.out.println("\nAfter Clear:");
        System.out.println(scores);


        System.out.println("Is Empty: " + scores.isEmpty());

    }
}