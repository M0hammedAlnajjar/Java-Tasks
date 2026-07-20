public class StudentResultAnalyzer {

    public static void main(String[] args) {

        // Store student information and marks
        String studentName = "Mohammed";
        double mathMark = 89;
        double englishMark = 100;
        double scienceMark = 85;

        // Declare calculation variables
        double totalMarks;
        double averageMark;
        String grade;
        String resultStatus;

        int numberOfSubjects = 3;


        // Validate all subject marks
        String mathValidation = validateMarks(mathMark);
        String englishValidation = validateMarks(englishMark);
        String scienceValidation = validateMarks(scienceMark);


        // Check if marks are valid
        if (mathValidation.equals("Invalid Mark") ||
                englishValidation.equals("Invalid Mark") ||
                scienceValidation.equals("Invalid Mark")) {

            IO.println("Invalid marks. Please check the student grades.");

        } else {


            // Calculate total marks
            totalMarks = calculateTotalMarks(mathMark, englishMark, scienceMark);


            // Calculate average mark
            averageMark = calculateAverage(totalMarks, numberOfSubjects);


            // Calculate final grade
            grade = calculateGrade(averageMark);


            // Calculate performance status
            resultStatus = checkPerformance(grade);


            // Display final student report
            displayReport(studentName, mathMark, englishMark, scienceMark,
                    totalMarks, averageMark, grade, resultStatus);

        }

    }


    // Method to validate marks
    public static String validateMarks(double mark) {

        return (mark >= 0 && mark <= 100) ? "Valid Mark" : "Invalid Mark";

    }


    // Method to calculate total marks
    public static double calculateTotalMarks(double mathMark,
                                             double englishMark,
                                             double scienceMark) {

        return mathMark + englishMark + scienceMark;

    }


    // Method to calculate average mark
    public static double calculateAverage(double totalMarks,
                                          int numberOfSubjects) {

        return totalMarks / numberOfSubjects;

    }


    // Method to calculate final grade
    public static String calculateGrade(double averageMark) {

        return averageMark >= 90 ? "A" :
                averageMark >= 80 ? "B" :
                averageMark >= 70 ? "C" :
                averageMark >= 60 ? "D" :
                "F";

    }


    // Method to check student performance
    public static String checkPerformance(String grade) {

        return grade.equals("A") ? "Excellent Performance" :
                grade.equals("B") ? "Very Good Performance" :
                grade.equals("C") ? "Good Performance" :
                grade.equals("D") ? "Average Performance" :
                "Needs Improvement";

    }


    // Method to display final student report
    public static void displayReport(String studentName,
                                     double mathMark,
                                     double englishMark,
                                     double scienceMark,
                                     double totalMarks,
                                     double averageMark,
                                     String grade,
                                     String resultStatus) {


        IO.println("\nStudent Result Report");
        IO.println("--------------------");

        IO.println("Student Name: " + studentName);

        IO.println("\nSubject Marks:");
        IO.println("Math Mark: " + mathMark);
        IO.println("English Mark: " + englishMark);
        IO.println("Science Mark: " + scienceMark);

        IO.println("\nResults:");
        IO.println("Total Marks: " + totalMarks);
        IO.println("Average Mark: " + averageMark);
        IO.println("Final Grade: " + grade);
        IO.println("Performance Status: " + resultStatus);

    }

}