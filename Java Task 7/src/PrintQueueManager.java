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








                }

            } while (option != 8);
        }
    }
}