public class StudentResultAnalyzer {

    public static void main(String[] args) {


        String studentName = "Mohammed";
        double mathMark = 89;
        double englishMark = 100;
        double scienceMark = 85;


        double totalMarks;
        double averageMark;
        String grade;
        String resultStatus;


        IO.println("Student Name: " + studentName);
        IO.println("Math Mark: " + mathMark);
        IO.println("English Mark: " + englishMark);
        IO.println("Science Mark: " + scienceMark);


        IO.println("Math mark valid: " + validateMarks(mathMark));
        IO.println("English mark valid: " + validateMarks(englishMark));
        IO.println("Science mark valid: " + validateMarks(scienceMark));


        totalMarks = calculateTotalMarks(mathMark, englishMark, scienceMark);

        IO.println("Total Marks: " + totalMarks);
    }



    public static String validateMarks(double mark) {

        return (mark >= 0 && mark <= 100) ? "Valid Mark" : "Invalid Mark";
    }



    public static double calculateTotalMarks(double mathMark, double englishMark, double scienceMark) {

        double totalMarks;

        totalMarks = mathMark + englishMark + scienceMark;

        return totalMarks;
    }
}