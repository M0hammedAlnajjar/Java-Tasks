import java.util.Queue;
import java.util.LinkedList;

public class PrintQueueManager {

    static void main(String[] args) {

        Queue<String> jobname = new LinkedList<>();

        String jobs = IO.readln("Enter the number of print jobs: ");
        int number = Integer.parseInt(jobs);

        if (number <= 0) {

            IO.println("Invalid number of print jobs");

        } else {

            for (int i = 0; i < number; i++) {

                String jobName = IO.readln("Enter print job name: ");
                jobname.offer(jobName);
            }

            int option;


            do {

                IO.println("\n----- Print Queue Menu -----");
                IO.println("1. Add Print Job");
                IO.println("2. Process Next Print Job");
                IO.println("3. View Next Print Job");
                IO.println("4. Search Print Job");
                IO.println("5. Remove Print Job");
                IO.println("6. Display All Print Jobs");
                IO.println("7. Display Queue Statistics");
                IO.println("8. Exit");

                String choice = IO.readln("Enter your choice: ");
                option = Integer.parseInt(choice);

                switch (option) {

                    // Add a new print job
                    case 1:
                        String newJob = IO.readln("Enter print job name: ");
                        jobname.offer(newJob);
                        IO.println("Print job added successfully.");
                        break;
                    // Process the next print job
                    case 2:
                        if (jobname.isEmpty()) {
                            IO.println("No print jobs in the queue.");
                        } else {
                            String processedJob = jobname.poll();
                            IO.println("Processed print job: " + processedJob);
                        }
                        break;

                    // View the next print job
                    case 3:
                        if (jobname.isEmpty()) {
                            IO.println("No print jobs in the queue.");
                        } else {
                            IO.println("Next print job: " + jobname.peek());
                        }
                        break;


                    // Search for a print job
                    case 4:
                        String searchJob = IO.readln("Enter print job name to search: ");

                        if (jobname.contains(searchJob)) {
                            IO.println("Print job found.");
                        } else {
                            IO.println("Print job not found.");
                        }
                        break;

                    // Remove a specific print job
                    case 5:
                        String removeJob = IO.readln("Enter print job name to remove: ");

                        if (jobname.remove(removeJob)) {
                            IO.println("Print job removed successfully.");
                        } else {
                            IO.println("Print job not found.");
                        }
                        break;
                    // Display all print jobs
                    case 6:
                        if (jobname.isEmpty()) {
                            IO.println("No print jobs in the queue.");
                        } else {
                            IO.println("All Print Jobs:");

                            for (String job : jobname) {
                                IO.println(job);
                            }
                        }
                        break;

                    // Exit the program
                    case 8:
                        IO.println("Exiting Print Queue Manager.");
                        break;









                }

            } while (option != 8);
        }
    }
}