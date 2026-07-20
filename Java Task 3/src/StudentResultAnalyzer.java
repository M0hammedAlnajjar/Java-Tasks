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

        // Display student information
        IO.println("Student Name: " + studentName);
        IO.println("Math Mark: " + mathMark);
        IO.println("English Mark: " + englishMark);
        IO.println("Science Mark: " + scienceMark);


        // Validate subject marks
        IO.println("Math mark valid: " + validateMarks(mathMark));
        IO.println("English mark valid: " + validateMarks(englishMark));
        IO.println("Science mark valid: " + validateMarks(scienceMark));


        // Calculate total marks
        totalMarks = calculateTotalMarks(mathMark, englishMark, scienceMark);

        IO.println("Total Marks: " + totalMarks);


        // Calculate average mark
        averageMark = calculateAverage(totalMarks, numberOfSubjects);

        IO.println("Average Mark: " + averageMark);


        // Calculate final grade
        grade = calculateGrade(averageMark);

        IO.println("Grade: " + grade);


        // Check student performance
        resultStatus = checkPerformance(grade);

        IO.println("Performance Status: " + resultStatus);


        // Display final report
        displayReport(studentName, mathMark, englishMark, scienceMark,
                totalMarks, averageMark, grade, resultStatus);

    }


    // Method to validate marks
    public static String validateMarks(double mark) {

        return (mark >= 0 && mark <= 100) ? "Valid Mark" : "Invalid Mark";
    }


    // Method to calculate total marks
    public static double calculateTotalMarks(double mathMark, double englishMark, double scienceMark) {

        return mathMark + englishMark + scienceMark;
    }


    // Method to calculate average mark
    public static double calculateAverage(double totalMarks, int numberOfSubjects) {

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
    public static void displayReport(String studentName, double mathMark,
                                     double englishMark, double scienceMark,
                                     double totalMarks, double averageMark,
                                     String grade, String resultStatus) {

        IO.println("\nStudent Result Report");
        IO.println("--------------------");
        IO.println("Student Name: " + studentName);
        IO.println("Math Mark: " + mathMark);
        IO.println("English Mark: " + englishMark);
        IO.println("Science Mark: " + scienceMark);
        IO.println("Total Marks: " + totalMarks);
        IO.println("Average Mark: " + averageMark);
        IO.println("Grade: " + grade);
        IO.println("Performance Status: " + resultStatus);
    }
}