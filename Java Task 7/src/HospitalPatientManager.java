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


            int option;

            do {
                // Display hospital menu
                IO.println("\n----- Hospital Patient Menu -----");
                IO.println("1. Add Patient");
                IO.println("2. Treat Patient");
                IO.println("3. View Next Patient");
                IO.println("4. Undo Last Treatment");
                IO.println("5. Search Patient");
                IO.println("6. Display Waiting Patients");
                IO.println("7. Display Treated Patients");
                IO.println("8. Display Hospital Statistics");
                IO.println("9. Exit");

                // Read user's choice
                String choice = IO.readln("Enter your choice: ");
                option = Integer.parseInt(choice);

                // Process menu selection
                switch (option) {

                    case 1:
                        // Add patient to waiting queue
                        String newPatient = IO.readln("Enter patient name: ");

                        PatientNames.offer(newPatient);

                        IO.println("Patient added successfully.");
                        break;


                    case 2:
                        // Treat patient and move to treatment stack
                        if (PatientNames.isEmpty()) {

                            IO.println("No patients waiting for treatment.");

                        } else {

                            String treatedPatient = PatientNames.poll();

                            CompletedPatient.push(treatedPatient);

                            IO.println("Patient treatment completed successfully.");
                        }
                        break;
                    case 3:
                        // View next patient in queue
                        if (PatientNames.isEmpty()) {

                            IO.println("No patients available.");

                        } else {

                            IO.println("Next patient: " + PatientNames.peek());
                        }
                        break;

                    case 4:
                        // Undo last treatment
                        if (CompletedPatient.isEmpty()) {

                            IO.println("No completed treatments available.");

                        } else {

                            String undoPatient = CompletedPatient.pop();

                            IO.println("Treatment undone for patient: " + undoPatient);
                        }
                        break;
                    case 5:
                        // Search patient in queue and stack
                        String searchPatient = IO.readln("Enter patient name to search: ");

                        if (PatientNames.contains(searchPatient)) {

                            IO.println("Patient is waiting for treatment.");

                        } else if (CompletedPatient.search(searchPatient) != -1) {

                            IO.println("Patient treatment completed.");

                        } else {

                            IO.println("Patient not found.");
                        }
                        break;
                    case 6:
                        IO.println("Display Waiting Patients selected.");
                        break;

                    case 7:
                        IO.println("Display Treated Patients selected.");
                        break;

                    case 8:
                        IO.println("Display Hospital Statistics selected.");
                        break;

                    case 9:
                        IO.println("Exiting Hospital Patient System.");
                        break;

                    default:
                        IO.println("Invalid option. Please try again.");
                }

            } while (option != 9);
        }
    }
}