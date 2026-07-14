public class StudentGradeCalculator {

}
    public static void main(String[] args) {

    var grade1=95;
    var grade2=75;
    var grade3=60;
    var average=0.0;
    String status;
    average = (grade1+grade2+grade3)/ 3.0;
    IO.println("Average " +average);

        if (average >= 90) {
            status = "Excellent";
        }
        else if (average >= 75) {
            status = "Good";
        }
        else if (average >= 60) {
            status = "Pass";
        }
        else {
            status = "Fail";
        }


        System.out.println("Grade 1: " + grade1);
        System.out.println("Grade 2: " + grade2);
        System.out.println("Grade 3: " + grade3);
        System.out.println("Average " + average);
        System.out.println("status: " + status);




}
