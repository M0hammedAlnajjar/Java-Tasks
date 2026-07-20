public class StudentResultAnalyzer {

    public static void main(String[] args) {


        String studentName = "MOhammed";
        double mathMark=89;
        double englishMark=100;
        double scienceMark=85;
        double totalMarks;
        double averageMark;
        String grade;
        String resultStatus;



        IO.println("Student Name: " + studentName);
        IO.println("Math Mark: " + mathMark);
        IO.println("English Mark: " + englishMark);
        IO.println("Science Mark: " + scienceMark);




    }

    public static void validateMarks(double  mark) {

        if (mark>=0 && mark<=100) {
            IO.println("true");

        }else{
            IO.println(" false");

        }

    }
}