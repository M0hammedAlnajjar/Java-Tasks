import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class HospitalPatientManager {

    static void main(String[] args) {

        Queue<String> PatientNames = new LinkedList<>();

        Stack<String> CompletedPatient = new Stack<>();

        String patients = IO.readln("Enter the number of patients waiting: ");
        int number = Integer.parseInt(patients);

        if (number <= 0) {
            IO.println("Invalid number of patients");

        } else {

            for (int i = 0; i < number; i++) {

                String patient = IO.readln("Enter the patient name: ");

                PatientNames.add(patient);
            }
        }
    }
}