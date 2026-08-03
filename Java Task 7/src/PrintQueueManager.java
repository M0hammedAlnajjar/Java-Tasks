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
        }
    }
}